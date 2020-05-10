package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionResponse extends js.Object {
  var allow_deletions: ReposUpdateBranchProtectionResponseAllowDeletions = js.native
  var allow_force_pushes: ReposUpdateBranchProtectionResponseAllowForcePushes = js.native
  var enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins = js.native
  var required_linear_history: ReposUpdateBranchProtectionResponseRequiredLinearHistory = js.native
  var required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews = js.native
  var required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks = js.native
  var restrictions: ReposUpdateBranchProtectionResponseRestrictions = js.native
  var url: String = js.native
}

object ReposUpdateBranchProtectionResponse {
  @scala.inline
  def apply(
    allow_deletions: ReposUpdateBranchProtectionResponseAllowDeletions,
    allow_force_pushes: ReposUpdateBranchProtectionResponseAllowForcePushes,
    enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins,
    required_linear_history: ReposUpdateBranchProtectionResponseRequiredLinearHistory,
    required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposUpdateBranchProtectionResponseRestrictions,
    url: String
  ): ReposUpdateBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponse]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionResponseOps[Self <: ReposUpdateBranchProtectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_deletions(value: ReposUpdateBranchProtectionResponseAllowDeletions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_force_pushes(value: ReposUpdateBranchProtectionResponseAllowForcePushes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_force_pushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforce_admins(value: ReposUpdateBranchProtectionResponseEnforceAdmins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_admins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_linear_history(value: ReposUpdateBranchProtectionResponseRequiredLinearHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_linear_history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviews(value: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checks(value: ReposUpdateBranchProtectionResponseRequiredStatusChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: ReposUpdateBranchProtectionResponseRestrictions): Self = {
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

