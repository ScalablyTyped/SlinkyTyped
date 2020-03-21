package typingsSlinky.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesRead extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint16Array
  var bytesRead: Double
}

object AnonBufferBytesRead {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint16Array, bytesRead: Double): AnonBufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesRead]
  }
}

