package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedS3DestinationUpdate extends js.Object {
  
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
  implicit class ExtendedS3DestinationUpdateOps[Self <: ExtendedS3DestinationUpdate] (val x: Self) extends AnyVal {
    
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
    def setBucketARN(value: BucketARN): Self = this.set("BucketARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketARN: Self = this.set("BucketARN", js.undefined)
    
    @scala.inline
    def setBufferingHints(value: BufferingHints): Self = this.set("BufferingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferingHints: Self = this.set("BufferingHints", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = this.set("CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLoggingOptions: Self = this.set("CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setCompressionFormat(value: CompressionFormat): Self = this.set("CompressionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionFormat: Self = this.set("CompressionFormat", js.undefined)
    
    @scala.inline
    def setDataFormatConversionConfiguration(value: DataFormatConversionConfiguration): Self = this.set("DataFormatConversionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormatConversionConfiguration: Self = this.set("DataFormatConversionConfiguration", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("EncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setErrorOutputPrefix(value: ErrorOutputPrefix): Self = this.set("ErrorOutputPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOutputPrefix: Self = this.set("ErrorOutputPrefix", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = this.set("ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: S3BackupMode): Self = this.set("S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3BackupUpdate(value: S3DestinationUpdate): Self = this.set("S3BackupUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupUpdate: Self = this.set("S3BackupUpdate", js.undefined)
  }
}
