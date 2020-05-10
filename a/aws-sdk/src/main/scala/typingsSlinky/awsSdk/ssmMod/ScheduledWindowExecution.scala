package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledWindowExecution extends js.Object {
  /**
    * The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.
    */
  var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The name of the maintenance window to be run.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The ID of the maintenance window to be run.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}

object ScheduledWindowExecution {
  @scala.inline
  def apply(): ScheduledWindowExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledWindowExecution]
  }
  @scala.inline
  implicit class ScheduledWindowExecutionOps[Self <: ScheduledWindowExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionTime(value: MaintenanceWindowStringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: MaintenanceWindowName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
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
  }
  
}

