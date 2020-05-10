package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteJourneyRequest extends js.Object {
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity. An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
    */
  var Activities: js.UndefOr[MapOfActivity] = js.native
  /**
    * The date, in ISO 8601 format, when the journey was created.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the journey was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The messaging and entry limits for the journey.
    */
  var Limits: js.UndefOr[JourneyLimits] = js.native
  /**
    * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the schedule on each participant's local time, set this value to true.
    */
  var LocalTime: js.UndefOr[boolean] = js.native
  /**
    * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any spaces.
    */
  var Name: string = js.native
  /**
    * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages to participants, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value. The current time in the participant's time zone is later than or equal to the time specified by the QuietTime.Start property for the journey. The current time in the participant's time zone is earlier than or equal to the time specified by the QuietTime.End property for the journey. If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.QuietTime] = js.native
  /**
    * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO 8601 format.
    */
  var RefreshFrequency: js.UndefOr[string] = js.native
  /**
    * The schedule settings for the journey.
    */
  var Schedule: js.UndefOr[JourneySchedule] = js.native
  /**
    * The unique identifier for the first activity in the journey. The identifier for this activity can contain a maximum of 128 characters. The characters must be alphanumeric characters.
    */
  var StartActivity: js.UndefOr[string] = js.native
  /**
    * The segment that defines which users are participants in the journey.
    */
  var StartCondition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.StartCondition] = js.native
  /**
    * The status of the journey. Valid values are: DRAFT - Saves the journey and doesn't publish it. ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove activities from it. The CANCELLED, COMPLETED, and CLOSED values are not supported in requests to create or update a journey. To cancel a journey, use the Journey State resource.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.State] = js.native
}

object WriteJourneyRequest {
  @scala.inline
  def apply(Name: string): WriteJourneyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteJourneyRequest]
  }
  @scala.inline
  implicit class WriteJourneyRequestOps[Self <: WriteJourneyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivities(value: MapOfActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: JourneyLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalTime(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalTime")(js.undefined)
        ret
    }
    @scala.inline
    def withQuietTime(value: QuietTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuietTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuietTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuietTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshFrequency(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: JourneySchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStartActivity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCondition(value: StartCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

