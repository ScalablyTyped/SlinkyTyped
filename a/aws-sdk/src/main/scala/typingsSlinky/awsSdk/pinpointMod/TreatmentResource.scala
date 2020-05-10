package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreatmentResource extends js.Object {
  /**
    * The unique identifier for the treatment.
    */
  var Id: string = js.native
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageConfiguration] = js.native
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Schedule] = js.native
  /**
    * The allocated percentage of users (segment members) that the treatment is sent to.
    */
  var SizePercent: integer = js.native
  /**
    * The current status of the treatment.
    */
  var State: js.UndefOr[CampaignState] = js.native
  /**
    * The message template to use for the treatment.
    */
  var TemplateConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * The custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  /**
    * The custom name of the treatment. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentName: js.UndefOr[string] = js.native
}

object TreatmentResource {
  @scala.inline
  def apply(Id: string, SizePercent: integer): TreatmentResource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], SizePercent = SizePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatmentResource]
  }
  @scala.inline
  implicit class TreatmentResourceOps[Self <: TreatmentResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizePercent(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizePercent")(value.asInstanceOf[js.Any])
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
    def withTemplateConfiguration(value: TemplateConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatmentDescription(value: string): Self = {
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
    def withTreatmentName(value: string): Self = {
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
  }
  
}

