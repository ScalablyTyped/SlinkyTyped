package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadNumberTBuffer[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesRead: Double
}

object Anon_BufferBytesReadNumberTBuffer {
  @scala.inline
  def apply[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](buffer: TBuffer, bytesRead: Double): Anon_BufferBytesReadNumberTBuffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesReadNumberTBuffer[TBuffer]]
  }
}

