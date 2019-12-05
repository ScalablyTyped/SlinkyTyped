package typingsSlinky.ol.webglContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferCacheEntry extends js.Object {
  var buf: typingsSlinky.ol.webglBufferMod.default
  var buffer: typingsSlinky.ol.webglBufferMod.default
}

object BufferCacheEntry {
  @scala.inline
  def apply(buf: typingsSlinky.ol.webglBufferMod.default, buffer: typingsSlinky.ol.webglBufferMod.default): BufferCacheEntry = {
    val __obj = js.Dynamic.literal(buf = buf.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferCacheEntry]
  }
}

