package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTaskFromMaintenanceWindowRequest extends js.Object {
  /**
    * The ID of the maintenance window the task should be removed from.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The ID of the task to remove from the maintenance window.
    */
  var WindowTaskId: MaintenanceWindowTaskId = js.native
}

object DeregisterTaskFromMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): DeregisterTaskFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class DeregisterTaskFromMaintenanceWindowRequestOps[Self <: DeregisterTaskFromMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindowId(value: MaintenanceWindowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowTaskId(value: MaintenanceWindowTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTaskId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

