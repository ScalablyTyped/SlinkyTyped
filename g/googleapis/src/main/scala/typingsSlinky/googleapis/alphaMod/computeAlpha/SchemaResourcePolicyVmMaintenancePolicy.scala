package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourcePolicyVmMaintenancePolicy extends js.Object {
  /**
    * Maintenance windows that are applied to VMs covered by this policy.
    */
  var maintenanceWindow: js.UndefOr[SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow] = js.native
}

object SchemaResourcePolicyVmMaintenancePolicy {
  @scala.inline
  def apply(): SchemaResourcePolicyVmMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicy]
  }
  @scala.inline
  implicit class SchemaResourcePolicyVmMaintenancePolicyOps[Self <: SchemaResourcePolicyVmMaintenancePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaintenanceWindow(value: SchemaResourcePolicyVmMaintenancePolicyMaintenanceWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(js.undefined)
        ret
    }
  }
  
}

