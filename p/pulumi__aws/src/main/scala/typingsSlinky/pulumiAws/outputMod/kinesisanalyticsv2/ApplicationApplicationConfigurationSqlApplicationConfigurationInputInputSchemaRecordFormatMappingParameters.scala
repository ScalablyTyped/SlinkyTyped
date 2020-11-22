package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters extends js.Object {
  
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var csvMappingParameters: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters
  ] = js.native
  
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var jsonMappingParameters: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters
  ] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParameters] (val x: Self) extends AnyVal {
    
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
    def setCsvMappingParameters(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParameters
    ): Self = this.set("csvMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvMappingParameters: Self = this.set("csvMappingParameters", js.undefined)
    
    @scala.inline
    def setJsonMappingParameters(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParameters
    ): Self = this.set("jsonMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonMappingParameters: Self = this.set("jsonMappingParameters", js.undefined)
  }
}
