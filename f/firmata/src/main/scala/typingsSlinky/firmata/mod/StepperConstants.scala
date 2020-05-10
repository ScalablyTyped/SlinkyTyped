package typingsSlinky.firmata.mod

import typingsSlinky.firmata.AnonACCEL
import typingsSlinky.firmata.AnonCCW
import typingsSlinky.firmata.AnonDRIVER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepperConstants extends js.Object {
  var DIRECTION: AnonCCW = js.native
  var RUNSTATE: AnonACCEL = js.native
  var TYPE: AnonDRIVER = js.native
}

object StepperConstants {
  @scala.inline
  def apply(DIRECTION: AnonCCW, RUNSTATE: AnonACCEL, TYPE: AnonDRIVER): StepperConstants = {
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
    def withDIRECTION(value: AnonCCW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUNSTATE(value: AnonACCEL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUNSTATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE(value: AnonDRIVER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

