package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyResponse extends js.Object {
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity.
    */
  var Activities: js.UndefOr[MapOfActivity] = js.native
  /**
    * The unique identifier for the application that the journey applies to.
    */
  var ApplicationId: string = js.native
  /**
    * The date, in ISO 8601 format, when the journey was created.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the journey.
    */
  var Id: string = js.native
  /**
    * The date, in ISO 8601 format, when the journey was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The messaging and entry limits for the journey.
    */
  var Limits: js.UndefOr[JourneyLimits] = js.native
  /**
    * Specifies whether the journey's scheduled start and end times use each participant's local time. If this value is true, the schedule uses each participant's local time.
    */
  var LocalTime: js.UndefOr[boolean] = js.native
  /**
    * The name of the journey.
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
    * The unique identifier for the first activity in the journey.
    */
  var StartActivity: js.UndefOr[string] = js.native
  /**
    * The segment that defines which users are participants in the journey.
    */
  var StartCondition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.StartCondition] = js.native
  /**
    * The current status of the journey. Possible values are: DRAFT - The journey is being developed and hasn't been published yet. ACTIVE - The journey has been developed and published. Depending on the journey's schedule, the journey may currently be running or scheduled to start running at a later time. If a journey's status is ACTIVE, you can't add, change, or remove activities from it. COMPLETED - The journey has been published and has finished running. All participants have entered the journey and no participants are waiting to complete the journey or any activities in the journey. CANCELLED - The journey has been stopped. If a journey's status is CANCELLED, you can't add, change, or remove activities or segment settings from the journey. CLOSED - The journey has been published and has started running. It may have also passed its scheduled end time, or passed its scheduled start time and a refresh frequency hasn't been specified for it. If a journey's status is CLOSED, you can't add participants to it, and no existing participants can enter the journey for the first time. However, any existing participants who are currently waiting to start an activity may continue the journey.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.State] = js.native
  /**
    * This object is not used or supported.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object JourneyResponse {
  @scala.inline
  def apply(ApplicationId: string, Id: string, Name: string): JourneyResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyResponse]
  }
  @scala.inline
  implicit class JourneyResponseOps[Self <: JourneyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withTags(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

