package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the target was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The ID of the removed target definition.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}

object DeregisterTargetFromMaintenanceWindowResult {
  @scala.inline
  def apply(): DeregisterTargetFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
  }
  @scala.inline
  implicit class DeregisterTargetFromMaintenanceWindowResultOps[Self <: DeregisterTargetFromMaintenanceWindowResult] (val x: Self) extends AnyVal {
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
    def withoutWindowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTargetId(value: MaintenanceWindowTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(js.undefined)
        ret
    }
  }
  
}

