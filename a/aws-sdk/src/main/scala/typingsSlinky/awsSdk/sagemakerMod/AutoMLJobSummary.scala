package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLJobSummary extends StObject {
  
  /**
    * The ARN of the job.
    */
  var AutoMLJobArn: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn = js.native
  
  /**
    * The name of the object you are requesting.
    */
  var AutoMLJobName: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobName = js.native
  
  /**
    * The job's secondary status.
    */
  var AutoMLJobSecondaryStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobSecondaryStatus = js.native
  
  /**
    * The job's status.
    */
  var AutoMLJobStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobStatus = js.native
  
  /**
    * When the job was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The end time of an AutoML job.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The failure reason of a job.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  
  /**
    * When the job was last modified.
    */
  var LastModifiedTime: js.Date = js.native
}
object AutoMLJobSummary {
  
  @scala.inline
  def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: js.Date,
    LastModifiedTime: js.Date
  ): AutoMLJobSummary = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobSummary]
  }
  
  @scala.inline
  implicit class AutoMLJobSummaryMutableBuilder[Self <: AutoMLJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = StObject.set(x, "AutoMLJobSecondaryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobStatus(value: AutoMLJobStatus): Self = StObject.set(x, "AutoMLJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
