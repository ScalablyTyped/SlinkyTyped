package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.admin
import typingsSlinky.octokitTypes.octokitTypesStrings.billing_manager
import typingsSlinky.octokitTypes.octokitTypesStrings.direct_member
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsCreateInvitationEndpoint extends StObject {
  
  /**
    * **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
    */
  var invitee_id: js.UndefOr[Double] = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Specify role for new member. Can be one of:
    * \* `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.
    * \* `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.
    * \* `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.
    */
  var role: js.UndefOr[admin | direct_member | billing_manager] = js.native
  
  /**
    * Specify IDs for the teams you want to invite new members to.
    */
  var team_ids: js.UndefOr[js.Array[Double]] = js.native
}
object OrgsCreateInvitationEndpoint {
  
  @scala.inline
  def apply(org_ : String): OrgsCreateInvitationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateInvitationEndpoint]
  }
  
  @scala.inline
  implicit class OrgsCreateInvitationEndpointMutableBuilder[Self <: OrgsCreateInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setInvitee_id(value: Double): Self = StObject.set(x, "invitee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitee_idUndefined: Self = StObject.set(x, "invitee_id", js.undefined)
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: admin | direct_member | billing_manager): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setTeam_ids(value: js.Array[Double]): Self = StObject.set(x, "team_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_idsUndefined: Self = StObject.set(x, "team_ids", js.undefined)
    
    @scala.inline
    def setTeam_idsVarargs(value: Double*): Self = StObject.set(x, "team_ids", js.Array(value :_*))
  }
}
