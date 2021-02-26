package typingsSlinky.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoConfirmUser extends StObject {
  
  var autoConfirmUser: Boolean = js.native
  
  var autoVerifyEmail: Boolean = js.native
  
  var autoVerifyPhone: Boolean = js.native
}
object AutoConfirmUser {
  
  @scala.inline
  def apply(autoConfirmUser: Boolean, autoVerifyEmail: Boolean, autoVerifyPhone: Boolean): AutoConfirmUser = {
    val __obj = js.Dynamic.literal(autoConfirmUser = autoConfirmUser.asInstanceOf[js.Any], autoVerifyEmail = autoVerifyEmail.asInstanceOf[js.Any], autoVerifyPhone = autoVerifyPhone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoConfirmUser]
  }
  
  @scala.inline
  implicit class AutoConfirmUserMutableBuilder[Self <: AutoConfirmUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoConfirmUser(value: Boolean): Self = StObject.set(x, "autoConfirmUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoVerifyEmail(value: Boolean): Self = StObject.set(x, "autoVerifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoVerifyPhone(value: Boolean): Self = StObject.set(x, "autoVerifyPhone", value.asInstanceOf[js.Any])
  }
}
