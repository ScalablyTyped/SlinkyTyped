package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
  /**
    * The system checks if the target is being referenced by a task. If the target is being referenced, the system returns an error and does not deregister the target from the maintenance window.
    */
  var Safe: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the maintenance window the target should be removed from.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The ID of the target definition to remove.
    */
  var WindowTargetId: MaintenanceWindowTargetId = js.native
}

object DeregisterTargetFromMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTargetId: MaintenanceWindowTargetId): DeregisterTargetFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class DeregisterTargetFromMaintenanceWindowRequestOps[Self <: DeregisterTargetFromMaintenanceWindowRequest] (val x: Self) extends AnyVal {
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
    def withWindowTargetId(value: MaintenanceWindowTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Safe")(js.undefined)
        ret
    }
  }
  
}

