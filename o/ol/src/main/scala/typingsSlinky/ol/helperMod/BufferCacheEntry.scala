package typingsSlinky.ol.helperMod

import org.scalajs.dom.raw.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferCacheEntry extends js.Object {
  var buffer: typingsSlinky.ol.bufferMod.default
  var webGlBuffer: WebGLBuffer
}

object BufferCacheEntry {
  @scala.inline
  def apply(buffer: typingsSlinky.ol.bufferMod.default, webGlBuffer: WebGLBuffer): BufferCacheEntry = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], webGlBuffer = webGlBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferCacheEntry]
  }
}

