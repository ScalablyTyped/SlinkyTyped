package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A maintenance window for VMs. When set, we restrict our maintenance
  * operations to this window.
  */
@js.native
trait SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow extends js.Object {
  var dailyMaintenanceWindow: js.UndefOr[SchemaResourcePolicyDailyCycle] = js.native
}

object SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow {
  @scala.inline
  def apply(): SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow]
  }
  @scala.inline
  implicit class SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindowOps[Self <: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDailyMaintenanceWindow(value: SchemaResourcePolicyDailyCycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyMaintenanceWindow")(js.undefined)
        ret
    }
  }
  
}

