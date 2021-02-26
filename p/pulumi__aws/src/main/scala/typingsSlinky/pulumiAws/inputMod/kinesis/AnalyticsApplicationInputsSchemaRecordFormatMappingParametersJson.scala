package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson extends StObject {
  
  /**
    * Path to the top-level parent that contains the records.
    */
  var recordRowPath: Input[String] = js.native
}
object AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson {
  
  @scala.inline
  def apply(recordRowPath: Input[String]): AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonMutableBuilder[Self <: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordRowPath(value: Input[String]): Self = StObject.set(x, "recordRowPath", value.asInstanceOf[js.Any])
  }
}
