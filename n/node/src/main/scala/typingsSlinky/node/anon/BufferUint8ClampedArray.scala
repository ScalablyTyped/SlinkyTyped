package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferUint8ClampedArray extends js.Object {
  var buffer: js.typedarray.Uint8ClampedArray
  var bytesWritten: Double
}

object BufferUint8ClampedArray {
  @scala.inline
  def apply(buffer: js.typedarray.Uint8ClampedArray, bytesWritten: Double): BufferUint8ClampedArray = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint8ClampedArray]
  }
}

