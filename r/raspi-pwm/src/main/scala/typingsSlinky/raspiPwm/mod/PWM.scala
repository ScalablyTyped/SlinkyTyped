package typingsSlinky.raspiPwm.mod

import typingsSlinky.raspiPeripheral.mod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raspi-pwm", "PWM")
@js.native
class PWM () extends Peripheral {
  def this(config: String) = this()
  def this(config: Double) = this()
  def this(config: Config) = this()
  
  var _dutyCycleValue: js.Any = js.native
  
  var _frequencyValue: js.Any = js.native
  
  var _pwm: js.Any = js.native
  
  var _pwmPort: js.Any = js.native
  
  val dutyCycle: Double = js.native
  
  val frequency: Double = js.native
  
  def write(dutyCycle: Double): Unit = js.native
}
