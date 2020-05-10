package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coverage data for a source range.
  */
@js.native
trait CoverageRange extends js.Object {
  /**
    * Collected execution count of the source range.
    */
  var count: Double = js.native
  /**
    * JavaScript script source offset for the range end.
    */
  var endOffset: Double = js.native
  /**
    * JavaScript script source offset for the range start.
    */
  var startOffset: Double = js.native
}

object CoverageRange {
  @scala.inline
  def apply(count: Double, endOffset: Double, startOffset: Double): CoverageRange = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageRange]
  }
  @scala.inline
  implicit class CoverageRangeOps[Self <: CoverageRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

