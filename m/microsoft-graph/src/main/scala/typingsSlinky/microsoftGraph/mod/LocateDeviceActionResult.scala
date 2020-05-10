package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocateDeviceActionResult extends DeviceActionResult {
  // device location
  var deviceLocation: js.UndefOr[DeviceGeoLocation] = js.native
}

object LocateDeviceActionResult {
  @scala.inline
  def apply(): LocateDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateDeviceActionResult]
  }
  @scala.inline
  implicit class LocateDeviceActionResultOps[Self <: LocateDeviceActionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceLocation(value: DeviceGeoLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceLocation")(js.undefined)
        ret
    }
  }
  
}

