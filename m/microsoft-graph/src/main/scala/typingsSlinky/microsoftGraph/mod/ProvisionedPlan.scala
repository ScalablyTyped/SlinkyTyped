package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedPlan extends js.Object {
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[String] = js.native
  // For example, 'Success'.
  var provisioningStatus: js.UndefOr[String] = js.native
  // The name of the service; for example, 'AccessControlS2S'
  var service: js.UndefOr[String] = js.native
}

object ProvisionedPlan {
  @scala.inline
  def apply(): ProvisionedPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedPlan]
  }
  @scala.inline
  implicit class ProvisionedPlanOps[Self <: ProvisionedPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

