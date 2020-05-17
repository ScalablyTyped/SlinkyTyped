package typingsSlinky.promiseFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BytesWrittenNumber extends js.Object {
  var buffer: js.typedarray.Uint32Array = js.native
  var bytesWritten: Double = js.native
}

object BytesWrittenNumber {
  @scala.inline
  def apply(buffer: js.typedarray.Uint32Array, bytesWritten: Double): BytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWrittenNumber]
  }
  @scala.inline
  implicit class BytesWrittenNumberOps[Self <: BytesWrittenNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesWritten")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

