package typingsSlinky.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferDataView extends js.Object {
  var buffer: scala.scalajs.js.typedarray.DataView
  var bytesRead: Double
}

object AnonBufferDataView {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.DataView, bytesRead: Double): AnonBufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferDataView]
  }
}

