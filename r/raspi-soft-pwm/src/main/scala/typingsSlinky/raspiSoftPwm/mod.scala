package typingsSlinky.raspiSoftPwm

import typingsSlinky.raspiPeripheral.mod.Peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-soft-pwm", "SoftPWM")
  @js.native
  class SoftPWM protected () extends Peripheral {
    def this(config: String) = this()
    def this(config: Double) = this()
    def this(config: Config) = this()
    
    var _dutyCycle: js.Any = js.native
    
    var _frequency: js.Any = js.native
    
    var _pwm: js.Any = js.native
    
    var _range: js.Any = js.native
    
    val dutyCycle: Double = js.native
    
    val frequency: Double = js.native
    
    val range: Double = js.native
    
    def write(dutyCycle: Double): Unit = js.native
  }
  
  @js.native
  trait Config extends StObject {
    
    var frequency: js.UndefOr[Double] = js.native
    
    var pin: Double | String = js.native
    
    var range: js.UndefOr[Double] = js.native
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
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
}
