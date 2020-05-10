package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTeamslugUsername extends js.Object {
  var org: AnonRequired = js.native
  var team_slug: AnonRequired = js.native
  var username: AnonRequired = js.native
}

object AnonTeamslugUsername {
  @scala.inline
  def apply(org: AnonRequired, team_slug: AnonRequired, username: AnonRequired): AnonTeamslugUsername = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTeamslugUsername]
  }
  @scala.inline
  implicit class AnonTeamslugUsernameOps[Self <: AnonTeamslugUsername] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
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

