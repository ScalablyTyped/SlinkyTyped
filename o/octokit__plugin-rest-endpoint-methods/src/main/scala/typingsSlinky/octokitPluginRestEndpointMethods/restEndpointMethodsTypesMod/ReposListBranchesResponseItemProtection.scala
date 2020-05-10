package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListBranchesResponseItemProtection extends js.Object {
  var enabled: Boolean = js.native
  var required_status_checks: ReposListBranchesResponseItemProtectionRequiredStatusChecks = js.native
}

object ReposListBranchesResponseItemProtection {
  @scala.inline
  def apply(
    enabled: Boolean,
    required_status_checks: ReposListBranchesResponseItemProtectionRequiredStatusChecks
  ): ReposListBranchesResponseItemProtection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesResponseItemProtection]
  }
  @scala.inline
  implicit class ReposListBranchesResponseItemProtectionOps[Self <: ReposListBranchesResponseItemProtection] (val x: Self) extends AnyVal {
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
    def withRequired_status_checks(value: ReposListBranchesResponseItemProtectionRequiredStatusChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

