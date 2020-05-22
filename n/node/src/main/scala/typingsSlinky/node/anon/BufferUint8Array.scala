package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferUint8Array extends js.Object {
  var buffer: js.typedarray.Uint8Array
  var bytesWritten: Double
}

object BufferUint8Array {
  @scala.inline
  def apply(buffer: js.typedarray.Uint8Array, bytesWritten: Double): BufferUint8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint8Array]
  }
}

