package typingsSlinky.raspiGpio

import typingsSlinky.raspiPeripheral.mod.Peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-gpio", "DigitalInput")
  @js.native
  class DigitalInput protected () extends Peripheral {
    def this(config: String) = this()
    def this(config: Double) = this()
    def this(config: Config) = this()
    
    var _currentValue: js.Any = js.native
    
    var _input: js.Any = js.native
    
    def read(): Double = js.native
    
    val value: Double = js.native
  }
  
  @JSImport("raspi-gpio", "DigitalOutput")
  @js.native
  class DigitalOutput protected () extends Peripheral {
    def this(config: String) = this()
    def this(config: Double) = this()
    def this(config: Config) = this()
    
    var _currentValue: js.Any = js.native
    
    var _output: js.Any = js.native
    
    val value: Double = js.native
    
    def write(value: Double): Unit = js.native
  }
  
  @JSImport("raspi-gpio", "HIGH")
  @js.native
  val HIGH: /* 1 */ Double = js.native
  
  @JSImport("raspi-gpio", "LOW")
  @js.native
  val LOW: /* 0 */ Double = js.native
  
  @JSImport("raspi-gpio", "PULL_DOWN")
  @js.native
  val PULL_DOWN: Double = js.native
  
  @JSImport("raspi-gpio", "PULL_NONE")
  @js.native
  val PULL_NONE: Double = js.native
  
  @JSImport("raspi-gpio", "PULL_UP")
  @js.native
  val PULL_UP: Double = js.native
  
  @js.native
  trait Config extends StObject {
    
    var pin: Double | String = js.native
    
    var pullResistor: js.UndefOr[Double] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(pin: Double | String): Config = {
      val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullResistor(value: Double): Self = StObject.set(x, "pullResistor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullResistorUndefined: Self = StObject.set(x, "pullResistor", js.undefined)
    }
  }
}
