package typingsSlinky.ol.helperMod

import org.scalajs.dom.raw.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferCacheEntry extends js.Object {
  var buffer: typingsSlinky.ol.bufferMod.default = js.native
  var webGlBuffer: WebGLBuffer = js.native
}

object BufferCacheEntry {
  @scala.inline
  def apply(buffer: typingsSlinky.ol.bufferMod.default, webGlBuffer: WebGLBuffer): BufferCacheEntry = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], webGlBuffer = webGlBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferCacheEntry]
  }
  @scala.inline
  implicit class BufferCacheEntryOps[Self <: BufferCacheEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: typingsSlinky.ol.bufferMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebGlBuffer(value: WebGLBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webGlBuffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

