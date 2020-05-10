package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetProtectedBranchRestrictionsResponseAppsItemPermissions extends js.Object {
  var contents: String = js.native
  var issues: String = js.native
  var metadata: String = js.native
  var single_file: String = js.native
}

object ReposGetProtectedBranchRestrictionsResponseAppsItemPermissions {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): ReposGetProtectedBranchRestrictionsResponseAppsItemPermissions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetProtectedBranchRestrictionsResponseAppsItemPermissions]
  }
  @scala.inline
  implicit class ReposGetProtectedBranchRestrictionsResponseAppsItemPermissionsOps[Self <: ReposGetProtectedBranchRestrictionsResponseAppsItemPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingle_file(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single_file")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

