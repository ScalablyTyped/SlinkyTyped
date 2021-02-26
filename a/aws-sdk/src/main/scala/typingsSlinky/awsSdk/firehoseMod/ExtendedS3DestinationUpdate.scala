package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedS3DestinationUpdate extends StObject {
  
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.BucketARN] = js.native
  
  /**
    * The buffering option.
    */
  var BufferingHints: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.BufferingHints] = js.native
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. 
    */
  var CompressionFormat: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CompressionFormat] = js.native
  
  /**
    * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
    */
  var DataFormatConversionConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DataFormatConversionConfiguration] = js.native
  
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.EncryptionConfiguration] = js.native
  
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see Custom Prefixes for Amazon S3 Objects.
    */
  var ErrorOutputPrefix: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ErrorOutputPrefix] = js.native
  
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can also specify a custom prefix, as described in Custom Prefixes for Amazon S3 Objects.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.Prefix] = js.native
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RoleARN] = js.native
  
  /**
    * You can update a delivery stream to enable Amazon S3 backup if it is disabled. If backup is enabled, you can't update the delivery stream to disable it. 
    */
  var S3BackupMode: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.S3BackupMode] = js.native
  
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.native
}
object ExtendedS3DestinationUpdate {
  
  @scala.inline
  def apply(): ExtendedS3DestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedS3DestinationUpdate]
  }
  
  @scala.inline
  implicit class ExtendedS3DestinationUpdateMutableBuilder[Self <: ExtendedS3DestinationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketARNUndefined: Self = StObject.set(x, "BucketARN", js.undefined)
    
    @scala.inline
    def setBufferingHints(value: BufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setCompressionFormat(value: CompressionFormat): Self = StObject.set(x, "CompressionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionFormatUndefined: Self = StObject.set(x, "CompressionFormat", js.undefined)
    
    @scala.inline
    def setDataFormatConversionConfiguration(value: DataFormatConversionConfiguration): Self = StObject.set(x, "DataFormatConversionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatConversionConfigurationUndefined: Self = StObject.set(x, "DataFormatConversionConfiguration", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setErrorOutputPrefix(value: ErrorOutputPrefix): Self = StObject.set(x, "ErrorOutputPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOutputPrefixUndefined: Self = StObject.set(x, "ErrorOutputPrefix", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: S3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3BackupUpdate(value: S3DestinationUpdate): Self = StObject.set(x, "S3BackupUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupUpdateUndefined: Self = StObject.set(x, "S3BackupUpdate", js.undefined)
  }
}
