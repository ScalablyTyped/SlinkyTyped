package typingsSlinky.node.fsMod

import typingsSlinky.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadVResult extends js.Object {
  var buffers: js.Array[ArrayBufferView]
  var bytesRead: Double
}

object ReadVResult {
  @scala.inline
  def apply(buffers: js.Array[ArrayBufferView], bytesRead: Double): ReadVResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadVResult]
  }
  @scala.inline
  implicit class ReadVResultOps[Self <: ReadVResult] (val x: Self) extends AnyVal {
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
    def setBuffers(value: js.Array[ArrayBufferView]): Self = this.set("buffers", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesRead(value: Double): Self = this.set("bytesRead", value.asInstanceOf[js.Any])
  }
  
}

