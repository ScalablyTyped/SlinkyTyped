package typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typingsSlinky.awsSdkClientPinpointBrowser.typesTreatmentResourceMod.UnmarshalledTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCampaignResponse extends CampaignResponse {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments_UnmarshalledCampaignResponse: js.UndefOr[js.Array[UnmarshalledTreatmentResource]] = js.native
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  @JSName("DefaultState")
  var DefaultState_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignState] = js.native
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignHook] = js.native
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledSchedule] = js.native
  /**
    * The campaign status.
    *
    * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
    */
  @JSName("State")
  var State_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignState] = js.native
}

object UnmarshalledCampaignResponse {
  @scala.inline
  def apply(): UnmarshalledCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCampaignResponse]
  }
  @scala.inline
  implicit class UnmarshalledCampaignResponseOps[Self <: UnmarshalledCampaignResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalTreatments(value: js.Array[UnmarshalledTreatmentResource]): Self = {
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
    def withDefaultState(value: UnmarshalledCampaignState): Self = {
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
    def withHook(value: UnmarshalledCampaignHook): Self = {
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
    def withLimits(value: UnmarshalledCampaignLimits): Self = {
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
    def withMessageConfiguration(value: UnmarshalledMessageConfiguration): Self = {
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
    def withSchedule(value: UnmarshalledSchedule): Self = {
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
    def withState(value: UnmarshalledCampaignState): Self = {
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

