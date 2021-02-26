package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMailboxExportJobResponse extends StObject {
  
  /**
    * The mailbox export job description.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.workmailMod.Description] = js.native
  
  /**
    * The mailbox export job end timestamp.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier of the user or resource associated with the mailbox.
    */
  var EntityId: js.UndefOr[WorkMailIdentifier] = js.native
  
  /**
    * Error information for failed mailbox export jobs.
    */
  var ErrorInfo: js.UndefOr[MailboxExportErrorInfo] = js.native
  
  /**
    * The estimated progress of the mailbox export job, in percentage points.
    */
  var EstimatedProgress: js.UndefOr[Percentage] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the exported mailbox content.
    */
  var KmsKeyArn: js.UndefOr[typingsSlinky.awsSdk.workmailMod.KmsKeyArn] = js.native
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon Simple Storage Service (Amazon S3) bucket.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.workmailMod.RoleArn] = js.native
  
  /**
    * The name of the S3 bucket.
    */
  var S3BucketName: js.UndefOr[typingsSlinky.awsSdk.workmailMod.S3BucketName] = js.native
  
  /**
    * The path to the S3 bucket and file that the mailbox export job is exporting to.
    */
  var S3Path: js.UndefOr[S3ObjectKey] = js.native
  
  /**
    * The S3 bucket prefix.
    */
  var S3Prefix: js.UndefOr[S3ObjectKey] = js.native
  
  /**
    * The mailbox export job start timestamp.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The state of the mailbox export job.
    */
  var State: js.UndefOr[MailboxExportJobState] = js.native
}
object DescribeMailboxExportJobResponse {
  
  @scala.inline
  def apply(): DescribeMailboxExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMailboxExportJobResponse]
  }
  
  @scala.inline
  implicit class DescribeMailboxExportJobResponseMutableBuilder[Self <: DescribeMailboxExportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: MailboxExportErrorInfo): Self = StObject.set(x, "ErrorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfoUndefined: Self = StObject.set(x, "ErrorInfo", js.undefined)
    
    @scala.inline
    def setEstimatedProgress(value: Percentage): Self = StObject.set(x, "EstimatedProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedProgressUndefined: Self = StObject.set(x, "EstimatedProgress", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3Path(value: S3ObjectKey): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PathUndefined: Self = StObject.set(x, "S3Path", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: S3ObjectKey): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: MailboxExportJobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
