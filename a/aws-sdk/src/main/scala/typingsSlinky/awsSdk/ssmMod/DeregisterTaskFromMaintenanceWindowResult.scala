package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the task was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The ID of the task removed from the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}

object DeregisterTaskFromMaintenanceWindowResult {
  @scala.inline
  def apply(): DeregisterTaskFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
  }
  @scala.inline
  implicit class DeregisterTaskFromMaintenanceWindowResultOps[Self <: DeregisterTaskFromMaintenanceWindowResult] (val x: Self) extends AnyVal {
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
    def withWindowTaskId(value: MaintenanceWindowTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTaskId")(js.undefined)
        ret
    }
  }
  
}

