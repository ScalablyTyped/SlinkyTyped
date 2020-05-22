package typingsSlinky.promiseFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesRead extends js.Object {
  var buffer: js.typedarray.Uint8ClampedArray
  var bytesRead: Double
}

object BytesRead {
  @scala.inline
  def apply(buffer: js.typedarray.Uint8ClampedArray, bytesRead: Double): BytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
}

