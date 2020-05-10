package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends js.Object {
  var mappingParameters: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters] = js.native
  var recordFormatType: String = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
  @scala.inline
  def apply(recordFormatType: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  }
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatOps[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordFormatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFormatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappingParameters(value: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters): Self = {
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
  }
  
}

