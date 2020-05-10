package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv extends js.Object {
  var recordColumnDelimiter: Input[String] = js.native
  var recordRowDelimiter: Input[String] = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv {
  @scala.inline
  def apply(recordColumnDelimiter: Input[String], recordRowDelimiter: Input[String]): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]
  }
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvOps[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordColumnDelimiter(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordColumnDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordRowDelimiter(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordRowDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

