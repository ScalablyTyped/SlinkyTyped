package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLDataBuffer extends DataBuffer {
  var _buffer: js.Any = js.native
}

object WebGLDataBuffer {
  @scala.inline
  def apply(
    _buffer: js.Any,
    capacity: Double,
    is32Bits: Boolean,
    references: Double,
    underlyingResource: () => js.Any
  ): WebGLDataBuffer = {
    val __obj = js.Dynamic.literal(_buffer = _buffer.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], is32Bits = is32Bits.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], underlyingResource = js.Any.fromFunction0(underlyingResource))
    __obj.asInstanceOf[WebGLDataBuffer]
  }
  @scala.inline
  implicit class WebGLDataBufferOps[Self <: WebGLDataBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_buffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_buffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

