package typingsSlinky.awsSdkClientPinpointBrowser.typesActivityResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityResponse extends js.Object {
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The ID of the campaign to which the activity applies.
    */
  var CampaignId: js.UndefOr[String] = js.native
  /**
    * The actual time the activity was marked CANCELLED or COMPLETED. Provided in ISO 8601 format.
    */
  var End: js.UndefOr[String] = js.native
  /**
    * The unique activity ID.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * Indicates whether the activity succeeded.
    *
    * Valid values: SUCCESS, FAIL
    */
  var Result: js.UndefOr[String] = js.native
  /**
    * The scheduled start time for the activity in ISO 8601 format.
    */
  var ScheduledStart: js.UndefOr[String] = js.native
  /**
    * The actual start time of the activity in ISO 8601 format.
    */
  var Start: js.UndefOr[String] = js.native
  /**
    * The state of the activity.
    *
    * Valid values: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The total number of endpoints to which the campaign successfully delivered messages.
    */
  var SuccessfulEndpointCount: js.UndefOr[Double] = js.native
  /**
    * The total number of timezones completed.
    */
  var TimezonesCompletedCount: js.UndefOr[Double] = js.native
  /**
    * The total number of unique timezones present in the segment.
    */
  var TimezonesTotalCount: js.UndefOr[Double] = js.native
  /**
    * The total number of endpoints to which the campaign attempts to deliver messages.
    */
  var TotalEndpointCount: js.UndefOr[Double] = js.native
  /**
    * The ID of a variation of the campaign used for A/B testing.
    */
  var TreatmentId: js.UndefOr[String] = js.native
}

object ActivityResponse {
  @scala.inline
  def apply(): ActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityResponse]
  }
  @scala.inline
  implicit class ActivityResponseOps[Self <: ActivityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaignId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
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
    def withScheduledStart(value: String): Self = {
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
    def withStart(value: String): Self = {
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
    def withState(value: String): Self = {
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
    def withSuccessfulEndpointCount(value: Double): Self = {
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
    def withTimezonesCompletedCount(value: Double): Self = {
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
    def withTimezonesTotalCount(value: Double): Self = {
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
    def withTotalEndpointCount(value: Double): Self = {
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
    def withTreatmentId(value: String): Self = {
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

