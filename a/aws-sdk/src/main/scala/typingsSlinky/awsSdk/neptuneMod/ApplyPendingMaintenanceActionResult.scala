package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPendingMaintenanceActionResult extends js.Object {
  var ResourcePendingMaintenanceActions: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.ResourcePendingMaintenanceActions] = js.native
}

object ApplyPendingMaintenanceActionResult {
  @scala.inline
  def apply(): ApplyPendingMaintenanceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
  }
  @scala.inline
  implicit class ApplyPendingMaintenanceActionResultOps[Self <: ApplyPendingMaintenanceActionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePendingMaintenanceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePendingMaintenanceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePendingMaintenanceActions")(js.undefined)
        ret
    }
  }
  
}

