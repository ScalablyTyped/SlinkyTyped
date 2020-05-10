package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBytesWrittenNumber[TBuffer /* <: js.typedarray.Uint8Array */] extends js.Object {
  var buffer: TBuffer = js.native
  var bytesWritten: Double = js.native
}

object AnonBytesWrittenNumber {
  @scala.inline
  def apply[TBuffer](buffer: TBuffer, bytesWritten: Double): AnonBytesWrittenNumber[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesWrittenNumber[TBuffer]]
  }
  @scala.inline
  implicit class AnonBytesWrittenNumberOps[Self[tbuffer] <: AnonBytesWrittenNumber[tbuffer], TBuffer] (val x: Self[TBuffer]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TBuffer] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TBuffer]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TBuffer] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TBuffer] with Other]
    @scala.inline
    def withBuffer(value: TBuffer): Self[TBuffer] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesWritten(value: Double): Self[TBuffer] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesWritten")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

