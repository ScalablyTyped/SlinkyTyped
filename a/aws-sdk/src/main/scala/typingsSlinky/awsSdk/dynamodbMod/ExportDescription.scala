package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDescription extends StObject {
  
  /**
    * The billable size of the table export.
    */
  var BilledSizeBytes: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BilledSizeBytes] = js.native
  
  /**
    * The client token that was provided for the export task. A client token makes calls to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ClientToken] = js.native
  
  /**
    * The time at which the export task completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the table export.
    */
  var ExportArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExportArn] = js.native
  
  /**
    * The format of the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
    */
  var ExportFormat: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExportFormat] = js.native
  
  /**
    * The name of the manifest file for the export task.
    */
  var ExportManifest: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExportManifest] = js.native
  
  /**
    * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
    */
  var ExportStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExportStatus] = js.native
  
  /**
    * Point in time from which table data was exported.
    */
  var ExportTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Status code for the result of the failed export.
    */
  var FailureCode: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.FailureCode] = js.native
  
  /**
    * Export failure reason description.
    */
  var FailureMessage: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.FailureMessage] = js.native
  
  /**
    * The number of items exported.
    */
  var ItemCount: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ItemCount] = js.native
  
  /**
    * The name of the Amazon S3 bucket containing the export.
    */
  var S3Bucket: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.S3Bucket] = js.native
  
  /**
    * The ID of the AWS account that owns the bucket containing the export.
    */
  var S3BucketOwner: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.S3BucketOwner] = js.native
  
  /**
    * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.S3Prefix] = js.native
  
  /**
    * Type of encryption used on the bucket where export data is stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with AWS KMS managed keys  
    */
  var S3SseAlgorithm: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.S3SseAlgorithm] = js.native
  
  /**
    * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
    */
  var S3SseKmsKeyId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.S3SseKmsKeyId] = js.native
  
  /**
    * The time at which the export task began.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the table that was exported.
    */
  var TableArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableArn] = js.native
  
  /**
    * Unique ID of the table that was exported.
    */
  var TableId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableId] = js.native
}
object ExportDescription {
  
  @scala.inline
  def apply(): ExportDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDescription]
  }
  
  @scala.inline
  implicit class ExportDescriptionMutableBuilder[Self <: ExportDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilledSizeBytes(value: BilledSizeBytes): Self = StObject.set(x, "BilledSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilledSizeBytesUndefined: Self = StObject.set(x, "BilledSizeBytes", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
    
    @scala.inline
    def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
    
    @scala.inline
    def setExportManifest(value: ExportManifest): Self = StObject.set(x, "ExportManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportManifestUndefined: Self = StObject.set(x, "ExportManifest", js.undefined)
    
    @scala.inline
    def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
    
    @scala.inline
    def setExportTime(value: js.Date): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
    
    @scala.inline
    def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    @scala.inline
    def setItemCount(value: ItemCount): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    @scala.inline
    def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
    
    @scala.inline
    def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    @scala.inline
    def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
  }
}
