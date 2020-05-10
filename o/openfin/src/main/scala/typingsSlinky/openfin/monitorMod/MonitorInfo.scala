package typingsSlinky.openfin.monitorMod

import typingsSlinky.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorInfo extends js.Object {
  var deviceScaleFactor: Double = js.native
  var dpi: Point = js.native
  var nonPrimaryMonitors: js.Array[MonitorDetails] = js.native
  var primaryMonitor: MonitorDetails = js.native
  var reason: String = js.native
  var taskBar: TaskBar = js.native
  var virtualScreen: DipRect = js.native
}

object MonitorInfo {
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    dpi: Point,
    nonPrimaryMonitors: js.Array[MonitorDetails],
    primaryMonitor: MonitorDetails,
    reason: String,
    taskBar: TaskBar,
    virtualScreen: DipRect
  ): MonitorInfo = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], nonPrimaryMonitors = nonPrimaryMonitors.asInstanceOf[js.Any], primaryMonitor = primaryMonitor.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], taskBar = taskBar.asInstanceOf[js.Any], virtualScreen = virtualScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfo]
  }
  @scala.inline
  implicit class MonitorInfoOps[Self <: MonitorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpi(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonPrimaryMonitors(value: js.Array[MonitorDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPrimaryMonitors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryMonitor(value: MonitorDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryMonitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskBar(value: TaskBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualScreen(value: DipRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

