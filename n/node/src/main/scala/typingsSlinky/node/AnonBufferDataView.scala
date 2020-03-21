package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferDataView extends js.Object {
  var buffer: scala.scalajs.js.typedarray.DataView
  var bytesWritten: Double
}

object AnonBufferDataView {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.DataView, bytesWritten: Double): AnonBufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferDataView]
  }
}

