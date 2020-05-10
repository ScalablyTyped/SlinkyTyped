package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrFiltersForSegment extends js.Object {
  var segmentFilterClauses: js.UndefOr[js.Array[SegmentFilterClause]] = js.native
}

object OrFiltersForSegment {
  @scala.inline
  def apply(): OrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrFiltersForSegment]
  }
  @scala.inline
  implicit class OrFiltersForSegmentOps[Self <: OrFiltersForSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentFilterClauses(value: js.Array[SegmentFilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentFilterClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentFilterClauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentFilterClauses")(js.undefined)
        ret
    }
  }
  
}

