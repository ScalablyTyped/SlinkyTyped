package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsListPendingInvitationsLegacyResponseItem extends js.Object {
  var created_at: String = js.native
  var email: String = js.native
  var id: Double = js.native
  var invitation_team_url: String = js.native
  var inviter: TeamsListPendingInvitationsLegacyResponseItemInviter = js.native
  var login: String = js.native
  var role: String = js.native
  var team_count: Double = js.native
}

object TeamsListPendingInvitationsLegacyResponseItem {
  @scala.inline
  def apply(
    created_at: String,
    email: String,
    id: Double,
    invitation_team_url: String,
    inviter: TeamsListPendingInvitationsLegacyResponseItemInviter,
    login: String,
    role: String,
    team_count: Double
  ): TeamsListPendingInvitationsLegacyResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitation_team_url = invitation_team_url.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_count = team_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListPendingInvitationsLegacyResponseItem]
  }
  @scala.inline
  implicit class TeamsListPendingInvitationsLegacyResponseItemOps[Self <: TeamsListPendingInvitationsLegacyResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvitation_team_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitation_team_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInviter(value: TeamsListPendingInvitationsLegacyResponseItemInviter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

