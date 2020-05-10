package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionParams extends js.Object {
  /**
    * Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent deletion of the protected branch. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://help.github.com/en/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation.
    */
  var allow_deletions: js.UndefOr[Boolean] = js.native
  /**
    * Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://help.github.com/en/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation."
    */
  var allow_force_pushes: js.UndefOr[Boolean | Null] = js.native
  var branch: String = js.native
  /**
    * Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable.
    */
  var enforce_admins: Boolean | Null = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more information, see "[Requiring a linear commit history](https://help.github.com/github/administering-a-repository/requiring-a-linear-commit-history)" in the GitHub Help documentation.
    */
  var required_linear_history: js.UndefOr[Boolean] = js.native
  /**
    * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
    */
  var required_pull_request_reviews: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews | Null = js.native
  /**
    * Require status checks to pass before merging. Set to `null` to disable.
    */
  var required_status_checks: ReposUpdateBranchProtectionParamsRequiredStatusChecks | Null = js.native
  /**
    * Restrict who can push to the protected branch. User, app, and team `restrictions` are only available for organization-owned repositories. Set to `null` to disable.
    */
  var restrictions: ReposUpdateBranchProtectionParamsRestrictions | Null = js.native
}

object ReposUpdateBranchProtectionParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposUpdateBranchProtectionParams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParams]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsOps[Self <: ReposUpdateBranchProtectionParams] (val x: Self) extends AnyVal {
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
    def withAllow_deletions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_deletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_deletions")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_force_pushes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_force_pushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_force_pushes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_force_pushes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_force_pushesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_force_pushes")(null)
        ret
    }
    @scala.inline
    def withEnforce_admins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_admins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforce_adminsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_admins")(null)
        ret
    }
    @scala.inline
    def withRequired_linear_history(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_linear_history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired_linear_history: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_linear_history")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviews(value: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews")(null)
        ret
    }
    @scala.inline
    def withRequired_status_checks(value: ReposUpdateBranchProtectionParamsRequiredStatusChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(null)
        ret
    }
    @scala.inline
    def withRestrictions(value: ReposUpdateBranchProtectionParamsRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(null)
        ret
    }
  }
  
}

