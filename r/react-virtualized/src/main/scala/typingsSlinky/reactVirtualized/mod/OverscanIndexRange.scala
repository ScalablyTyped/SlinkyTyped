package typingsSlinky.reactVirtualized.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverscanIndexRange extends js.Object {
  var overscanStartIndex: Double = js.native
  var overscanStopIndex: Double = js.native
}

object OverscanIndexRange {
  @scala.inline
  def apply(overscanStartIndex: Double, overscanStopIndex: Double): OverscanIndexRange = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndexRange]
  }
  @scala.inline
  implicit class OverscanIndexRangeOps[Self <: OverscanIndexRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverscanStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

