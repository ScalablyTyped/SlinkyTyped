package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerCurrentTimeMarker extends js.Object {
  var updateInterval: js.UndefOr[Double] = js.native
  var useLocalTimezone: js.UndefOr[Boolean] = js.native
}

object SchedulerCurrentTimeMarker {
  @scala.inline
  def apply(): SchedulerCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerCurrentTimeMarker]
  }
  @scala.inline
  implicit class SchedulerCurrentTimeMarkerOps[Self <: SchedulerCurrentTimeMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLocalTimezone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLocalTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLocalTimezone")(js.undefined)
        ret
    }
  }
  
}

