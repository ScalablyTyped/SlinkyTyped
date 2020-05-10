package typingsSlinky.firebaseAdmin.admin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `FirebaseError` is a subclass of the standard JavaScript `Error` object. In
  * addition to a message string and stack trace, it contains a string code.
  */
@js.native
trait FirebaseError extends js.Object {
  /**
    * Error codes are strings using the following format: `"service/string-code"`.
    * Some examples include `"auth/invalid-uid"` and
    * `"messaging/invalid-recipient"`.
    *
    * While the message for a given error can change, the code will remain the same
    * between backward-compatible versions of the Firebase SDK.
    */
  var code: String = js.native
  /**
    * An explanatory message for the error that just occurred.
    *
    * This message is designed to be helpful to you, the developer. Because
    * it generally does not convey meaningful information to end users,
    * this message should not be displayed in your application.
    */
  var message: String = js.native
  /**
    * A string value containing the execution backtrace when the error originally
    * occurred.
    *
    * This information can be useful to you and can be sent to
    * {@link https://firebase.google.com/support/ Firebase Support} to help
    * explain the cause of an error.
    */
  var stack: String = js.native
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}

object FirebaseError {
  @scala.inline
  def apply(code: String, message: String, stack: String, toJSON: () => js.Object): FirebaseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[FirebaseError]
  }
  @scala.inline
  implicit class FirebaseErrorOps[Self <: FirebaseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

