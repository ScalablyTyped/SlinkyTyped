package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginProfile extends StObject {
  
  /**
    * The date when the password for the user was created.
    */
  var CreateDate: js.Date = js.native
  
  /**
    * Specifies whether the user is required to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanType] = js.native
  
  /**
    * The name of the user, which can be used for signing in to the AWS Management Console.
    */
  var UserName: userNameType = js.native
}
object LoginProfile {
  
  @scala.inline
  def apply(CreateDate: js.Date, UserName: userNameType): LoginProfile = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginProfile]
  }
  
  @scala.inline
  implicit class LoginProfileMutableBuilder[Self <: LoginProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordResetRequired(value: booleanType): Self = StObject.set(x, "PasswordResetRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordResetRequiredUndefined: Self = StObject.set(x, "PasswordResetRequired", js.undefined)
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
