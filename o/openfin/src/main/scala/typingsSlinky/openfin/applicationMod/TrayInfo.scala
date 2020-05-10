package typingsSlinky.openfin.applicationMod

import typingsSlinky.openfin.monitorMod.MonitorInfo
import typingsSlinky.openfin.shapesMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrayInfo extends js.Object {
  var bounds: Bounds = js.native
  var monitorInfo: MonitorInfo = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object TrayInfo {
  @scala.inline
  def apply(bounds: Bounds, monitorInfo: MonitorInfo, x: Double, y: Double): TrayInfo = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayInfo]
  }
  @scala.inline
  implicit class TrayInfoOps[Self <: TrayInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitorInfo(value: MonitorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

