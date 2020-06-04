package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt8ArrayBytesReadNumber extends js.Object {
  var buffer: js.typedarray.Int8Array
  var bytesRead: Double
}

object BufferInt8ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: js.typedarray.Int8Array, bytesRead: Double): BufferInt8ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8ArrayBytesReadNumber]
  }
  @scala.inline
  implicit class BufferInt8ArrayBytesReadNumberOps[Self <: BufferInt8ArrayBytesReadNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: js.typedarray.Int8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesRead(value: Double): Self = this.set("bytesRead", value.asInstanceOf[js.Any])
  }
  
}

