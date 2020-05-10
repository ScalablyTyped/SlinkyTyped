package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledWriteTreatmentResource extends WriteTreatmentResource {
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledWriteTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledWriteTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.native
}

object UnmarshalledWriteTreatmentResource {
  @scala.inline
  def apply(): UnmarshalledWriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteTreatmentResource]
  }
  @scala.inline
  implicit class UnmarshalledWriteTreatmentResourceOps[Self <: UnmarshalledWriteTreatmentResource] (val x: Self) extends AnyVal {
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
  }
  
}

