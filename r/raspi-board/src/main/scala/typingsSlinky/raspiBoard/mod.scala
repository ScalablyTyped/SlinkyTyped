package typingsSlinky.raspiBoard

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.j5IoTypes.mod.IPinInfo
import typingsSlinky.j5IoTypes.mod.PeripheralType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-board", "VERSION_1_MODEL_A")
  @js.native
  val VERSION_1_MODEL_A: /* "rpi1_a" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_1_MODEL_A_PLUS")
  @js.native
  val VERSION_1_MODEL_A_PLUS: /* "rpi1_aplus" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_1_MODEL_B_PLUS")
  @js.native
  val VERSION_1_MODEL_B_PLUS: /* "rpi1_bplus" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_1_MODEL_B_REV_1")
  @js.native
  val VERSION_1_MODEL_B_REV_1: /* "rpi1_b1" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_1_MODEL_B_REV_2")
  @js.native
  val VERSION_1_MODEL_B_REV_2: /* "rpi1_b2" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_1_MODEL_ZERO")
  @js.native
  val VERSION_1_MODEL_ZERO: /* "rpi1_zero" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_1_MODEL_ZERO_W")
  @js.native
  val VERSION_1_MODEL_ZERO_W: /* "rpi1_zerow" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_2_MODEL_B")
  @js.native
  val VERSION_2_MODEL_B: /* "rpi2_b" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_3_MODEL_A_PLUS")
  @js.native
  val VERSION_3_MODEL_A_PLUS: /* "rpi3_aplus" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_3_MODEL_B")
  @js.native
  val VERSION_3_MODEL_B: /* "rpi3_b" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_3_MODEL_B_PLUS")
  @js.native
  val VERSION_3_MODEL_B_PLUS: /* "rpi3_bplus" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_4_MODEL_B")
  @js.native
  val VERSION_4_MODEL_B: /* "rpi4_b" */ String = js.native
  
  @JSImport("raspi-board", "VERSION_UNKNOWN")
  @js.native
  val VERSION_UNKNOWN: /* "unknown" */ String = js.native
  
  @JSImport("raspi-board", "getBoardRevision")
  @js.native
  def getBoardRevision(): String = js.native
  
  @JSImport("raspi-board", "getGpioNumber")
  @js.native
  def getGpioNumber(alias: String): Double | Null = js.native
  @JSImport("raspi-board", "getGpioNumber")
  @js.native
  def getGpioNumber(alias: Double): Double | Null = js.native
  
  @JSImport("raspi-board", "getPinNumber")
  @js.native
  def getPinNumber(alias: String): Double | Null = js.native
  @JSImport("raspi-board", "getPinNumber")
  @js.native
  def getPinNumber(alias: Double): Double | Null = js.native
  
  @JSImport("raspi-board", "getPins")
  @js.native
  def getPins(): NumberDictionary[IRaspiPinInfo] = js.native
  
  @js.native
  trait IRaspiPinInfo extends IPinInfo {
    
    var gpio: Double = js.native
  }
  object IRaspiPinInfo {
    
    @scala.inline
    def apply(gpio: Double, peripherals: js.Array[PeripheralType], pins: js.Array[String]): IRaspiPinInfo = {
      val __obj = js.Dynamic.literal(gpio = gpio.asInstanceOf[js.Any], peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRaspiPinInfo]
    }
    
    @scala.inline
    implicit class IRaspiPinInfoMutableBuilder[Self <: IRaspiPinInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGpio(value: Double): Self = StObject.set(x, "gpio", value.asInstanceOf[js.Any])
    }
  }
}
