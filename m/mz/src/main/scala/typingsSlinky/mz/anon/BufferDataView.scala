package typingsSlinky.mz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferDataView extends js.Object {
  var buffer: js.typedarray.DataView = js.native
  var bytesRead: Double = js.native
}

object BufferDataView {
  @scala.inline
  def apply(buffer: js.typedarray.DataView, bytesRead: Double): BufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataView]
  }
  @scala.inline
  implicit class BufferDataViewOps[Self <: BufferDataView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: js.typedarray.DataView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesRead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesRead")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

