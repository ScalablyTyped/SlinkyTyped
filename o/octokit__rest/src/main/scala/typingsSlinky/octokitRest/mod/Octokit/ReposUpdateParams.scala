package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.`private`
import typingsSlinky.octokitRest.octokitRestStrings.internal
import typingsSlinky.octokitRest.octokitRestStrings.public
import typingsSlinky.octokitRest.octokitRestStrings.visibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateParams extends js.Object {
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
    * Either `true` to make the repository private or `false` to make it public. Creating private repositories requires a paid GitHub account. Default: `false`.
    * **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://help.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private. **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://help.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  var repo: String = js.native
  /**
    * Can be `public` or `private`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud, `visibility` can also be `internal`. The `visibility` parameter overrides the `private` parameter when you use both along with the `nebula-preview` preview header.
    */
  var visibility: js.UndefOr[
    public | `private` | typingsSlinky.octokitRest.octokitRestStrings.visibility | internal
  ] = js.native
}

object ReposUpdateParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposUpdateParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateParams]
  }
  @scala.inline
  implicit class ReposUpdateParamsOps[Self <: ReposUpdateParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAllow_merge_commit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_merge_commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_merge_commit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_merge_commit")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_rebase_merge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_rebase_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_rebase_merge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_rebase_merge")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_squash_merge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_squash_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_squash_merge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_squash_merge")(js.undefined)
        ret
    }
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_branch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_branch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_branch")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete_branch_on_merge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_branch_on_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete_branch_on_merge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_branch_on_merge")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_issues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_issues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_issues")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_projects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_projects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_projects")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_wiki(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_wiki")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_wiki: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_wiki")(js.undefined)
        ret
    }
    @scala.inline
    def withHomepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_template(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_template: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_template")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: public | `private` | visibility | internal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

