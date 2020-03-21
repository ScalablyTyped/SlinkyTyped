package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesReadNumber extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint32Array
  var bytesRead: Double
}

object AnonBytesReadNumber {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint32Array, bytesRead: Double): AnonBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesReadNumber]
  }
}

