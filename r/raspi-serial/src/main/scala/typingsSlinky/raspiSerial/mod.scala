package typingsSlinky.raspiSerial

import typingsSlinky.node.Buffer
import typingsSlinky.raspiPeripheral.mod.Peripheral
import typingsSlinky.raspiSerial.raspiSerialNumbers.`110`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`115200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`1200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`134`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`150`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`1800`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`19200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`1`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`2400`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`2`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`300`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`38400`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`4800`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`50`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`57600`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`5`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`600`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`6`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`75`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`7`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`8`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`9600`
import typingsSlinky.raspiSerial.raspiSerialStrings.even
import typingsSlinky.raspiSerial.raspiSerialStrings.mark
import typingsSlinky.raspiSerial.raspiSerialStrings.none
import typingsSlinky.raspiSerial.raspiSerialStrings.odd
import typingsSlinky.raspiSerial.raspiSerialStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-serial", "DEFAULT_PORT")
  @js.native
  val DEFAULT_PORT: /* "/dev/ttyAMA0" */ String = js.native
  
  @JSImport("raspi-serial", "PARITY_EVEN")
  @js.native
  val PARITY_EVEN: /* "even" */ String = js.native
  
  @JSImport("raspi-serial", "PARITY_MARK")
  @js.native
  val PARITY_MARK: /* "mark" */ String = js.native
  
  @JSImport("raspi-serial", "PARITY_NONE")
  @js.native
  val PARITY_NONE: /* "none" */ String = js.native
  
  @JSImport("raspi-serial", "PARITY_ODD")
  @js.native
  val PARITY_ODD: /* "odd" */ String = js.native
  
  @JSImport("raspi-serial", "PARITY_SPACE")
  @js.native
  val PARITY_SPACE: /* "space" */ String = js.native
  
  @JSImport("raspi-serial", "Serial")
  @js.native
  class Serial () extends Peripheral {
    def this(hasPortIdBaudRateDataBitsStopBitsParity: Options) = this()
    
    var _isOpen: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _portId: js.Any = js.native
    
    var _portInstance: js.Any = js.native
    
    val baudRate: Double = js.native
    
    def close(): Unit = js.native
    def close(cb: ErrorCallback): Unit = js.native
    
    val dataBits: Double = js.native
    
    def flush(): Unit = js.native
    def flush(cb: ErrorCallback): Unit = js.native
    
    def open(): Unit = js.native
    def open(cb: Callback): Unit = js.native
    
    val parity: String = js.native
    
    val port: String = js.native
    
    val stopBits: Double = js.native
    
    def write(data: String): Unit = js.native
    def write(data: String, cb: Callback): Unit = js.native
    def write(data: Buffer): Unit = js.native
    def write(data: Buffer, cb: Callback): Unit = js.native
  }
  
  type Callback = js.Function0[Unit]
  
  type ErrorCallback = js.Function1[/* err */ js.Error | String, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var baudRate: js.UndefOr[
        `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ] = js.native
    
    var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.native
    
    var parity: js.UndefOr[none | even | mark | odd | space] = js.native
    
    var portId: js.UndefOr[String] = js.native
    
    var stopBits: js.UndefOr[`1` | `2`] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaudRate(
        value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
      
      @scala.inline
      def setDataBits(value: `8` | `7` | `6` | `5`): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      @scala.inline
      def setParity(value: none | even | mark | odd | space): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
      
      @scala.inline
      def setPortId(value: String): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortIdUndefined: Self = StObject.set(x, "portId", js.undefined)
      
      @scala.inline
      def setStopBits(value: `1` | `2`): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
    }
  }
}
