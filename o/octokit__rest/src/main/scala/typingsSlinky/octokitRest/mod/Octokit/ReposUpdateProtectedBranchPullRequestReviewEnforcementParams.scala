package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateProtectedBranchPullRequestReviewEnforcementParams extends js.Object {
  var branch: String = js.native
  /**
    * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
    */
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.native
  /**
    * Specify which users and teams can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories.
    */
  var dismissal_restrictions: js.UndefOr[
    ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions
  ] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Blocks merging pull requests until [code owners](https://help.github.com/articles/about-code-owners/) have reviewed.
    */
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6.
    */
  var required_approving_review_count: js.UndefOr[Double] = js.native
}

object ReposUpdateProtectedBranchPullRequestReviewEnforcementParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposUpdateProtectedBranchPullRequestReviewEnforcementParams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcementParams]
  }
  @scala.inline
  implicit class ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsOps[Self <: ReposUpdateProtectedBranchPullRequestReviewEnforcementParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
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
    def withDismissal_restrictions(value: ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions): Self = {
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

