package typingsSlinky.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesWrittenNumber extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint32Array
  var bytesWritten: Double
}

object AnonBytesWrittenNumber {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint32Array, bytesWritten: Double): AnonBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesWrittenNumber]
  }
}

