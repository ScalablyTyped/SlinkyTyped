package typingsSlinky.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinModes extends js.Object {
  var ANALOG: PIN_MODE = js.native
  var I2C: PIN_MODE = js.native
  var IGNORE: PIN_MODE = js.native
  var INPUT: PIN_MODE = js.native
  var ONEWIRE: PIN_MODE = js.native
  var OUTPUT: PIN_MODE = js.native
  var PING_READ: PIN_MODE = js.native
  var PULLUP: PIN_MODE = js.native
  var PWM: PIN_MODE = js.native
  var SERIAL: PIN_MODE = js.native
  var SERVO: PIN_MODE = js.native
  var SHIFT: PIN_MODE = js.native
  var STEPPER: PIN_MODE = js.native
  var UNKOWN: PIN_MODE = js.native
}

object PinModes {
  @scala.inline
  def apply(
    ANALOG: PIN_MODE,
    I2C: PIN_MODE,
    IGNORE: PIN_MODE,
    INPUT: PIN_MODE,
    ONEWIRE: PIN_MODE,
    OUTPUT: PIN_MODE,
    PING_READ: PIN_MODE,
    PULLUP: PIN_MODE,
    PWM: PIN_MODE,
    SERIAL: PIN_MODE,
    SERVO: PIN_MODE,
    SHIFT: PIN_MODE,
    STEPPER: PIN_MODE,
    UNKOWN: PIN_MODE
  ): PinModes = {
    val __obj = js.Dynamic.literal(ANALOG = ANALOG.asInstanceOf[js.Any], I2C = I2C.asInstanceOf[js.Any], IGNORE = IGNORE.asInstanceOf[js.Any], INPUT = INPUT.asInstanceOf[js.Any], ONEWIRE = ONEWIRE.asInstanceOf[js.Any], OUTPUT = OUTPUT.asInstanceOf[js.Any], PING_READ = PING_READ.asInstanceOf[js.Any], PULLUP = PULLUP.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any], SERIAL = SERIAL.asInstanceOf[js.Any], SERVO = SERVO.asInstanceOf[js.Any], SHIFT = SHIFT.asInstanceOf[js.Any], STEPPER = STEPPER.asInstanceOf[js.Any], UNKOWN = UNKOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinModes]
  }
  @scala.inline
  implicit class PinModesOps[Self <: PinModes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANALOG(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANALOG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI2C(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("I2C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIGNORE(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IGNORE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINPUT(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withONEWIRE(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONEWIRE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOUTPUT(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OUTPUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPING_READ(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PING_READ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPULLUP(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PULLUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPWM(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PWM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSERIAL(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERIAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSERVO(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERVO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHIFT(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHIFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTEPPER(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STEPPER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKOWN(value: PIN_MODE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKOWN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

