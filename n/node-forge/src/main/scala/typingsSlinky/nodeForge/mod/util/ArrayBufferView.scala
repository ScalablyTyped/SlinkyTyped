package typingsSlinky.nodeForge.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayBufferView extends js.Object {
  var buffer: js.typedarray.ArrayBuffer = js.native
  var byteLength: Double = js.native
}

object ArrayBufferView {
  @scala.inline
  def apply(buffer: js.typedarray.ArrayBuffer, byteLength: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
  @scala.inline
  implicit class ArrayBufferViewOps[Self <: ArrayBufferView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

