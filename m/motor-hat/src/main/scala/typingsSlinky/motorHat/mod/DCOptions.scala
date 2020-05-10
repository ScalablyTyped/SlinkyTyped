package typingsSlinky.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DCOptions extends js.Object {
  var frequency: js.UndefOr[Double] = js.native
  /**
    * Pin definition for the motor
    */
  var pins: PinDefinition = js.native
  /**
    * PWM Interface Object
    */
  var pwm: js.Object = js.native
  var speed: js.UndefOr[Double] = js.native
}

object DCOptions {
  @scala.inline
  def apply(pins: PinDefinition, pwm: js.Object): DCOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DCOptions]
  }
  @scala.inline
  implicit class DCOptionsOps[Self <: DCOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPins(value: PinDefinition): Self = {
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
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
  }
  
}

