package typingsSlinky.motorHat.mod

import typingsSlinky.motorHat.anon.W1
import typingsSlinky.motorHat.motorHatNumbers.`16`
import typingsSlinky.motorHat.motorHatNumbers.`8`
import typingsSlinky.motorHat.motorHatStrings.double
import typingsSlinky.motorHat.motorHatStrings.interleaved
import typingsSlinky.motorHat.motorHatStrings.microstep
import typingsSlinky.motorHat.motorHatStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperOptions extends js.Object {
  var current: js.UndefOr[Double] = js.native
  /**
    * PWM Controller frequency for the stepper
    */
  var frequency: js.UndefOr[Double] = js.native
  /**
    * number of microsteps per step
    */
  var microsteps: js.UndefOr[`8` | `16`] = js.native
  /**
    * Pin definition for the motor
    */
  var pins: W1 = js.native
  /**
    * Pulses per second
    */
  var pps: js.UndefOr[Double] = js.native
  /**
    * PWM Interface Object
    */
  var pwm: js.Object = js.native
  /**
    * Revolutions per minute
    */
  var rpm: js.UndefOr[Double] = js.native
  /**
    * Steps per second
    */
  var sps: js.UndefOr[Double] = js.native
  /**
    * Steps per revolution of the stepper motor
    */
  var steps: js.UndefOr[Double] = js.native
  /**
    * Stepping style
    */
  var style: js.UndefOr[single | double | interleaved | microstep] = js.native
}

object StepperOptions {
  @scala.inline
  def apply(pins: W1, pwm: js.Object): StepperOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
  @scala.inline
  implicit class StepperOptionsOps[Self <: StepperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPins(value: W1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPwm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
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
    @scala.inline
    def withMicrosteps(value: `8` | `16`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsteps")(js.undefined)
        ret
    }
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
    @scala.inline
    def withSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: single | double | interleaved | microstep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

