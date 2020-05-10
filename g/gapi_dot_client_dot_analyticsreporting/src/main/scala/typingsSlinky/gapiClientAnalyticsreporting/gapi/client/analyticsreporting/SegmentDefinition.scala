package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDefinition extends js.Object {
  /**
    * A segment is defined by a set of segment filters which are combined
    * together with a logical `AND` operation.
    */
  var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.native
}

object SegmentDefinition {
  @scala.inline
  def apply(): SegmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDefinition]
  }
  @scala.inline
  implicit class SegmentDefinitionOps[Self <: SegmentDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentFilters(value: js.Array[SegmentFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentFilters")(js.undefined)
        ret
    }
  }
  
}

