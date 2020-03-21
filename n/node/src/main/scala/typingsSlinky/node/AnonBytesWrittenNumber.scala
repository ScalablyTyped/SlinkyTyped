package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesWrittenNumber[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: Double
}

object AnonBytesWrittenNumber {
  @scala.inline
  def apply[TBuffer /* <: scala.scalajs.js.typedarray.Uint8Array */](buffer: TBuffer, bytesWritten: Double): AnonBytesWrittenNumber[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesWrittenNumber[TBuffer]]
  }
}

