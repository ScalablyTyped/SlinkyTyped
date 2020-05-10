package typingsSlinky.cordovaPluginDeviceMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /**
    * This plugin provides access to the device's accelerometer. The accelerometer is a motion sensor
    * that detects the change (delta) in movement relative to the current device orientation,
    * in three dimensions along the x, y, and z axis.
    */
  var accelerometer: Accelerometer = js.native
}

object Navigator {
  @scala.inline
  def apply(accelerometer: Accelerometer): Navigator = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerometer(value: Accelerometer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerometer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

