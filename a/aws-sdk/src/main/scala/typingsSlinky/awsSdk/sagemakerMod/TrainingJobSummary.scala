package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingJobSummary extends StObject {
  
  /**
    * A timestamp that shows when the training job was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    *  Timestamp when the training job was last modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A timestamp that shows when the training job ended. This field is set only if the training job has one of the terminal statuses (Completed, Failed, or Stopped). 
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typingsSlinky.awsSdk.sagemakerMod.TrainingJobArn = js.native
  
  /**
    * The name of the training job that you want a summary for.
    */
  var TrainingJobName: typingsSlinky.awsSdk.sagemakerMod.TrainingJobName = js.native
  
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatus = js.native
}
object TrainingJobSummary {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus
  ): TrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any], TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobSummary]
  }
  
  @scala.inline
  implicit class TrainingJobSummaryMutableBuilder[Self <: TrainingJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setTrainingEndTime(value: js.Date): Self = StObject.set(x, "TrainingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingEndTimeUndefined: Self = StObject.set(x, "TrainingEndTime", js.undefined)
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobStatus(value: TrainingJobStatus): Self = StObject.set(x, "TrainingJobStatus", value.asInstanceOf[js.Any])
  }
}
