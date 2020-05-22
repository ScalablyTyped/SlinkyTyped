package typingsSlinky.promiseFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt32ArrayBytesWrittenNumber extends js.Object {
  var buffer: js.typedarray.Int32Array
  var bytesWritten: Double
}

object BufferInt32ArrayBytesWrittenNumber {
  @scala.inline
  def apply(buffer: js.typedarray.Int32Array, bytesWritten: Double): BufferInt32ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt32ArrayBytesWrittenNumber]
  }
}

