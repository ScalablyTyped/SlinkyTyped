package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormat extends js.Object {
  var mappingParameters: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]] = js.native
  var recordFormatType: js.UndefOr[Input[String]] = js.native
}

object AnalyticsApplicationInputsSchemaRecordFormat {
  @scala.inline
  def apply(): AnalyticsApplicationInputsSchemaRecordFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormat]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordFormatOps[Self <: AnalyticsApplicationInputsSchemaRecordFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMappingParameters(value: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMappingParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordFormatType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFormatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordFormatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFormatType")(js.undefined)
        ret
    }
  }
  
}

