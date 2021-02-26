package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateBranchProtectionEndpoint extends StObject {
  
  /**
    * Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent deletion of the protected branch. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://docs.github.com/en/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)".
    */
  var allow_deletions: js.UndefOr[Boolean] = js.native
  
  /**
    * Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://docs.github.com/en/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)".
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
    * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more information, see "[Requiring a linear commit history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)".
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
object ReposUpdateBranchProtectionEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposUpdateBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateBranchProtectionEndpointMutableBuilder[Self <: ReposUpdateBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_deletions(value: Boolean): Self = StObject.set(x, "allow_deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_deletionsUndefined: Self = StObject.set(x, "allow_deletions", js.undefined)
    
    @scala.inline
    def setAllow_force_pushes(value: Boolean): Self = StObject.set(x, "allow_force_pushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_force_pushesNull: Self = StObject.set(x, "allow_force_pushes", null)
    
    @scala.inline
    def setAllow_force_pushesUndefined: Self = StObject.set(x, "allow_force_pushes", js.undefined)
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforce_admins(value: Boolean): Self = StObject.set(x, "enforce_admins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforce_adminsNull: Self = StObject.set(x, "enforce_admins", null)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_linear_history(value: Boolean): Self = StObject.set(x, "required_linear_history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_linear_historyUndefined: Self = StObject.set(x, "required_linear_history", js.undefined)
    
    @scala.inline
    def setRequired_pull_request_reviews(value: ReposUpdateBranchProtectionParamsRequiredPullRequestReviews): Self = StObject.set(x, "required_pull_request_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_pull_request_reviewsNull: Self = StObject.set(x, "required_pull_request_reviews", null)
    
    @scala.inline
    def setRequired_status_checks(value: ReposUpdateBranchProtectionParamsRequiredStatusChecks): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_status_checksNull: Self = StObject.set(x, "required_status_checks", null)
    
    @scala.inline
    def setRestrictions(value: ReposUpdateBranchProtectionParamsRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsNull: Self = StObject.set(x, "restrictions", null)
  }
}
