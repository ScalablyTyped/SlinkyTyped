package typingsSlinky.motorHat

import typingsSlinky.motorHat.mod.MotorPins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonM1 extends js.Object {
  var M1: MotorPins = js.native
  var M2: MotorPins = js.native
  var M3: MotorPins = js.native
  var M4: MotorPins = js.native
}

object AnonM1 {
  @scala.inline
  def apply(M1: MotorPins, M2: MotorPins, M3: MotorPins, M4: MotorPins): AnonM1 = {
    val __obj = js.Dynamic.literal(M1 = M1.asInstanceOf[js.Any], M2 = M2.asInstanceOf[js.Any], M3 = M3.asInstanceOf[js.Any], M4 = M4.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonM1]
  }
  @scala.inline
  implicit class AnonM1Ops[Self <: AnonM1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withM1(value: MotorPins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM2(value: MotorPins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM3(value: MotorPins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM4(value: MotorPins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M4")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

