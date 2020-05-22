package typingsSlinky.mz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt16Array extends js.Object {
  var buffer: js.typedarray.Int16Array
  var bytesRead: Double
}

object BufferInt16Array {
  @scala.inline
  def apply(buffer: js.typedarray.Int16Array, bytesRead: Double): BufferInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16Array]
  }
}

