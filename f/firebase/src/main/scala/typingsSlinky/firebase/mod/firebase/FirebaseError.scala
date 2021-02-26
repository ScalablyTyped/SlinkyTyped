package typingsSlinky.firebase.mod.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `FirebaseError` is a subclass of the standard JavaScript `Error` object. In
  * addition to a message string and stack trace, it contains a string code.
  */
@js.native
trait FirebaseError extends StObject {
  
  /**
    * Error codes are strings using the following format: `"service/string-code"`.
    * Some examples include `"app/no-app"` and `"auth/user-not-found"`.
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
    * The name of the class of errors, which is `"FirebaseError"`.
    */
  var name: String = js.native
  
  /**
    * A string value containing the execution backtrace when the error originally
    * occurred. This may not always be available.
    *
    * When it is available, this information can be sent to
    * {@link https://firebase.google.com/support/ Firebase Support} to help
    * explain the cause of an error.
    */
  var stack: js.UndefOr[String] = js.native
}
object FirebaseError {
  
  @scala.inline
  def apply(code: String, message: String, name: String): FirebaseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseError]
  }
  
  @scala.inline
  implicit class FirebaseErrorMutableBuilder[Self <: FirebaseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
