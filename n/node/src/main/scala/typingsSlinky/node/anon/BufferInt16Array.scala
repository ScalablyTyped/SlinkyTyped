package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt16Array extends js.Object {
  var buffer: js.typedarray.Int16Array
  var bytesWritten: Double
}

object BufferInt16Array {
  @scala.inline
  def apply(buffer: js.typedarray.Int16Array, bytesWritten: Double): BufferInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16Array]
  }
}

