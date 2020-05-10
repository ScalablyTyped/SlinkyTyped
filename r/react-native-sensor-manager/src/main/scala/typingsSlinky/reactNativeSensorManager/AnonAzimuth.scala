package typingsSlinky.reactNativeSensorManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAzimuth extends js.Object {
  var azimuth: Double = js.native
  var pitch: Double = js.native
  var roll: Double = js.native
}

object AnonAzimuth {
  @scala.inline
  def apply(azimuth: Double, pitch: Double, roll: Double): AnonAzimuth = {
    val __obj = js.Dynamic.literal(azimuth = azimuth.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAzimuth]
  }
  @scala.inline
  implicit class AnonAzimuthOps[Self <: AnonAzimuth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAzimuth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

