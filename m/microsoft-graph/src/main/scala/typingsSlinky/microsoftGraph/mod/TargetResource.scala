package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetResource extends js.Object {
  
  // Indicates the visible name defined for the resource. Typically specified when the resource is created.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // When type is set to Group, this indicates the group type.
  var groupType: js.UndefOr[NullableOption[GroupType]] = js.native
  
  // Indicates the unique ID of the resource.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates name, old value and new value of each attribute that changed. Property values depend on the operation type.
  var modifiedProperties: js.UndefOr[NullableOption[js.Array[ModifiedProperty]]] = js.native
  
  // Describes the resource type. Example values include Application, Group, ServicePrincipal, and User.
  var `type`: js.UndefOr[NullableOption[String]] = js.native
  
  // When type is set to User, this includes the user name that initiated the action; null for other types.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object TargetResource {
  
  @scala.inline
  def apply(): TargetResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResource]
  }
  
  @scala.inline
  implicit class TargetResourceOps[Self <: TargetResource] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setGroupType(value: NullableOption[GroupType]): Self = this.set("groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupType: Self = this.set("groupType", js.undefined)
    
    @scala.inline
    def setGroupTypeNull: Self = this.set("groupType", null)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setModifiedPropertiesVarargs(value: ModifiedProperty*): Self = this.set("modifiedProperties", js.Array(value :_*))
    
    @scala.inline
    def setModifiedProperties(value: NullableOption[js.Array[ModifiedProperty]]): Self = this.set("modifiedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedProperties: Self = this.set("modifiedProperties", js.undefined)
    
    @scala.inline
    def setModifiedPropertiesNull: Self = this.set("modifiedProperties", null)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserPrincipalNameNull: Self = this.set("userPrincipalName", null)
  }
}
