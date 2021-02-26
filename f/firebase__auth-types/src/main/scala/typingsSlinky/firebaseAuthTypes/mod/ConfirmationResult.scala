package typingsSlinky.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmationResult extends StObject {
  
  def confirm(verificationCode: String): js.Promise[UserCredential] = js.native
  
  var verificationId: String = js.native
}
object ConfirmationResult {
  
  @scala.inline
  def apply(confirm: String => js.Promise[UserCredential], verificationId: String): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationResult]
  }
  
  @scala.inline
  implicit class ConfirmationResultMutableBuilder[Self <: ConfirmationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirm(value: String => js.Promise[UserCredential]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
  }
}
