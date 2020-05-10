package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchResponseProtection extends js.Object {
  var enabled: Boolean = js.native
  var required_status_checks: ReposGetBranchResponseProtectionRequiredStatusChecks = js.native
}

object ReposGetBranchResponseProtection {
  @scala.inline
  def apply(enabled: Boolean, required_status_checks: ReposGetBranchResponseProtectionRequiredStatusChecks): ReposGetBranchResponseProtection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseProtection]
  }
  @scala.inline
  implicit class ReposGetBranchResponseProtectionOps[Self <: ReposGetBranchResponseProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checks(value: ReposGetBranchResponseProtectionRequiredStatusChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

