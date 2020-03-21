package typingsSlinky.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint8Array
  var bytesRead: Double
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint8Array, bytesRead: Double): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}

