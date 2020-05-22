package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferDataView extends js.Object {
  var buffer: js.typedarray.DataView
  var bytesWritten: Double
}

object BufferDataView {
  @scala.inline
  def apply(buffer: js.typedarray.DataView, bytesWritten: Double): BufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataView]
  }
}

