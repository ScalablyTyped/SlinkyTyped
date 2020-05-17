package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowmergecommit extends js.Object {
  var allow_merge_commit: Type = js.native
  var allow_rebase_merge: Type = js.native
  var allow_squash_merge: Type = js.native
  var auto_init: Type = js.native
  var delete_branch_on_merge: Type = js.native
  var description: Type = js.native
  var gitignore_template: Type = js.native
  var has_issues: Type = js.native
  var has_projects: Type = js.native
  var has_wiki: Type = js.native
  var homepage: Type = js.native
  var is_template: Type = js.native
  var license_template: Type = js.native
  var name: Required = js.native
  var `private`: Type = js.native
  var team_id: Type = js.native
  var visibility: Enum = js.native
}

object Allowmergecommit {
  @scala.inline
  def apply(
    allow_merge_commit: Type,
    allow_rebase_merge: Type,
    allow_squash_merge: Type,
    auto_init: Type,
    delete_branch_on_merge: Type,
    description: Type,
    gitignore_template: Type,
    has_issues: Type,
    has_projects: Type,
    has_wiki: Type,
    homepage: Type,
    is_template: Type,
    license_template: Type,
    name: Required,
    `private`: Type,
    team_id: Type,
    visibility: Enum
  ): Allowmergecommit = {
    val __obj = js.Dynamic.literal(allow_merge_commit = allow_merge_commit.asInstanceOf[js.Any], allow_rebase_merge = allow_rebase_merge.asInstanceOf[js.Any], allow_squash_merge = allow_squash_merge.asInstanceOf[js.Any], auto_init = auto_init.asInstanceOf[js.Any], delete_branch_on_merge = delete_branch_on_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], gitignore_template = gitignore_template.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], is_template = is_template.asInstanceOf[js.Any], license_template = license_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowmergecommit]
  }
  @scala.inline
  implicit class AllowmergecommitOps[Self <: Allowmergecommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_merge_commit(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_merge_commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_rebase_merge(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_rebase_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_squash_merge(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_squash_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto_init(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_branch_on_merge(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_branch_on_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitignore_template(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_issues(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_projects(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_wiki(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_wiki")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomepage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_template(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense_template(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_id(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

