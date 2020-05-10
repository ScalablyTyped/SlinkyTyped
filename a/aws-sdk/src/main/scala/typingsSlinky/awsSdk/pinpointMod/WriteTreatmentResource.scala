package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteTreatmentResource extends js.Object {
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageConfiguration] = js.native
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Schedule] = js.native
  /**
    * The allocated percentage of users (segment members) to send the treatment to.
    */
  var SizePercent: integer = js.native
  /**
    * The message template to use for the treatment.
    */
  var TemplateConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  /**
    * A custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  /**
    * A custom name for the treatment. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentName: js.UndefOr[string] = js.native
}

object WriteTreatmentResource {
  @scala.inline
  def apply(SizePercent: integer): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal(SizePercent = SizePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTreatmentResource]
  }
  @scala.inline
  implicit class WriteTreatmentResourceOps[Self <: WriteTreatmentResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

