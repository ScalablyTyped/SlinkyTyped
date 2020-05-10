package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the target definition in this maintenance window.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}

object RegisterTargetWithMaintenanceWindowResult {
  @scala.inline
  def apply(): RegisterTargetWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
  }
  @scala.inline
  implicit class RegisterTargetWithMaintenanceWindowResultOps[Self <: RegisterTargetWithMaintenanceWindowResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

