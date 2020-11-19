package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangePasswordRequest extends js.Object {
  
  /**
    * The new password. The new password must conform to the AWS account's password policy, if one exists. The regex pattern that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (\\u0020) through the end of the ASCII character range (\\u00FF). You can also include the tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) characters. Any of these characters are valid in a password. However, many tools, such as the AWS Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.
    */
  var NewPassword: passwordType = js.native
  
  /**
    * The IAM user's current password.
    */
  var OldPassword: passwordType = js.native
}
object ChangePasswordRequest {
  
  @scala.inline
  def apply(NewPassword: passwordType, OldPassword: passwordType): ChangePasswordRequest = {
    val __obj = js.Dynamic.literal(NewPassword = NewPassword.asInstanceOf[js.Any], OldPassword = OldPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePasswordRequest]
  }
  
  @scala.inline
  implicit class ChangePasswordRequestOps[Self <: ChangePasswordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewPassword(value: passwordType): Self = this.set("NewPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPassword(value: passwordType): Self = this.set("OldPassword", value.asInstanceOf[js.Any])
  }
}
