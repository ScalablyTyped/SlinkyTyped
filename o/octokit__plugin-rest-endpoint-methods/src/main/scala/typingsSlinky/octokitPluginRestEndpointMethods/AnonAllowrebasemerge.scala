package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowrebasemerge extends js.Object {
  var allow_merge_commit: AnonType = js.native
  var allow_rebase_merge: AnonType = js.native
  var allow_squash_merge: AnonType = js.native
  var auto_init: AnonType = js.native
  var delete_branch_on_merge: AnonType = js.native
  var description: AnonType = js.native
  var gitignore_template: AnonType = js.native
  var has_issues: AnonType = js.native
  var has_projects: AnonType = js.native
  var has_wiki: AnonType = js.native
  var homepage: AnonType = js.native
  var is_template: AnonType = js.native
  var license_template: AnonType = js.native
  var name: AnonRequired = js.native
  var org: AnonRequired = js.native
  var `private`: AnonType = js.native
  var team_id: AnonType = js.native
  var visibility: AnonEnum = js.native
}

object AnonAllowrebasemerge {
  @scala.inline
  def apply(
    allow_merge_commit: AnonType,
    allow_rebase_merge: AnonType,
    allow_squash_merge: AnonType,
    auto_init: AnonType,
    delete_branch_on_merge: AnonType,
    description: AnonType,
    gitignore_template: AnonType,
    has_issues: AnonType,
    has_projects: AnonType,
    has_wiki: AnonType,
    homepage: AnonType,
    is_template: AnonType,
    license_template: AnonType,
    name: AnonRequired,
    org: AnonRequired,
    `private`: AnonType,
    team_id: AnonType,
    visibility: AnonEnum
  ): AnonAllowrebasemerge = {
    val __obj = js.Dynamic.literal(allow_merge_commit = allow_merge_commit.asInstanceOf[js.Any], allow_rebase_merge = allow_rebase_merge.asInstanceOf[js.Any], allow_squash_merge = allow_squash_merge.asInstanceOf[js.Any], auto_init = auto_init.asInstanceOf[js.Any], delete_branch_on_merge = delete_branch_on_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], gitignore_template = gitignore_template.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], is_template = is_template.asInstanceOf[js.Any], license_template = license_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowrebasemerge]
  }
  @scala.inline
  implicit class AnonAllowrebasemergeOps[Self <: AnonAllowrebasemerge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_merge_commit(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_merge_commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_rebase_merge(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_rebase_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_squash_merge(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_squash_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto_init(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_branch_on_merge(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_branch_on_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitignore_template(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_issues(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_projects(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_wiki(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_wiki")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomepage(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_template(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense_template(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

