package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailboxExportJob extends js.Object {
  
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
    * The estimated progress of the mailbox export job, in percentage points.
    */
  var EstimatedProgress: js.UndefOr[Percentage] = js.native
  
  /**
    * The identifier of the mailbox export job.
    */
  var JobId: js.UndefOr[MailboxExportJobId] = js.native
  
  /**
    * The name of the S3 bucket.
    */
  var S3BucketName: js.UndefOr[typingsSlinky.awsSdk.workmailMod.S3BucketName] = js.native
  
  /**
    * The path to the S3 bucket and file that the mailbox export job exports to.
    */
  var S3Path: js.UndefOr[S3ObjectKey] = js.native
  
  /**
    * The mailbox export job start timestamp.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The state of the mailbox export job.
    */
  var State: js.UndefOr[MailboxExportJobState] = js.native
}
object MailboxExportJob {
  
  @scala.inline
  def apply(): MailboxExportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailboxExportJob]
  }
  
  @scala.inline
  implicit class MailboxExportJobOps[Self <: MailboxExportJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("EntityId", js.undefined)
    
    @scala.inline
    def setEstimatedProgress(value: Percentage): Self = this.set("EstimatedProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedProgress: Self = this.set("EstimatedProgress", js.undefined)
    
    @scala.inline
    def setJobId(value: MailboxExportJobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    
    @scala.inline
    def setS3Path(value: S3ObjectKey): Self = this.set("S3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Path: Self = this.set("S3Path", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setState(value: MailboxExportJobState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
