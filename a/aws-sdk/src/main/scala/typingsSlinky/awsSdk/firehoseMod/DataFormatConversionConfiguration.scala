package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataFormatConversionConfiguration extends StObject {
  
  /**
    * Defaults to true. Set it to false if you want to disable format conversion while preserving the configuration details.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. This parameter is required if Enabled is set to true.
    */
  var InputFormatConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.InputFormatConfiguration] = js.native
  
  /**
    * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. This parameter is required if Enabled is set to true.
    */
  var OutputFormatConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.OutputFormatConfiguration] = js.native
  
  /**
    * Specifies the AWS Glue Data Catalog table that contains the column information. This parameter is required if Enabled is set to true.
    */
  var SchemaConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.SchemaConfiguration] = js.native
}
object DataFormatConversionConfiguration {
  
  @scala.inline
  def apply(): DataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormatConversionConfiguration]
  }
  
  @scala.inline
  implicit class DataFormatConversionConfigurationMutableBuilder[Self <: DataFormatConversionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: BooleanObject): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setInputFormatConfiguration(value: InputFormatConfiguration): Self = StObject.set(x, "InputFormatConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFormatConfigurationUndefined: Self = StObject.set(x, "InputFormatConfiguration", js.undefined)
    
    @scala.inline
    def setOutputFormatConfiguration(value: OutputFormatConfiguration): Self = StObject.set(x, "OutputFormatConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormatConfigurationUndefined: Self = StObject.set(x, "OutputFormatConfiguration", js.undefined)
    
    @scala.inline
    def setSchemaConfiguration(value: SchemaConfiguration): Self = StObject.set(x, "SchemaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaConfigurationUndefined: Self = StObject.set(x, "SchemaConfiguration", js.undefined)
  }
}
