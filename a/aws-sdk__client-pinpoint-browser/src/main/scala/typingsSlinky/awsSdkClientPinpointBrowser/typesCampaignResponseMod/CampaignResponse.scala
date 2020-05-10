package typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignStateMod.CampaignState
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typingsSlinky.awsSdkClientPinpointBrowser.typesTreatmentResourceMod.TreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignResponse extends js.Object {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[js.Array[TreatmentResource] | js.Iterable[TreatmentResource]] = js.native
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The date the campaign was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  var DefaultState: js.UndefOr[CampaignState] = js.native
  /**
    * A description of the campaign.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The allocated percentage of end users who will not receive messages from this campaign.
    */
  var HoldoutPercent: js.UndefOr[Double] = js.native
  /**
    * Campaign hook information.
    */
  var Hook: js.UndefOr[CampaignHook] = js.native
  /**
    * The unique campaign ID.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
    */
  var IsPaused: js.UndefOr[Boolean] = js.native
  /**
    * The date the campaign was last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * The campaign limits settings.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[
    typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
  ] = js.native
  /**
    * The custom name of the campaign.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.native
  /**
    * The ID of the segment to which the campaign sends messages.
    */
  var SegmentId: js.UndefOr[String] = js.native
  /**
    * The version of the segment to which the campaign sends messages.
    */
  var SegmentVersion: js.UndefOr[Double] = js.native
  /**
    * The campaign status.
    *
    * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
    */
  var State: js.UndefOr[CampaignState] = js.native
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.native
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.native
  /**
    * The campaign version number.
    */
  var Version: js.UndefOr[Double] = js.native
}

object CampaignResponse {
  @scala.inline
  def apply(): CampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignResponse]
  }
  @scala.inline
  implicit class CampaignResponseOps[Self <: CampaignResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalTreatmentsIterable(value: js.Iterable[TreatmentResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalTreatments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalTreatments(value: js.Array[TreatmentResource] | js.Iterable[TreatmentResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalTreatments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalTreatments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalTreatments")(js.undefined)
        ret
    }
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
    def withCreationDate(value: String): Self = {
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
    def withDefaultState(value: CampaignState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultState")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withHoldoutPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoldoutPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoldoutPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withHook(value: CampaignHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hook")(js.undefined)
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
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: String): Self = {
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
    def withLimits(value: CampaignLimits): Self = {
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
    def withMessageConfiguration(value: MessageConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: Schedule): Self = {
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
    def withSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CampaignState): Self = {
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
    def withTreatmentDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatmentDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

