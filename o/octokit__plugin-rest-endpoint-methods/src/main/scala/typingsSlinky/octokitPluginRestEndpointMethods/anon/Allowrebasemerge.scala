package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowrebasemerge extends js.Object {
  var allow_merge_commit: Type
  var allow_rebase_merge: Type
  var allow_squash_merge: Type
  var auto_init: Type
  var delete_branch_on_merge: Type
  var description: Type
  var gitignore_template: Type
  var has_issues: Type
  var has_projects: Type
  var has_wiki: Type
  var homepage: Type
  var is_template: Type
  var license_template: Type
  var name: Required
  @JSName("org")
  var org_ : Required
  var `private`: Type
  var team_id: Type
  var visibility: Enum
}

object Allowrebasemerge {
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
    org_ : Required,
    `private`: Type,
    team_id: Type,
    visibility: Enum
  ): Allowrebasemerge = {
    val __obj = js.Dynamic.literal(allow_merge_commit = allow_merge_commit.asInstanceOf[js.Any], allow_rebase_merge = allow_rebase_merge.asInstanceOf[js.Any], allow_squash_merge = allow_squash_merge.asInstanceOf[js.Any], auto_init = auto_init.asInstanceOf[js.Any], delete_branch_on_merge = delete_branch_on_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], gitignore_template = gitignore_template.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], is_template = is_template.asInstanceOf[js.Any], license_template = license_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowrebasemerge]
  }
}

