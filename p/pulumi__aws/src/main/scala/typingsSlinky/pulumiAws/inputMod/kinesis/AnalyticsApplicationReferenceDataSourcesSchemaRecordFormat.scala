package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends StObject {
  
  /**
    * The Mapping Information for the record format.
    * See Mapping Parameters below for more details.
    */
  var mappingParameters: js.UndefOr[
    Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  ] = js.native
  
  /**
    * The type of Record Format. Can be `CSV` or `JSON`.
    */
  var recordFormatType: js.UndefOr[Input[String]] = js.native
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
  
  @scala.inline
  def apply(): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMutableBuilder[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMappingParameters(value: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]): Self = StObject.set(x, "mappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingParametersUndefined: Self = StObject.set(x, "mappingParameters", js.undefined)
    
    @scala.inline
    def setRecordFormatType(value: Input[String]): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordFormatTypeUndefined: Self = StObject.set(x, "recordFormatType", js.undefined)
  }
}
