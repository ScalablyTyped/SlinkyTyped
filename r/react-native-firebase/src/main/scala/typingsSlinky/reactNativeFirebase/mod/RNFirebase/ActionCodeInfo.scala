package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import typingsSlinky.reactNativeFirebase.anon.Email
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.EMAIL_SIGNIN
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ERROR
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.PASSWORD_RESET
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.RECOVER_EMAIL
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.VERIFY_EMAIL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionCodeInfo extends StObject {
  
  var data: Email = js.native
  
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR = js.native
}
object ActionCodeInfo {
  
  @scala.inline
  def apply(data: Email, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeInfo]
  }
  
  @scala.inline
  implicit class ActionCodeInfoMutableBuilder[Self <: ActionCodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Email): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
