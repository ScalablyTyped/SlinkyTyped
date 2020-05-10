package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MaintenanceWindow defines the maintenance window to be used for the
  * cluster.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  /**
    * DailyMaintenanceWindow specifies a daily maintenance operation window.
    */
  var dailyMaintenanceWindow: js.UndefOr[SchemaDailyMaintenanceWindow] = js.native
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
    def withDailyMaintenanceWindow(value: SchemaDailyMaintenanceWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyMaintenanceWindow")(js.undefined)
        ret
    }
  }
  
}

