package typingsSlinky.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperSpeed extends js.Object {
  /**
    * Speed in pulses per second (pulses can be steps, microsteps, etc)
    */
  var pps: js.UndefOr[Double] = js.native
  /**
    * Speed in revolutions per minute
    */
  var rpm: js.UndefOr[Double] = js.native
  /**
    * Speed in steps per second
    */
  var sps: js.UndefOr[Double] = js.native
}

object StepperSpeed {
  @scala.inline
  def apply(): StepperSpeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepperSpeed]
  }
  @scala.inline
  implicit class StepperSpeedOps[Self <: StepperSpeed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pps")(js.undefined)
        ret
    }
    @scala.inline
    def withRpm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpm")(js.undefined)
        ret
    }
    @scala.inline
    def withSps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sps")(js.undefined)
        ret
    }
  }
  
}

