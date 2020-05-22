package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesRead extends js.Object {
  var buffer: js.typedarray.Uint8Array
  var bytesRead: Double
}

object BytesRead {
  @scala.inline
  def apply(buffer: js.typedarray.Uint8Array, bytesRead: Double): BytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
}

