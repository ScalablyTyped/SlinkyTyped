package typingsSlinky.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotorPins extends js.Object {
  val IN1: Double = js.native
  val IN2: Double = js.native
  val PWM: Double = js.native
}

object MotorPins {
  @scala.inline
  def apply(IN1: Double, IN2: Double, PWM: Double): MotorPins = {
    val __obj = js.Dynamic.literal(IN1 = IN1.asInstanceOf[js.Any], IN2 = IN2.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorPins]
  }
  @scala.inline
  implicit class MotorPinsOps[Self <: MotorPins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIN1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIN2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPWM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PWM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

