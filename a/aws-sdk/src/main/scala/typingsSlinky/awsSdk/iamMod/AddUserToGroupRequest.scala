package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddUserToGroupRequest extends StObject {
  
  /**
    * The name of the group to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType = js.native
  
  /**
    * The name of the user to add. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType = js.native
}
object AddUserToGroupRequest {
  
  @scala.inline
  def apply(GroupName: groupNameType, UserName: existingUserNameType): AddUserToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUserToGroupRequest]
  }
  
  @scala.inline
  implicit class AddUserToGroupRequestMutableBuilder[Self <: AddUserToGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
