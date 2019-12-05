package typingsSlinky.piDashSpi

import typingsSlinky.node.Buffer
import typingsSlinky.piDashSpi.piDashSpiMod.SPI
import typingsSlinky.piDashSpi.piDashSpiMod.mode
import typingsSlinky.piDashSpi.piDashSpiMod.order
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pi-spi", JSImport.Namespace)
@js.native
object piDashSpiMod extends js.Object {
  @js.native
  class SPI () extends js.Object {
    def bitOrder(): Double = js.native
    def bitOrder(order: order): Unit = js.native
    def clockSpeed(): Double = js.native
    def clockSpeed(speed: Double): Unit = js.native
    def close(cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def dataMode(): Double = js.native
    def dataMode(mode: mode): Unit = js.native
    def read(readcount: Double, cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]): Unit = js.native
    def transfer(writebuf: Buffer, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
    def transfer(
      writebuf: Buffer,
      readcount: Double,
      cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]
    ): Unit = js.native
    def write(writebuf: Buffer, cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]): Unit = js.native
  }
  
  @js.native
  sealed trait mode extends js.Object
  
  @js.native
  sealed trait order extends js.Object
  
  def initialize(device: String): SPI = js.native
  @js.native
  object mode extends js.Object {
    @js.native
    sealed trait CPHA extends mode
    
    @js.native
    sealed trait CPOL extends mode
    
    /* 0x01 */ val CPHA: typingsSlinky.piDashSpi.piDashSpiMod.mode.CPHA with Double = js.native
    /* 0x02 */ val CPOL: typingsSlinky.piDashSpi.piDashSpiMod.mode.CPOL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[mode with Double] = js.native
  }
  
  @js.native
  object order extends js.Object {
    @js.native
    sealed trait LSB_FIRST extends order
    
    @js.native
    sealed trait MSB_FIRST extends order
    
    /* 1 */ val LSB_FIRST: typingsSlinky.piDashSpi.piDashSpiMod.order.LSB_FIRST with Double = js.native
    /* 0 */ val MSB_FIRST: typingsSlinky.piDashSpi.piDashSpiMod.order.MSB_FIRST with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[order with Double] = js.native
  }
  
}

