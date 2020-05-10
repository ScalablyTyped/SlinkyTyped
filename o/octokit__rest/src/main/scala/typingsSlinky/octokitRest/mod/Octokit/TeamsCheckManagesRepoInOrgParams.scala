package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsCheckManagesRepoInOrgParams extends js.Object {
  var org: String = js.native
  var owner: String = js.native
  var repo: String = js.native
  var team_slug: String = js.native
}

object TeamsCheckManagesRepoInOrgParams {
  @scala.inline
  def apply(org: String, owner: String, repo: String, team_slug: String): TeamsCheckManagesRepoInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckManagesRepoInOrgParams]
  }
  @scala.inline
  implicit class TeamsCheckManagesRepoInOrgParamsOps[Self <: TeamsCheckManagesRepoInOrgParams] (val x: Self) extends AnyVal {
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
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

