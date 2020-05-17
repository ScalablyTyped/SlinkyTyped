package typingsSlinky.firmata.anon

import typingsSlinky.firmata.mod.STEPPER_DIRECTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CCW extends js.Object {
  var CCW: STEPPER_DIRECTION = js.native
  var CW: STEPPER_DIRECTION = js.native
}

object CCW {
  @scala.inline
  def apply(CCW: STEPPER_DIRECTION, CW: STEPPER_DIRECTION): CCW = {
    val __obj = js.Dynamic.literal(CCW = CCW.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any])
    __obj.asInstanceOf[CCW]
  }
  @scala.inline
  implicit class CCWOps[Self <: CCW] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCCW(value: STEPPER_DIRECTION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CCW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCW(value: STEPPER_DIRECTION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

