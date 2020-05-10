package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentFilter extends js.Object {
  var not: js.UndefOr[Boolean] = js.native
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.native
  var simpleSegment: js.UndefOr[SimpleSegment] = js.native
}

object SegmentFilter {
  @scala.inline
  def apply(): SegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilter]
  }
  @scala.inline
  implicit class SegmentFilterOps[Self <: SegmentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceSegment(value: SequenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleSegment(value: SimpleSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSegment")(js.undefined)
        ret
    }
  }
  
}

