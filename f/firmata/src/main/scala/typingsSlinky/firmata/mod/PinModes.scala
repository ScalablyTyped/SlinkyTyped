package typingsSlinky.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinModes extends StObject {
  
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
  implicit class PinModesMutableBuilder[Self <: PinModes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setANALOG(value: PIN_MODE): Self = StObject.set(x, "ANALOG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI2C(value: PIN_MODE): Self = StObject.set(x, "I2C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIGNORE(value: PIN_MODE): Self = StObject.set(x, "IGNORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINPUT(value: PIN_MODE): Self = StObject.set(x, "INPUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setONEWIRE(value: PIN_MODE): Self = StObject.set(x, "ONEWIRE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOUTPUT(value: PIN_MODE): Self = StObject.set(x, "OUTPUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPING_READ(value: PIN_MODE): Self = StObject.set(x, "PING_READ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPULLUP(value: PIN_MODE): Self = StObject.set(x, "PULLUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPWM(value: PIN_MODE): Self = StObject.set(x, "PWM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSERIAL(value: PIN_MODE): Self = StObject.set(x, "SERIAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSERVO(value: PIN_MODE): Self = StObject.set(x, "SERVO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHIFT(value: PIN_MODE): Self = StObject.set(x, "SHIFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTEPPER(value: PIN_MODE): Self = StObject.set(x, "STEPPER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKOWN(value: PIN_MODE): Self = StObject.set(x, "UNKOWN", value.asInstanceOf[js.Any])
  }
}
