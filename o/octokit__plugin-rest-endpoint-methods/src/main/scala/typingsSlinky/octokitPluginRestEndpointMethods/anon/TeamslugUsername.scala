package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamslugUsername extends js.Object {
  @JSName("org")
  var org_ : Required = js.native
  var team_slug: Required = js.native
  var username: Required = js.native
}

object TeamslugUsername {
  @scala.inline
  def apply(org_ : Required, team_slug: Required, username: Required): TeamslugUsername = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamslugUsername]
  }
  @scala.inline
  implicit class TeamslugUsernameOps[Self <: TeamslugUsername] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg_(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

