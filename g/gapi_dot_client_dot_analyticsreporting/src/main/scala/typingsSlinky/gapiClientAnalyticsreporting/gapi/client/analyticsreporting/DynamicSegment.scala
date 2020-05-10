package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicSegment extends js.Object {
  /** The name of the dynamic segment. */
  var name: js.UndefOr[String] = js.native
  /** Session Segment to select sessions to include in the segment. */
  var sessionSegment: js.UndefOr[SegmentDefinition] = js.native
  /** User Segment to select users to include in the segment. */
  var userSegment: js.UndefOr[SegmentDefinition] = js.native
}

object DynamicSegment {
  @scala.inline
  def apply(): DynamicSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicSegment]
  }
  @scala.inline
  implicit class DynamicSegmentOps[Self <: DynamicSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionSegment(value: SegmentDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSegment(value: SegmentDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSegment")(js.undefined)
        ret
    }
  }
  
}

