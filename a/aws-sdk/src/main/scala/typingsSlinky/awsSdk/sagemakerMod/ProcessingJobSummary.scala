package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingJobSummary extends StObject {
  
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExitMessage] = js.native
  
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * A timestamp that indicates the last time the processing job was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the processing job..
    */
  var ProcessingJobArn: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobArn = js.native
  
  /**
    * The name of the processing job.
    */
  var ProcessingJobName: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName = js.native
  
  /**
    * The status of the processing job.
    */
  var ProcessingJobStatus: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobStatus = js.native
}
object ProcessingJobSummary {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus
  ): ProcessingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingJobSummary]
  }
  
  @scala.inline
  implicit class ProcessingJobSummaryMutableBuilder[Self <: ProcessingJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitMessage(value: ExitMessage): Self = StObject.set(x, "ExitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitMessageUndefined: Self = StObject.set(x, "ExitMessage", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setProcessingEndTime(value: js.Date): Self = StObject.set(x, "ProcessingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingEndTimeUndefined: Self = StObject.set(x, "ProcessingEndTime", js.undefined)
    
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobStatus(value: ProcessingJobStatus): Self = StObject.set(x, "ProcessingJobStatus", value.asInstanceOf[js.Any])
  }
}
