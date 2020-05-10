package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviews extends js.Object {
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.native
  var dismissal_restrictions: js.UndefOr[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions] = js.native
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.native
  var required_approving_review_count: js.UndefOr[Double] = js.native
}

object ReposUpdateBranchProtectionParamsRequiredPullRequestReviews {
  @scala.inline
  def apply(): ReposUpdateBranchProtectionParamsRequiredPullRequestReviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviews]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsOps[Self <: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismiss_stale_reviews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss_stale_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismiss_stale_reviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss_stale_reviews")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissal_restrictions(value: ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissal_restrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_code_owner_reviews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_code_owner_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_code_owner_reviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_code_owner_reviews")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired_approving_review_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_approving_review_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired_approving_review_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_approving_review_count")(js.undefined)
        ret
    }
  }
  
}

