package typingsSlinky.awsSdkClientPinpointBrowser.typesTreatmentResourceMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledTreatmentResource extends TreatmentResource {
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.native
  /**
    * The treatment status.
    */
  @JSName("State")
  var State_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledCampaignState] = js.native
}

object UnmarshalledTreatmentResource {
  @scala.inline
  def apply(): UnmarshalledTreatmentResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTreatmentResource]
  }
  @scala.inline
  implicit class UnmarshalledTreatmentResourceOps[Self <: UnmarshalledTreatmentResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

