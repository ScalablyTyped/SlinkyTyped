package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteTreatmentResource extends js.Object {
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[
    typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
  ] = js.native
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.native
  /**
    * The allocated percentage of users for this treatment.
    */
  var SizePercent: js.UndefOr[Double] = js.native
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.native
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.native
}

object WriteTreatmentResource {
  @scala.inline
  def apply(): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteTreatmentResource]
  }
  @scala.inline
  implicit class WriteTreatmentResourceOps[Self <: WriteTreatmentResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSizePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizePercent")(js.undefined)
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
  }
  
}

