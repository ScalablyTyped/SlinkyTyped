package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRoleTeamid extends js.Object {
  var role: AnonEnum = js.native
  var team_id: AnonRequired = js.native
  var username: AnonRequired = js.native
}

object AnonRoleTeamid {
  @scala.inline
  def apply(role: AnonEnum, team_id: AnonRequired, username: AnonRequired): AnonRoleTeamid = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoleTeamid]
  }
  @scala.inline
  implicit class AnonRoleTeamidOps[Self <: AnonRoleTeamid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRole(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

