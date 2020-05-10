package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCreateInstallationTokenResponsePermissions extends js.Object {
  var contents: String = js.native
  var issues: String = js.native
}

object AppsCreateInstallationTokenResponsePermissions {
  @scala.inline
  def apply(contents: String, issues: String): AppsCreateInstallationTokenResponsePermissions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationTokenResponsePermissions]
  }
  @scala.inline
  implicit class AppsCreateInstallationTokenResponsePermissionsOps[Self <: AppsCreateInstallationTokenResponsePermissions] (val x: Self) extends AnyVal {
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
  }
  
}

