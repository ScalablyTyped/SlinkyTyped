package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferTBuffer[TBuffer /* <: js.typedarray.Uint8Array */] extends js.Object {
  var buffer: TBuffer = js.native
  var bytesRead: Double = js.native
}

object BufferTBuffer {
  @scala.inline
  def apply[TBuffer](buffer: TBuffer, bytesRead: Double): BufferTBuffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferTBuffer[TBuffer]]
  }
  @scala.inline
  implicit class BufferTBufferOps[Self[tbuffer] <: BufferTBuffer[tbuffer], TBuffer] (val x: Self[TBuffer]) extends AnyVal {
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
    def withBytesRead(value: Double): Self[TBuffer] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesRead")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

