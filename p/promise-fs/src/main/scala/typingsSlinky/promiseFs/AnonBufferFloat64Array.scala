package typingsSlinky.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferFloat64Array extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Float64Array
  var bytesRead: Double
}

object AnonBufferFloat64Array {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Float64Array, bytesRead: Double): AnonBufferFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferFloat64Array]
  }
}

