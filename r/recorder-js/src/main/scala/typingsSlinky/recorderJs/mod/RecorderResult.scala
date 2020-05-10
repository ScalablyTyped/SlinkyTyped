package typingsSlinky.recorderJs.mod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderResult extends js.Object {
  var blob: Blob = js.native
  var buffer: js.Array[js.typedarray.Float32Array] = js.native
}

object RecorderResult {
  @scala.inline
  def apply(blob: Blob, buffer: js.Array[js.typedarray.Float32Array]): RecorderResult = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderResult]
  }
  @scala.inline
  implicit class RecorderResultOps[Self <: RecorderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlob(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: js.Array[js.typedarray.Float32Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

