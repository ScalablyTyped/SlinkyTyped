package typingsSlinky.raspiI2c

import typingsSlinky.node.Buffer
import typingsSlinky.raspiPeripheral.mod.Peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-i2c", "I2C")
  @js.native
  class I2C () extends Peripheral {
    
    var _devices: js.Any = js.native
    
    /* private */ def _getDevice(address: js.Any): js.Any = js.native
    
    def read(address: Double, length: Double, cb: ReadCallback): Unit = js.native
    def read(address: Double, register: Double, length: Double, cb: ReadCallback): Unit = js.native
    
    def readByte(address: Double, cb: ReadCallback): Unit = js.native
    def readByte(address: Double, register: Double, cb: ReadCallback): Unit = js.native
    
    def readByteSync(address: Double): Double = js.native
    def readByteSync(address: Double, register: Double): Double = js.native
    
    def readSync(address: Double): Buffer = js.native
    def readSync(address: Double, registerOrLength: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
    def readSync(address: Double, registerOrLength: Double): Buffer = js.native
    def readSync(address: Double, registerOrLength: Double, length: Double): Buffer = js.native
    
    def readWord(address: Double, cb: ReadCallback): Unit = js.native
    def readWord(address: Double, register: Double, cb: ReadCallback): Unit = js.native
    
    def readWordSync(address: Double): Double = js.native
    def readWordSync(address: Double, register: Double): Double = js.native
    
    def write(address: Double, buffer: Buffer): Unit = js.native
    def write(address: Double, buffer: Buffer, cb: WriteCallback): Unit = js.native
    def write(address: Double, register: Double, buffer: Buffer): Unit = js.native
    def write(address: Double, register: Double, buffer: Buffer, cb: WriteCallback): Unit = js.native
    
    def writeByte(address: Double, byte: Double): Unit = js.native
    def writeByte(address: Double, byte: Double, cb: WriteCallback): Unit = js.native
    def writeByte(address: Double, register: Double, byte: Double): Unit = js.native
    def writeByte(address: Double, register: Double, byte: Double, cb: WriteCallback): Unit = js.native
    
    def writeByteSync(address: Double, registerOrByte: Double): Unit = js.native
    def writeByteSync(address: Double, registerOrByte: Double, byte: Double): Unit = js.native
    
    def writeSync(address: Double, buffer: Buffer): Unit = js.native
    def writeSync(address: Double, register: Double, buffer: Buffer): Unit = js.native
    
    def writeWord(address: Double, register: Double, word: Double): Unit = js.native
    def writeWord(address: Double, register: Double, word: Double, cb: WriteCallback): Unit = js.native
    def writeWord(address: Double, word: Double): Unit = js.native
    def writeWord(address: Double, word: Double, cb: WriteCallback): Unit = js.native
    
    def writeWordSync(address: Double, registerOrWord: Double): Unit = js.native
    def writeWordSync(address: Double, registerOrWord: Double, word: Double): Unit = js.native
  }
  
  type ReadCallback = js.Function2[/* err */ Null | js.Error | String, /* data */ Null | Buffer | Double, Unit]
  
  type WriteCallback = js.Function1[/* err */ Null | js.Error | String, Unit]
}
