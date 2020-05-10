package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmail extends js.Object {
  var email: AnonType = js.native
  var invitee_id: AnonType = js.native
  var org: AnonRequired = js.native
  var role: AnonEnum = js.native
  var team_ids: AnonType = js.native
}

object AnonEmail {
  @scala.inline
  def apply(email: AnonType, invitee_id: AnonType, org: AnonRequired, role: AnonEnum, team_ids: AnonType): AnonEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], invitee_id = invitee_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_ids = team_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
  @scala.inline
  implicit class AnonEmailOps[Self <: AnonEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvitee_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitee_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_ids(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

