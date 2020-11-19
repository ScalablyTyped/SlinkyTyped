package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson extends js.Object {
  
  /**
    * Path to the top-level parent that contains the records.
    */
  var recordRowPath: String = js.native
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson {
  
  @scala.inline
  def apply(recordRowPath: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonOps[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecordRowPath(value: String): Self = this.set("recordRowPath", value.asInstanceOf[js.Any])
  }
}
