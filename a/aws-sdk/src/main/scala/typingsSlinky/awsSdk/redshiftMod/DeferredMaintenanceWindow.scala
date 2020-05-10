package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredMaintenanceWindow extends js.Object {
  /**
    *  A timestamp for the end of the time period when we defer maintenance.
    */
  var DeferMaintenanceEndTime: js.UndefOr[js.Date] = js.native
  /**
    * A unique identifier for the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  A timestamp for the beginning of the time period when we defer maintenance.
    */
  var DeferMaintenanceStartTime: js.UndefOr[js.Date] = js.native
}

object DeferredMaintenanceWindow {
  @scala.inline
  def apply(): DeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferredMaintenanceWindow]
  }
  @scala.inline
  implicit class DeferredMaintenanceWindowOps[Self <: DeferredMaintenanceWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferMaintenanceEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenanceEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferMaintenanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferMaintenanceStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenanceStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceStartTime")(js.undefined)
        ret
    }
  }
  
}

