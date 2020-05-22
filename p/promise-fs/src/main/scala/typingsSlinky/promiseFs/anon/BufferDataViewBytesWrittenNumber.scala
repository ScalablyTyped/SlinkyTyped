package typingsSlinky.promiseFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferDataViewBytesWrittenNumber extends js.Object {
  var buffer: js.typedarray.DataView
  var bytesWritten: Double
}

object BufferDataViewBytesWrittenNumber {
  @scala.inline
  def apply(buffer: js.typedarray.DataView, bytesWritten: Double): BufferDataViewBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataViewBytesWrittenNumber]
  }
}

