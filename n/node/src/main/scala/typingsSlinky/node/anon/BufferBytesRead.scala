package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferBytesRead extends js.Object {
  var buffer: js.typedarray.Uint8ClampedArray
  var bytesRead: Double
}

object BufferBytesRead {
  @scala.inline
  def apply(buffer: js.typedarray.Uint8ClampedArray, bytesRead: Double): BufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesRead]
  }
}

