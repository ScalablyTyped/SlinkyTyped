package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityResponse extends js.Object {
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the campaign that the activity applies to.
    */
  var CampaignId: string = js.native
  /**
    * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
    */
  var End: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the activity.
    */
  var Id: string = js.native
  /**
    * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
    */
  var Result: js.UndefOr[string] = js.native
  /**
    * The scheduled start time, in ISO 8601 format, for the activity.
    */
  var ScheduledStart: js.UndefOr[string] = js.native
  /**
    * The actual start time, in ISO 8601 format, of the activity.
    */
  var Start: js.UndefOr[string] = js.native
  /**
    * The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and COMPLETED.
    */
  var State: js.UndefOr[string] = js.native
  /**
    * The total number of endpoints that the campaign successfully delivered messages to.
    */
  var SuccessfulEndpointCount: js.UndefOr[integer] = js.native
  /**
    * The total number of time zones that were completed.
    */
  var TimezonesCompletedCount: js.UndefOr[integer] = js.native
  /**
    * The total number of unique time zones that are in the segment for the campaign.
    */
  var TimezonesTotalCount: js.UndefOr[integer] = js.native
  /**
    * The total number of endpoints that the campaign attempted to deliver messages to.
    */
  var TotalEndpointCount: js.UndefOr[integer] = js.native
  /**
    * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentId: js.UndefOr[string] = js.native
}

object ActivityResponse {
  @scala.inline
  def apply(ApplicationId: string, CampaignId: string, Id: string): ActivityResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityResponse]
  }
  @scala.inline
  implicit class ActivityResponseOps[Self <: ActivityResponse] (val x: Self) extends AnyVal {
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
    def withCampaignId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledStart(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: string): Self = {
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
    def withSuccessfulEndpointCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulEndpointCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulEndpointCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulEndpointCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezonesCompletedCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimezonesCompletedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezonesCompletedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimezonesCompletedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezonesTotalCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimezonesTotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezonesTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimezonesTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalEndpointCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalEndpointCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalEndpointCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalEndpointCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatmentId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentId")(js.undefined)
        ret
    }
  }
  
}

