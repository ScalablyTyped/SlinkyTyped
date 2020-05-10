package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maintenance window. This specifies when a v2 Cloud SQL instance should
  * preferably be restarted for system maintenance purposes.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  /**
    * day of week (1-7), starting on Monday.
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * hour of day - 0 to 23.
    */
  var hour: js.UndefOr[Double] = js.native
  /**
    * This is always sql#maintenanceWindow.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Maintenance timing setting: canary (Earlier) or stable (Later).  Learn
    * more.
    */
  var updateTrack: js.UndefOr[String] = js.native
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
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTrack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTrack")(js.undefined)
        ret
    }
  }
  
}

