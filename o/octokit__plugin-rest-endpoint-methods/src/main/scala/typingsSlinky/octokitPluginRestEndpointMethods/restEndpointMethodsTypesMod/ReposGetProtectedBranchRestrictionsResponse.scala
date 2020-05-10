package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetProtectedBranchRestrictionsResponse extends js.Object {
  var apps: js.Array[ReposGetProtectedBranchRestrictionsResponseAppsItem] = js.native
  var apps_url: String = js.native
  var teams: js.Array[ReposGetProtectedBranchRestrictionsResponseTeamsItem] = js.native
  var teams_url: String = js.native
  var url: String = js.native
  var users: js.Array[ReposGetProtectedBranchRestrictionsResponseUsersItem] = js.native
  var users_url: String = js.native
}

object ReposGetProtectedBranchRestrictionsResponse {
  @scala.inline
  def apply(
    apps: js.Array[ReposGetProtectedBranchRestrictionsResponseAppsItem],
    apps_url: String,
    teams: js.Array[ReposGetProtectedBranchRestrictionsResponseTeamsItem],
    teams_url: String,
    url: String,
    users: js.Array[ReposGetProtectedBranchRestrictionsResponseUsersItem],
    users_url: String
  ): ReposGetProtectedBranchRestrictionsResponse = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetProtectedBranchRestrictionsResponse]
  }
  @scala.inline
  implicit class ReposGetProtectedBranchRestrictionsResponseOps[Self <: ReposGetProtectedBranchRestrictionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApps(value: js.Array[ReposGetProtectedBranchRestrictionsResponseAppsItem]): Self = {
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
    def withTeams(value: js.Array[ReposGetProtectedBranchRestrictionsResponseTeamsItem]): Self = {
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
    def withUsers(value: js.Array[ReposGetProtectedBranchRestrictionsResponseUsersItem]): Self = {
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

