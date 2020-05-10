package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchema extends js.Object {
  var recordColumns: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]] = js.native
  var recordEncoding: js.UndefOr[Input[String]] = js.native
  var recordFormat: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat] = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchema {
  @scala.inline
  def apply(
    recordColumns: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]],
    recordFormat: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  ): AnalyticsApplicationReferenceDataSourcesSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchema]
  }
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaOps[Self <: AnalyticsApplicationReferenceDataSourcesSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordColumns(value: Input[js.Array[Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordFormat(value: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordEncoding(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordEncoding")(js.undefined)
        ret
    }
  }
  
}

