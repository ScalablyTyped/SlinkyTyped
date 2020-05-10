package typingsSlinky.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServoOptions extends js.Object {
  /**
    * PWM Controller frequency for the servo
    */
  var freq: js.UndefOr[Double] = js.native
  /**
    * Duration in ms of pulse at position 100
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Duration in ms of pulse at position 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Servo controller pin. Which pin (0 to 15) is the servo connected to?
    */
  var pin: Double = js.native
  /**
    * PWM Interface Object
    */
  var pwm: js.Object = js.native
}

object ServoOptions {
  @scala.inline
  def apply(pin: Double, pwm: js.Object): ServoOptions = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoOptions]
  }
  @scala.inline
  implicit class ServoOptionsOps[Self <: ServoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPwm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
  }
  
}

