package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchema extends js.Object {
  var recordColumns: js.Array[AnalyticsApplicationInputsSchemaRecordColumn] = js.native
  var recordEncoding: js.UndefOr[String] = js.native
  var recordFormat: AnalyticsApplicationInputsSchemaRecordFormat = js.native
}

object AnalyticsApplicationInputsSchema {
  @scala.inline
  def apply(
    recordColumns: js.Array[AnalyticsApplicationInputsSchemaRecordColumn],
    recordFormat: AnalyticsApplicationInputsSchemaRecordFormat
  ): AnalyticsApplicationInputsSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchema]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaOps[Self <: AnalyticsApplicationInputsSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordColumns(value: js.Array[AnalyticsApplicationInputsSchemaRecordColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordFormat(value: AnalyticsApplicationInputsSchemaRecordFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordEncoding(value: String): Self = {
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

