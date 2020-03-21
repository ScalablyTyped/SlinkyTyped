package typingsSlinky.hexoFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesWritten extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint8Array
  var bytesWritten: Double
}

object AnonBufferBytesWritten {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint8Array, bytesWritten: Double): AnonBufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesWritten]
  }
}

