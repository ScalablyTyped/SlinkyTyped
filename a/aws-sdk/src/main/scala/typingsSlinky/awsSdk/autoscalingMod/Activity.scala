package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /**
    * The ID of the activity.
    */
  var ActivityId: XmlString = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * The reason the activity began.
    */
  var Cause: XmlStringMaxLen1023 = js.native
  /**
    * A friendly, more verbose description of the activity.
    */
  var Description: js.UndefOr[XmlString] = js.native
  /**
    * The details about the activity.
    */
  var Details: js.UndefOr[XmlString] = js.native
  /**
    * The end time of the activity.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * A value between 0 and 100 that indicates the progress of the activity.
    */
  var Progress: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Progress] = js.native
  /**
    * The start time of the activity.
    */
  var StartTime: js.Date = js.native
  /**
    * The current status of the activity.
    */
  var StatusCode: ScalingActivityStatusCode = js.native
  /**
    * A friendly, more verbose description of the activity status.
    */
  var StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.native
}

object Activity {
  @scala.inline
  def apply(
    ActivityId: XmlString,
    AutoScalingGroupName: XmlStringMaxLen255,
    Cause: XmlStringMaxLen1023,
    StartTime: js.Date,
    StatusCode: ScalingActivityStatusCode
  ): Activity = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId.asInstanceOf[js.Any], AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], Cause = Cause.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityId(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScalingGroupName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCause(value: XmlStringMaxLen1023): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: ScalingActivityStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Progress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
  }
  
}

