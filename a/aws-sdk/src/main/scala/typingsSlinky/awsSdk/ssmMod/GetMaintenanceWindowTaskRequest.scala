package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowTaskRequest extends js.Object {
  /**
    * The maintenance window ID that includes the task to retrieve.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The maintenance window task ID to retrieve.
    */
  var WindowTaskId: MaintenanceWindowTaskId = js.native
}

object GetMaintenanceWindowTaskRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): GetMaintenanceWindowTaskRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowTaskRequest]
  }
  @scala.inline
  implicit class GetMaintenanceWindowTaskRequestOps[Self <: GetMaintenanceWindowTaskRequest] (val x: Self) extends AnyVal {
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

