package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleCondition extends js.Object {
  /**
    * The dimension settings for the event that's associated with the activity.
    */
  var EventCondition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.EventCondition] = js.native
  /**
    * The segment that's associated with the activity.
    */
  var SegmentCondition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.SegmentCondition] = js.native
  /**
    * The dimension settings for the segment that's associated with the activity.
    */
  var SegmentDimensions: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.SegmentDimensions] = js.native
}

object SimpleCondition {
  @scala.inline
  def apply(): SimpleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleCondition]
  }
  @scala.inline
  implicit class SimpleConditionOps[Self <: SimpleCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventCondition(value: EventCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentCondition(value: SegmentCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentDimensions(value: SegmentDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDimensions")(js.undefined)
        ret
    }
  }
  
}

