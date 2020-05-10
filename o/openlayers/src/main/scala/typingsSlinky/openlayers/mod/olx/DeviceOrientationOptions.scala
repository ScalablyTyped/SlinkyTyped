package typingsSlinky.openlayers.mod.olx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOrientationOptions extends js.Object {
  var tracking: js.UndefOr[Boolean] = js.native
}

object DeviceOrientationOptions {
  @scala.inline
  def apply(): DeviceOrientationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOrientationOptions]
  }
  @scala.inline
  implicit class DeviceOrientationOptionsOps[Self <: DeviceOrientationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking")(js.undefined)
        ret
    }
  }
  
}

