package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withPrincipalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalId")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAssignedIdentities(value: StringDictionary[IdentityUserAssignedIdentitiesValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAssignedIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAssignedIdentities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAssignedIdentities")(js.undefined)
        ret
    }
  }
  
}

