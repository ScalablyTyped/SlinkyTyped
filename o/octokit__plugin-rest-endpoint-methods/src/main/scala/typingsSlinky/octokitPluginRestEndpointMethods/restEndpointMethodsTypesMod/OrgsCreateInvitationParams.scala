package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.admin
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.billing_manager
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.direct_member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsCreateInvitationParams extends js.Object {
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

object OrgsCreateInvitationParams {
  @scala.inline
  def apply(org_ : String): OrgsCreateInvitationParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCreateInvitationParams]
  }
  @scala.inline
  implicit class OrgsCreateInvitationParamsOps[Self <: OrgsCreateInvitationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitee_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitee_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitee_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitee_id")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: admin | direct_member | billing_manager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withTeam_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_ids")(js.undefined)
        ret
    }
  }
  
}

