package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typingsSlinky.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.UnmarshalledWriteTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledWriteCampaignRequest extends WriteCampaignRequest {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments_UnmarshalledWriteCampaignRequest: js.UndefOr[js.Array[UnmarshalledWriteTreatmentResource]] = js.native
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignHook] = js.native
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledSchedule] = js.native
}

object UnmarshalledWriteCampaignRequest {
  @scala.inline
  def apply(): UnmarshalledWriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteCampaignRequest]
  }
  @scala.inline
  implicit class UnmarshalledWriteCampaignRequestOps[Self <: UnmarshalledWriteCampaignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalTreatments(value: js.Array[UnmarshalledWriteTreatmentResource]): Self = {
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
  }
  
}

