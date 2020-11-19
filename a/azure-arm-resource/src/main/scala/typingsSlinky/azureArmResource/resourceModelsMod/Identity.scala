package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends js.Object {
  
  /**
    * The principal ID of resource identity.
    */
  val principalId: js.UndefOr[String] = js.native
  
  /**
    * The tenant ID of resource.
    */
  val tenantId: js.UndefOr[String] = js.native
  
  /**
    * The identity type. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
    * UserAssigned', 'None'
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The list of user identities associated with the resource. The user identity dictionary key
    * references will be ARM resource ids in the form:
    * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
    */
  var userAssignedIdentities: js.UndefOr[StringDictionary[IdentityUserAssignedIdentitiesValue]] = js.native
}
object Identity {
  
  @scala.inline
  def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
    
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
    def setPrincipalId(value: String): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserAssignedIdentities(value: StringDictionary[IdentityUserAssignedIdentitiesValue]): Self = this.set("userAssignedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAssignedIdentities: Self = this.set("userAssignedIdentities", js.undefined)
  }
}
