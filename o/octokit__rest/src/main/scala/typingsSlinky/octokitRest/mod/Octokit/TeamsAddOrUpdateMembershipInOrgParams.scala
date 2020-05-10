package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.maintainer
import typingsSlinky.octokitRest.octokitRestStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAddOrUpdateMembershipInOrgParams extends js.Object {
  var org: String = js.native
  /**
    * The role that this user should have in the team. Can be one of:
    * \* `member` - a normal member of the team.
    * \* `maintainer` - a team maintainer. Able to add/remove other team members, promote other team members to team maintainer, and edit the team's name and description.
    */
  var role: js.UndefOr[member | maintainer] = js.native
  var team_slug: String = js.native
  var username: String = js.native
}

object TeamsAddOrUpdateMembershipInOrgParams {
  @scala.inline
  def apply(org: String, team_slug: String, username: String): TeamsAddOrUpdateMembershipInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipInOrgParams]
  }
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipInOrgParamsOps[Self <: TeamsAddOrUpdateMembershipInOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: member | maintainer): Self = {
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
  }
  
}

