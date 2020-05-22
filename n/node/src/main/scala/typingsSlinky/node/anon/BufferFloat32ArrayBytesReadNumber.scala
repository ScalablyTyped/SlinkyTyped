package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferFloat32ArrayBytesReadNumber extends js.Object {
  var buffer: js.typedarray.Float32Array
  var bytesRead: Double
}

object BufferFloat32ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: js.typedarray.Float32Array, bytesRead: Double): BufferFloat32ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat32ArrayBytesReadNumber]
  }
}

