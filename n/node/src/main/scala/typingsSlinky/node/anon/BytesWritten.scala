package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesWritten[TBuffer /* <: js.typedarray.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: Double
}

object BytesWritten {
  @scala.inline
  def apply[TBuffer](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWritten[TBuffer]]
  }
}

