package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maintenance window for managed Google Play Accounts. This allows Play store
  * to update the apps on the foreground in the designated window.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  /**
    * Duration of the maintenance window, in milliseconds. The duration must be
    * between 30 minutes and 24 hours (inclusive).
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * Start time of the maintenance window, in milliseconds after midnight on
    * the device. Windows can span midnight.
    */
  var startTimeAfterMidnightMs: js.UndefOr[String] = js.native
}

object SchemaMaintenanceWindow {
  @scala.inline
  def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  @scala.inline
  implicit class SchemaMaintenanceWindowOps[Self <: SchemaMaintenanceWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeAfterMidnightMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeAfterMidnightMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeAfterMidnightMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeAfterMidnightMs")(js.undefined)
        ret
    }
  }
  
}

