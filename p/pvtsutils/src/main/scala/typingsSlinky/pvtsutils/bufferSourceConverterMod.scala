package typingsSlinky.pvtsutils

import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils/build/types/buffer_source_converter", JSImport.Namespace)
@js.native
object bufferSourceConverterMod extends js.Object {
  @js.native
  class BufferSourceConverter () extends js.Object
  
  /* static members */
  @js.native
  object BufferSourceConverter extends js.Object {
    def isBufferSource(data: js.Any): /* is std.BufferSource */ Boolean = js.native
    def toArrayBuffer(data: BufferSource): scala.scalajs.js.typedarray.ArrayBuffer = js.native
    def toUint8Array(data: BufferSource): scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
}

