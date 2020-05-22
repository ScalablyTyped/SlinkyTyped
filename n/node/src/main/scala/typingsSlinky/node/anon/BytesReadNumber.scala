package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesReadNumber extends js.Object {
  var buffer: js.typedarray.Uint16Array
  var bytesRead: Double
}

object BytesReadNumber {
  @scala.inline
  def apply(buffer: js.typedarray.Uint16Array, bytesRead: Double): BytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesReadNumber]
  }
}

