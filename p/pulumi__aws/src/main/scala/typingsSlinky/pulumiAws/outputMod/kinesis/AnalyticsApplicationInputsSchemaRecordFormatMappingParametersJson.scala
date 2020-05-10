package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson extends js.Object {
  var recordRowPath: String = js.native
}

object AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson {
  @scala.inline
  def apply(recordRowPath: String): AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonOps[Self <: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordRowPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordRowPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

