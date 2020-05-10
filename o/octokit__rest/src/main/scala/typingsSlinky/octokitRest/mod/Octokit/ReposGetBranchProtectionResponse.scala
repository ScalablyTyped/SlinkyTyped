package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchProtectionResponse extends js.Object {
  var allow_deletions: ReposGetBranchProtectionResponseAllowDeletions = js.native
  var allow_force_pushes: ReposGetBranchProtectionResponseAllowForcePushes = js.native
  var enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins = js.native
  var required_linear_history: ReposGetBranchProtectionResponseRequiredLinearHistory = js.native
  var required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews = js.native
  var required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks = js.native
  var restrictions: ReposGetBranchProtectionResponseRestrictions = js.native
  var url: String = js.native
}

object ReposGetBranchProtectionResponse {
  @scala.inline
  def apply(
    allow_deletions: ReposGetBranchProtectionResponseAllowDeletions,
    allow_force_pushes: ReposGetBranchProtectionResponseAllowForcePushes,
    enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins,
    required_linear_history: ReposGetBranchProtectionResponseRequiredLinearHistory,
    required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposGetBranchProtectionResponseRestrictions,
    url: String
  ): ReposGetBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchProtectionResponse]
  }
  @scala.inline
  implicit class ReposGetBranchProtectionResponseOps[Self <: ReposGetBranchProtectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_deletions(value: ReposGetBranchProtectionResponseAllowDeletions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_force_pushes(value: ReposGetBranchProtectionResponseAllowForcePushes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_force_pushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforce_admins(value: ReposGetBranchProtectionResponseEnforceAdmins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_admins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_linear_history(value: ReposGetBranchProtectionResponseRequiredLinearHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_linear_history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviews(value: ReposGetBranchProtectionResponseRequiredPullRequestReviews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checks(value: ReposGetBranchProtectionResponseRequiredStatusChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: ReposGetBranchProtectionResponseRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

