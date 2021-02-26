package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer extends StObject {
  
  /**
    * Nested argument that specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). More details below.
    */
  var orcSerDe: js.UndefOr[
    Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe
    ]
  ] = js.native
  
  /**
    * Nested argument that specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/documentation/latest/). More details below.
    */
  var parquetSerDe: js.UndefOr[
    Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe
    ]
  ] = js.native
}
object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerMutableBuilder[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrcSerDe(
      value: Input[
          FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe
        ]
    ): Self = StObject.set(x, "orcSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrcSerDeUndefined: Self = StObject.set(x, "orcSerDe", js.undefined)
    
    @scala.inline
    def setParquetSerDe(
      value: Input[
          FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe
        ]
    ): Self = StObject.set(x, "parquetSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParquetSerDeUndefined: Self = StObject.set(x, "parquetSerDe", js.undefined)
  }
}
