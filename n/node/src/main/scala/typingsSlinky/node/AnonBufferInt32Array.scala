package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt32Array extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Int32Array
  var bytesWritten: Double
}

object AnonBufferInt32Array {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Int32Array, bytesWritten: Double): AnonBufferInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferInt32Array]
  }
}

