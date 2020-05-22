package typingsSlinky.promiseFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferUint16Array extends js.Object {
  var buffer: js.typedarray.Uint16Array
  var bytesWritten: Double
}

object BufferUint16Array {
  @scala.inline
  def apply(buffer: js.typedarray.Uint16Array, bytesWritten: Double): BufferUint16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint16Array]
  }
}

