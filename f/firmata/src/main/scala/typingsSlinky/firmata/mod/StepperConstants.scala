package typingsSlinky.firmata.mod

import typingsSlinky.firmata.anon.ACCEL
import typingsSlinky.firmata.anon.CCW
import typingsSlinky.firmata.anon.DRIVER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperConstants extends js.Object {
  var DIRECTION: CCW = js.native
  var RUNSTATE: ACCEL = js.native
  var TYPE: DRIVER = js.native
}

object StepperConstants {
  @scala.inline
  def apply(DIRECTION: CCW, RUNSTATE: ACCEL, TYPE: DRIVER): StepperConstants = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION.asInstanceOf[js.Any], RUNSTATE = RUNSTATE.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperConstants]
  }
  @scala.inline
  implicit class StepperConstantsOps[Self <: StepperConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDIRECTION(value: CCW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUNSTATE(value: ACCEL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUNSTATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE(value: DRIVER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

