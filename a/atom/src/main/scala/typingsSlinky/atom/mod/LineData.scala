package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineData extends js.Object {
  /** Number indicating the zero-indexed buffer index of a line. */
  var bufferRow: Double = js.native
  /** Number indicating the zero-indexed screen index. */
  var screenRow: Double = js.native
}

object LineData {
  @scala.inline
  def apply(bufferRow: Double, screenRow: Double): LineData = {
    val __obj = js.Dynamic.literal(bufferRow = bufferRow.asInstanceOf[js.Any], screenRow = screenRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineData]
  }
  @scala.inline
  implicit class LineDataOps[Self <: LineData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

