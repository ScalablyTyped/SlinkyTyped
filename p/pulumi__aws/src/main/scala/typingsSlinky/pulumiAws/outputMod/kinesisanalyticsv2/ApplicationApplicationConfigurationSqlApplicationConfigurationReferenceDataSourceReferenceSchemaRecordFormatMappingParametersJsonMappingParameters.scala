package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters extends StObject {
  
  /**
    * The path to the top-level parent that contains the records.
    */
  var recordRowPath: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters {
  
  @scala.inline
  def apply(recordRowPath: String): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordRowPath(value: String): Self = StObject.set(x, "recordRowPath", value.asInstanceOf[js.Any])
  }
}
