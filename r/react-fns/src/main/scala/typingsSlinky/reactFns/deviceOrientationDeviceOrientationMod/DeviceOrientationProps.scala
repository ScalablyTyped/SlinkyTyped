package typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOrientationProps extends js.Object {
  var absolute: Boolean = js.native
  var alpha: Double | Null = js.native
  var beta: Double | Null = js.native
  var gamma: Double | Null = js.native
}

object DeviceOrientationProps {
  @scala.inline
  def apply(absolute: Boolean): DeviceOrientationProps = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationProps]
  }
  @scala.inline
  implicit class DeviceOrientationPropsOps[Self <: DeviceOrientationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlphaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(null)
        ret
    }
    @scala.inline
    def withBeta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBetaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(null)
        ret
    }
    @scala.inline
    def withGamma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGammaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(null)
        ret
    }
  }
  
}

