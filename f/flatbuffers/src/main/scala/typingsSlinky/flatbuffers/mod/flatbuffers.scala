package typingsSlinky.flatbuffers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatbuffers", "flatbuffers")
@js.native
object flatbuffers extends js.Object {
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Builder ()
    extends typingsSlinky.flatbuffers.mod.global.flatbuffers.Builder {
    def this(initial_size: Double) = this()
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class ByteBuffer protected ()
    extends typingsSlinky.flatbuffers.mod.global.flatbuffers.ByteBuffer {
    def this(bytes: js.typedarray.Uint8Array) = this()
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Long protected ()
    extends typingsSlinky.flatbuffers.mod.global.flatbuffers.Long {
    def this(low: Double, high: Double) = this()
  }
  
  val FILE_IDENTIFIER_LENGTH: Double = js.native
  val SIZEOF_INT: Double = js.native
  val SIZEOF_SHORT: Double = js.native
  val SIZE_PREFIX_LENGTH: Double = js.native
  val float32: js.typedarray.Float32Array = js.native
  val float64: js.typedarray.Float64Array = js.native
  val int32: js.typedarray.Int32Array = js.native
  val isLittleEndian: Boolean = js.native
  /* static members */
  @js.native
  object Builder extends js.Object {
    /**
      * Doubles the size of the backing ByteBuffer and copies the old data towards
      * the end of the new buffer (since we build the buffer backwards).
      *
      * @param bb The current buffer with the existing data
      * @returns A new byte buffer with the old data copied
      * to it. The data is located at the end of the buffer.
      */
    def growByteBuffer(bb: typingsSlinky.flatbuffers.mod.global.flatbuffers.ByteBuffer): typingsSlinky.flatbuffers.mod.global.flatbuffers.ByteBuffer = js.native
  }
  
  /* static members */
  @js.native
  object ByteBuffer extends js.Object {
    def allocate(byte_size: Double): typingsSlinky.flatbuffers.mod.global.flatbuffers.ByteBuffer = js.native
  }
  
  @js.native
  object Encoding extends js.Object {
    /* 1 */ val UTF16_STRING: typingsSlinky.flatbuffers.mod.global.flatbuffers.Encoding.UTF16_STRING with Double = js.native
    /* 0 */ val UTF8_BYTES: typingsSlinky.flatbuffers.mod.global.flatbuffers.Encoding.UTF8_BYTES with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.flatbuffers.mod.global.flatbuffers.Encoding with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Long extends js.Object {
    var ZERO: typingsSlinky.flatbuffers.mod.global.flatbuffers.Long = js.native
    def create(low: Double, high: Double): typingsSlinky.flatbuffers.mod.global.flatbuffers.Long = js.native
  }
  
}

