package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowsquashmerge extends js.Object {
  var allow_merge_commit: Type
  var allow_rebase_merge: Type
  var allow_squash_merge: Type
  var archived: Type
  var default_branch: Type
  var delete_branch_on_merge: Type
  var description: Type
  var has_issues: Type
  var has_projects: Type
  var has_wiki: Type
  var homepage: Type
  var is_template: Type
  var name: Type
  var owner: Required
  var `private`: Type
  var repo: Required
  var visibility: Enum
}

object Allowsquashmerge {
  @scala.inline
  def apply(
    allow_merge_commit: Type,
    allow_rebase_merge: Type,
    allow_squash_merge: Type,
    archived: Type,
    default_branch: Type,
    delete_branch_on_merge: Type,
    description: Type,
    has_issues: Type,
    has_projects: Type,
    has_wiki: Type,
    homepage: Type,
    is_template: Type,
    name: Type,
    owner: Required,
    `private`: Type,
    repo: Required,
    visibility: Enum
  ): Allowsquashmerge = {
    val __obj = js.Dynamic.literal(allow_merge_commit = allow_merge_commit.asInstanceOf[js.Any], allow_rebase_merge = allow_rebase_merge.asInstanceOf[js.Any], allow_squash_merge = allow_squash_merge.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], delete_branch_on_merge = delete_branch_on_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], is_template = is_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowsquashmerge]
  }
}

