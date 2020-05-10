package typingsSlinky.openfin.monitorMod

import typingsSlinky.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorDetails extends js.Object {
  var available: DipScaleRects = js.native
  var availableRect: Rect = js.native
  var deviceId: String = js.native
  var deviceScaleFactor: Double = js.native
  var displayDeviceActive: Boolean = js.native
  var dpi: Point = js.native
  var monitor: DipScaleRects = js.native
  var monitorRect: Rect = js.native
  var name: String = js.native
}

object MonitorDetails {
  @scala.inline
  def apply(
    available: DipScaleRects,
    availableRect: Rect,
    deviceId: String,
    deviceScaleFactor: Double,
    displayDeviceActive: Boolean,
    dpi: Point,
    monitor: DipScaleRects,
    monitorRect: Rect,
    name: String
  ): MonitorDetails = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], availableRect = availableRect.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], displayDeviceActive = displayDeviceActive.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], monitorRect = monitorRect.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorDetails]
  }
  @scala.inline
  implicit class MonitorDetailsOps[Self <: MonitorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: DipScaleRects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailableRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayDeviceActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDeviceActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpi(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitor(value: DipScaleRects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitorRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

