package typingsSlinky.cordovaPluginDeviceMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object with options for watchAcceleration */
@js.native
trait AccelerometerOptions extends js.Object {
  /** How often to retrieve the Acceleration in milliseconds. (Default: 10000) */
  var frequency: js.UndefOr[Double] = js.native
}

object AccelerometerOptions {
  @scala.inline
  def apply(): AccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerOptions]
  }
  @scala.inline
  implicit class AccelerometerOptionsOps[Self <: AccelerometerOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
  }
  
}

