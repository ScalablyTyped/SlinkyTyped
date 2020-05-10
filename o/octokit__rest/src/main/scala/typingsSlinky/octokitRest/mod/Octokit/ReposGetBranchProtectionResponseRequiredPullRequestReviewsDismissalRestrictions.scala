package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions extends js.Object {
  var teams: js.Array[
    ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
  ] = js.native
  var teams_url: String = js.native
  var url: String = js.native
  var users: js.Array[
    ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
  ] = js.native
  var users_url: String = js.native
}

object ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions {
  @scala.inline
  def apply(
    teams: js.Array[
      ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
    ],
    teams_url: String,
    url: String,
    users: js.Array[
      ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
    ],
    users_url: String
  ): ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions]
  }
  @scala.inline
  implicit class ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsOps[Self <: ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeams(
      value: js.Array[
          ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsTeamsItem
        ]
    ): Self = {
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
    def withUsers(
      value: js.Array[
          ReposGetBranchProtectionResponseRequiredPullRequestReviewsDismissalRestrictionsUsersItem
        ]
    ): Self = {
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

