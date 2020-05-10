package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`private`
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.internal
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.public
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.visibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateInOrgParams extends js.Object {
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
    * Pass `true` to create an initial commit with empty README.
    */
  var auto_init: js.UndefOr[Boolean] = js.native
  /**
    * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.native
  /**
    * A short description of the repository.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, "Haskell".
    */
  var gitignore_template: js.UndefOr[String] = js.native
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
    * Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://help.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, "mit" or "mpl-2.0".
    */
  var license_template: js.UndefOr[String] = js.native
  /**
    * The name of the repository.
    */
  var name: String = js.native
  var org: String = js.native
  /**
    * Either `true` to create a private repository or `false` to create a public one. Creating private repositories requires a paid GitHub account.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  /**
    * The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization.
    */
  var team_id: js.UndefOr[Double] = js.native
  /**
    * Can be `public` or `private`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud, `visibility` can also be `internal`. For more information, see "[Creating an internal repository](https://help.github.com/github/creating-cloning-and-archiving-repositories/creating-an-internal-repository)" in the GitHub Help documentation.
    * The `visibility` parameter overrides the `private` parameter when you use both parameters with the `nebula-preview` preview header.
    */
  var visibility: js.UndefOr[
    public | `private` | typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.visibility | internal
  ] = js.native
}

object ReposCreateInOrgParams {
  @scala.inline
  def apply(name: String, org: String): ReposCreateInOrgParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateInOrgParams]
  }
  @scala.inline
  implicit class ReposCreateInOrgParamsOps[Self <: ReposCreateInOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
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
    def withAuto_init(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_init: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_init")(js.undefined)
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
    def withGitignore_template(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitignore_template: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore_template")(js.undefined)
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
    def withLicense_template(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense_template: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license_template")(js.undefined)
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
    def withTeam_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(js.undefined)
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

