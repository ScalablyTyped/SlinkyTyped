package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the task in the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}

object RegisterTaskWithMaintenanceWindowResult {
  @scala.inline
  def apply(): RegisterTaskWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
  }
  @scala.inline
  implicit class RegisterTaskWithMaintenanceWindowResultOps[Self <: RegisterTaskWithMaintenanceWindowResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

