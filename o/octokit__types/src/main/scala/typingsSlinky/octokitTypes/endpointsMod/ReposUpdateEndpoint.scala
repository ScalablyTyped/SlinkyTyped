package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.`private`
import typingsSlinky.octokitTypes.octokitTypesStrings.internal
import typingsSlinky.octokitTypes.octokitTypesStrings.public
import typingsSlinky.octokitTypes.octokitTypesStrings.visibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateEndpoint extends StObject {
  
  /**
    * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.
    */
  var allow_merge_commit: js.UndefOr[Boolean] = js.native
  
  /**
    * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
    */
  var allow_rebase_merge: js.UndefOr[Boolean] = js.native
  
  /**
    * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
    */
  var allow_squash_merge: js.UndefOr[Boolean] = js.native
  
  /**
    * `true` to archive this repository. **Note**: You cannot unarchive repositories through the API.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Updates the default branch for this repository.
    */
  var default_branch: js.UndefOr[String] = js.native
  
  /**
    * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.native
  
  /**
    * A short description of the repository.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Either `true` to enable issues for this repository or `false` to disable them.
    */
  var has_issues: js.UndefOr[Boolean] = js.native
  
  /**
    * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.
    */
  var has_projects: js.UndefOr[Boolean] = js.native
  
  /**
    * Either `true` to enable the wiki for this repository or `false` to disable it.
    */
  var has_wiki: js.UndefOr[Boolean] = js.native
  
  /**
    * A URL with more information about the repository.
    */
  var homepage: js.UndefOr[String] = js.native
  
  /**
    * Either `true` to make this repo available as a template repository or `false` to prevent it.
    */
  var is_template: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the repository.
    */
  var name: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  /**
    * Either `true` to make the repository private or `false` to make it public. Default: `false`.
    * **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private. **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  
  var repo: String = js.native
  
  /**
    * Can be `public` or `private`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+, `visibility` can also be `internal`. The `visibility` parameter overrides the `private` parameter when you use both along with the `nebula-preview` preview header.
    */
  var visibility: js.UndefOr[
    public | `private` | typingsSlinky.octokitTypes.octokitTypesStrings.visibility | internal
  ] = js.native
}
object ReposUpdateEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposUpdateEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateEndpointMutableBuilder[Self <: ReposUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_merge_commit(value: Boolean): Self = StObject.set(x, "allow_merge_commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_merge_commitUndefined: Self = StObject.set(x, "allow_merge_commit", js.undefined)
    
    @scala.inline
    def setAllow_rebase_merge(value: Boolean): Self = StObject.set(x, "allow_rebase_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_rebase_mergeUndefined: Self = StObject.set(x, "allow_rebase_merge", js.undefined)
    
    @scala.inline
    def setAllow_squash_merge(value: Boolean): Self = StObject.set(x, "allow_squash_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_squash_mergeUndefined: Self = StObject.set(x, "allow_squash_merge", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setDefault_branch(value: String): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_branchUndefined: Self = StObject.set(x, "default_branch", js.undefined)
    
    @scala.inline
    def setDelete_branch_on_merge(value: Boolean): Self = StObject.set(x, "delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_branch_on_mergeUndefined: Self = StObject.set(x, "delete_branch_on_merge", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHas_issues(value: Boolean): Self = StObject.set(x, "has_issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_issuesUndefined: Self = StObject.set(x, "has_issues", js.undefined)
    
    @scala.inline
    def setHas_projects(value: Boolean): Self = StObject.set(x, "has_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_projectsUndefined: Self = StObject.set(x, "has_projects", js.undefined)
    
    @scala.inline
    def setHas_wiki(value: Boolean): Self = StObject.set(x, "has_wiki", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_wikiUndefined: Self = StObject.set(x, "has_wiki", js.undefined)
    
    @scala.inline
    def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    @scala.inline
    def setIs_template(value: Boolean): Self = StObject.set(x, "is_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_templateUndefined: Self = StObject.set(x, "is_template", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: public | `private` | visibility | internal): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
