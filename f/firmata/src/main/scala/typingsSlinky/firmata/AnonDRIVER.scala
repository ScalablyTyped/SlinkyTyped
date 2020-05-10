package typingsSlinky.firmata

import typingsSlinky.firmata.mod.STEPPER_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDRIVER extends js.Object {
  var DRIVER: STEPPER_TYPE = js.native
  var FOUR_WIRE: STEPPER_TYPE = js.native
  var TWO_WIRE: STEPPER_TYPE = js.native
}

object AnonDRIVER {
  @scala.inline
  def apply(DRIVER: STEPPER_TYPE, FOUR_WIRE: STEPPER_TYPE, TWO_WIRE: STEPPER_TYPE): AnonDRIVER = {
    val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], FOUR_WIRE = FOUR_WIRE.asInstanceOf[js.Any], TWO_WIRE = TWO_WIRE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDRIVER]
  }
  @scala.inline
  implicit class AnonDRIVEROps[Self <: AnonDRIVER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDRIVER(value: STEPPER_TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DRIVER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFOUR_WIRE(value: STEPPER_TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FOUR_WIRE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWO_WIRE(value: STEPPER_TYPE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWO_WIRE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

