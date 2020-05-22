package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferDataViewBytesReadNumber extends js.Object {
  var buffer: js.typedarray.DataView
  var bytesRead: Double
}

object BufferDataViewBytesReadNumber {
  @scala.inline
  def apply(buffer: js.typedarray.DataView, bytesRead: Double): BufferDataViewBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataViewBytesReadNumber]
  }
}

