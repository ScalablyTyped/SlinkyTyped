package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsFindOrgInstallationParams extends js.Object {
  var org: String = js.native
}

object AppsFindOrgInstallationParams {
  @scala.inline
  def apply(org: String): AppsFindOrgInstallationParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsFindOrgInstallationParams]
  }
  @scala.inline
  implicit class AppsFindOrgInstallationParamsOps[Self <: AppsFindOrgInstallationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

