package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGroupRequest extends StObject {
  
  /**
    * Name of the IAM group to update. If you're changing the name of the group, this is the original name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType = js.native
  
  /**
    * New name for the IAM group. Only include this if changing the group's name. IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
    */
  var NewGroupName: js.UndefOr[groupNameType] = js.native
  
  /**
    * New path for the IAM group. Only include this if changing the group's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var NewPath: js.UndefOr[pathType] = js.native
}
object UpdateGroupRequest {
  
  @scala.inline
  def apply(GroupName: groupNameType): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateGroupRequestMutableBuilder[Self <: UpdateGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewGroupName(value: groupNameType): Self = StObject.set(x, "NewGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewGroupNameUndefined: Self = StObject.set(x, "NewGroupName", js.undefined)
    
    @scala.inline
    def setNewPath(value: pathType): Self = StObject.set(x, "NewPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPathUndefined: Self = StObject.set(x, "NewPath", js.undefined)
  }
}
