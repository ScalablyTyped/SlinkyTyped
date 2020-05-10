package typingsSlinky.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceMotionAccelerometerOptions extends js.Object {
  var frequency: Double = js.native
}

object IDeviceMotionAccelerometerOptions {
  @scala.inline
  def apply(frequency: Double): IDeviceMotionAccelerometerOptions = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceMotionAccelerometerOptions]
  }
  @scala.inline
  implicit class IDeviceMotionAccelerometerOptionsOps[Self <: IDeviceMotionAccelerometerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

