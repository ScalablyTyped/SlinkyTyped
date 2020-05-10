package typingsSlinky.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLabelWriterPrintParamsXmlParams extends js.Object {
  /** The number of copies to print. */
  var copies: js.UndefOr[Double] = js.native
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.native
  /** The print job title/description. */
  var jobTitle: js.UndefOr[String] = js.native
  /** The print quality. Use the dymo.label.framework.LabelWriterPrintQuality enumeration to specify the value. */
  var printQuality: js.UndefOr[LabelWriterPrintQuality] = js.native
  /** The roll to print to if the printer is a TwinTurbo printer. Use the dymo.label.framework.TwinTurboRoll enumeration to specify the value. */
  var twinTurboRoll: js.UndefOr[TwinTurboRoll] = js.native
}

object CreateLabelWriterPrintParamsXmlParams {
  @scala.inline
  def apply(): CreateLabelWriterPrintParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelWriterPrintParamsXmlParams]
  }
  @scala.inline
  implicit class CreateLabelWriterPrintParamsXmlParamsOps[Self <: CreateLabelWriterPrintParamsXmlParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowDirection(value: FlowDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintQuality(value: LabelWriterPrintQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withTwinTurboRoll(value: TwinTurboRoll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twinTurboRoll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwinTurboRoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twinTurboRoll")(js.undefined)
        ret
    }
  }
  
}

