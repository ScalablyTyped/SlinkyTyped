package typingsSlinky.bser

import typingsSlinky.bser.bserBooleans.`false`
import typingsSlinky.bser.bserBooleans.`true`
import typingsSlinky.bser.bserNumbers.`0`
import typingsSlinky.bser.bserNumbers.`1`
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.TypedArray
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodeInt64.mod.^
import typingsSlinky.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bser", "Accumulator")
  @js.native
  class Accumulator () extends StObject {
    def this(initsize: Double) = this()
    
    def append(buf: InputWrapper): Unit = js.native
    
    def assertReadableSize(size: Double): Unit = js.native
    
    var buf: Buffer = js.native
    
    def peekDouble(): Double = js.native
    
    def peekInt(size: Double): IntWrapper = js.native
    
    def peekString(size: Double): String = js.native
    
    def readAdvance(size: Double): Unit = js.native
    
    def readAvail(): Double = js.native
    
    def readDouble(): Double = js.native
    
    // replace "IntWrapper" with "number"?
    def readInt(bytes: Double): IntWrapper = js.native
    
    var readOffset: Double = js.native
    
    def readString(size: Double): String = js.native
    
    def reserve(size: Double): Unit = js.native
    
    def writeAvail(): Double = js.native
    
    def writeByte(value: Double): Unit = js.native
    
    def writeDouble(value: Double): Unit = js.native
    
    def writeInt(value: Double, size: Double): Unit = js.native
    
    var writeOffset: Double = js.native
  }
  
  @JSImport("bser", "BunserBuf")
  @js.native
  class BunserBuf () extends EventEmitter {
    
    def append(buf: InputWrapper): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    @JSName("append")
    def append_false(buf: InputWrapper, synchronous: `false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    @JSName("append")
    def append_true(buf: InputWrapper, synchronous: `true`): Unit = js.native
    
    var buf: Accumulator = js.native
    
    def decodeAny(): AnyWrapper | js.Array[AnyWrapper] = js.native
    
    def decodeArray(): js.Array[AnyWrapper] = js.native
    
    // replace "IntWrapper" with "number"?
    def decodeInt(): `false` | IntWrapper = js.native
    def decodeInt(relaxSizeAsserts: Boolean): `false` | IntWrapper = js.native
    
    def decodeObject(): js.Object = js.native
    
    def decodeString(): String = js.native
    
    def decodeTemplate(): js.Array[AnyWrapper] = js.native
    
    def expectCode(expected: Double): Unit = js.native
    
    // replace "IntWrapper" with "number"?
    var pduLen: js.UndefOr[`false` | IntWrapper] = js.native
    
    def process(): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    
    def processLater(): Unit = js.native
    
    @JSName("process")
    def process_false(synchronous: `false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
    @JSName("process")
    def process_true(synchronous: `true`): Unit = js.native
    
    def raise(reason: String): Unit = js.native
    
    var state: `0` | `1` = js.native
  }
  
  @JSImport("bser", "dumpToBuffer")
  @js.native
  def dumpToBuffer(`val`: js.Any): Buffer = js.native
  
  @JSImport("bser", "loadFromBuffer")
  @js.native
  def loadFromBuffer(input: InputWrapper): AnyWrapper | js.Array[AnyWrapper] = js.native
  
  type AnyWrapper = Boolean | IntWrapper | Null | String | js.Object
  
  type InputWrapper = Buffer | String | TypedArray | js.typedarray.DataView | js.typedarray.ArrayBuffer | SharedArrayBuffer
  
  type IntWrapper = Double | ^
}
