package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer[TBuffer /* <: js.typedarray.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesRead: Double
}

object Buffer {
  @scala.inline
  def apply[TBuffer](buffer: TBuffer, bytesRead: Double): Buffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer[TBuffer]]
  }
}

