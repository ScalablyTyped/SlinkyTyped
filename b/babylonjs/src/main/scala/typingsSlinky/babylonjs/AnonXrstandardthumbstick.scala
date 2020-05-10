package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXrstandardthumbstick extends js.Object {
  var `xr-standard-thumbstick`: AnonXaxis = js.native
  var `xr-standard-touchpad`: AnonXaxis = js.native
}

object AnonXrstandardthumbstick {
  @scala.inline
  def apply(`xr-standard-thumbstick`: AnonXaxis, `xr-standard-touchpad`: AnonXaxis): AnonXrstandardthumbstick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXrstandardthumbstick]
  }
  @scala.inline
  implicit class AnonXrstandardthumbstickOps[Self <: AnonXrstandardthumbstick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withXr-standard-thumbstick`(value: AnonXaxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-thumbstick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXr-standard-touchpad`(value: AnonXaxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xr-standard-touchpad")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

