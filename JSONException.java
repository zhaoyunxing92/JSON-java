package org.json;

/**
 * The JSONException is thrown by the JSON.org classes when things are amiss.
 *
 * @author JSON.org
 * @version 2014-05-03
 */
public class JSONException extends RuntimeException {
    /** Serialization ID */
    private static final long serialVersionUID = 0;

    /**
     * Constructs a JSONException with an explanatory message.
     *
     * @param message
     *            Detail about the reason for the exception.
     */
    public JSONException(final String message) {
	super(message);
    }

    /**
     * @param message
     *            Detail about the reason for the exception.
     * @param cause
     *            The cause.
     */
    public JSONException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * Constructs a new JSONException with the specified cause.
     * 
     * @param cause
     *            The cause.
     */
    public JSONException(final Throwable cause) {
	super(cause.getMessage(), cause);
    }

}
