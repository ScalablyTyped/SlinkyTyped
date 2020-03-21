package typingsSlinky.firmata.mod

import typingsSlinky.firmata.AnonACCEL
import typingsSlinky.firmata.AnonCCW
import typingsSlinky.firmata.AnonDRIVER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperConstants extends js.Object {
  var DIRECTION: AnonCCW
  var RUNSTATE: AnonACCEL
  var TYPE: AnonDRIVER
}

object StepperConstants {
  @scala.inline
  def apply(DIRECTION: AnonCCW, RUNSTATE: AnonACCEL, TYPE: AnonDRIVER): StepperConstants = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION.asInstanceOf[js.Any], RUNSTATE = RUNSTATE.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StepperConstants]
  }
}

