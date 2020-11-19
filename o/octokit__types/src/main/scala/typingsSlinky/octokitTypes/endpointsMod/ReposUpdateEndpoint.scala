package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.`private`
import typingsSlinky.octokitTypes.octokitTypesStrings.internal
import typingsSlinky.octokitTypes.octokitTypesStrings.public
import typingsSlinky.octokitTypes.octokitTypesStrings.visibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateEndpoint extends js.Object {
  
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
  implicit class ReposUpdateEndpointOps[Self <: ReposUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_merge_commit(value: Boolean): Self = this.set("allow_merge_commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_merge_commit: Self = this.set("allow_merge_commit", js.undefined)
    
    @scala.inline
    def setAllow_rebase_merge(value: Boolean): Self = this.set("allow_rebase_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_rebase_merge: Self = this.set("allow_rebase_merge", js.undefined)
    
    @scala.inline
    def setAllow_squash_merge(value: Boolean): Self = this.set("allow_squash_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_squash_merge: Self = this.set("allow_squash_merge", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setDefault_branch(value: String): Self = this.set("default_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_branch: Self = this.set("default_branch", js.undefined)
    
    @scala.inline
    def setDelete_branch_on_merge(value: Boolean): Self = this.set("delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete_branch_on_merge: Self = this.set("delete_branch_on_merge", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHas_issues(value: Boolean): Self = this.set("has_issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_issues: Self = this.set("has_issues", js.undefined)
    
    @scala.inline
    def setHas_projects(value: Boolean): Self = this.set("has_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_projects: Self = this.set("has_projects", js.undefined)
    
    @scala.inline
    def setHas_wiki(value: Boolean): Self = this.set("has_wiki", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_wiki: Self = this.set("has_wiki", js.undefined)
    
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    
    @scala.inline
    def setIs_template(value: Boolean): Self = this.set("is_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_template: Self = this.set("is_template", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setVisibility(value: public | `private` | visibility | internal): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
