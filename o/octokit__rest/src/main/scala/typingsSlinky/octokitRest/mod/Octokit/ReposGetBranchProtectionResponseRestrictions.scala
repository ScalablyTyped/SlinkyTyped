package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchProtectionResponseRestrictions extends js.Object {
  var apps: js.Array[ReposGetBranchProtectionResponseRestrictionsAppsItem] = js.native
  var apps_url: String = js.native
  var teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem] = js.native
  var teams_url: String = js.native
  var url: String = js.native
  var users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem] = js.native
  var users_url: String = js.native
}

object ReposGetBranchProtectionResponseRestrictions {
  @scala.inline
  def apply(
    apps: js.Array[ReposGetBranchProtectionResponseRestrictionsAppsItem],
    apps_url: String,
    teams: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem],
    teams_url: String,
    url: String,
    users: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem],
    users_url: String
  ): ReposGetBranchProtectionResponseRestrictions = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRestrictions]
  }
  @scala.inline
  implicit class ReposGetBranchProtectionResponseRestrictionsOps[Self <: ReposGetBranchProtectionResponseRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApps(value: js.Array[ReposGetBranchProtectionResponseRestrictionsAppsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApps_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: js.Array[ReposGetBranchProtectionResponseRestrictionsTeamsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[ReposGetBranchProtectionResponseRestrictionsUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

