package typingsSlinky.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesRead extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint8ClampedArray
  var bytesRead: Double
}

object AnonBytesRead {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint8ClampedArray, bytesRead: Double): AnonBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesRead]
  }
}

