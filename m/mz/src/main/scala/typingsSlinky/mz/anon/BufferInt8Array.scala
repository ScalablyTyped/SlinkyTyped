package typingsSlinky.mz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt8Array extends js.Object {
  var buffer: js.typedarray.Int8Array
  var bytesRead: Double
}

object BufferInt8Array {
  @scala.inline
  def apply(buffer: js.typedarray.Int8Array, bytesRead: Double): BufferInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8Array]
  }
}

