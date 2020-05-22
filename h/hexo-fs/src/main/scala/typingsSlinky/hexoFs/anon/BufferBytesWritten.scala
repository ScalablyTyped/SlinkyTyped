package typingsSlinky.hexoFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferBytesWritten extends js.Object {
  var buffer: js.typedarray.Uint8Array
  var bytesWritten: Double
}

object BufferBytesWritten {
  @scala.inline
  def apply(buffer: js.typedarray.Uint8Array, bytesWritten: Double): BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesWritten]
  }
}

