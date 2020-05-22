package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferFloat64Array extends js.Object {
  var buffer: js.typedarray.Float64Array
  var bytesWritten: Double
}

object BufferFloat64Array {
  @scala.inline
  def apply(buffer: js.typedarray.Float64Array, bytesWritten: Double): BufferFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat64Array]
  }
}

