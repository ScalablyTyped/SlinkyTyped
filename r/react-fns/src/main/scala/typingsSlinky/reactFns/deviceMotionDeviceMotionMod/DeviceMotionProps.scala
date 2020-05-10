package typingsSlinky.reactFns.deviceMotionDeviceMotionMod

import org.scalajs.dom.experimental.deviceorientation.DeviceAcceleration
import org.scalajs.dom.experimental.deviceorientation.DeviceRotationRate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMotionProps extends js.Object {
  var acceleration: DeviceAcceleration | Null = js.native
  var accelerationIncludingGravity: DeviceAcceleration | Null = js.native
  var interval: Double | Null = js.native
  var rotationRate: DeviceRotationRate | Null = js.native
}

object DeviceMotionProps {
  @scala.inline
  def apply(): DeviceMotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionProps]
  }
  @scala.inline
  implicit class DeviceMotionPropsOps[Self <: DeviceMotionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleration(value: DeviceAcceleration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccelerationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(null)
        ret
    }
    @scala.inline
    def withAccelerationIncludingGravity(value: DeviceAcceleration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationIncludingGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccelerationIncludingGravityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationIncludingGravity")(null)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntervalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(null)
        ret
    }
    @scala.inline
    def withRotationRate(value: DeviceRotationRate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationRateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationRate")(null)
        ret
    }
  }
  
}

