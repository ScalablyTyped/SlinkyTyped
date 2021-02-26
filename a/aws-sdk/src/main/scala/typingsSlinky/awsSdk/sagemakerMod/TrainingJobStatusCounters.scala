package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingJobStatusCounters extends StObject {
  
  /**
    * The number of completed training jobs launched by the hyperparameter tuning job.
    */
  var Completed: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of in-progress training jobs launched by a hyperparameter tuning job.
    */
  var InProgress: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed because a client error occurred.
    */
  var NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it failed because an internal service error occurred.
    */
  var RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
    */
  var Stopped: js.UndefOr[TrainingJobStatusCounter] = js.native
}
object TrainingJobStatusCounters {
  
  @scala.inline
  def apply(): TrainingJobStatusCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJobStatusCounters]
  }
  
  @scala.inline
  implicit class TrainingJobStatusCountersMutableBuilder[Self <: TrainingJobStatusCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: TrainingJobStatusCounter): Self = StObject.set(x, "Completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "Completed", js.undefined)
    
    @scala.inline
    def setInProgress(value: TrainingJobStatusCounter): Self = StObject.set(x, "InProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgressUndefined: Self = StObject.set(x, "InProgress", js.undefined)
    
    @scala.inline
    def setNonRetryableError(value: TrainingJobStatusCounter): Self = StObject.set(x, "NonRetryableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonRetryableErrorUndefined: Self = StObject.set(x, "NonRetryableError", js.undefined)
    
    @scala.inline
    def setRetryableError(value: TrainingJobStatusCounter): Self = StObject.set(x, "RetryableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryableErrorUndefined: Self = StObject.set(x, "RetryableError", js.undefined)
    
    @scala.inline
    def setStopped(value: TrainingJobStatusCounter): Self = StObject.set(x, "Stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedUndefined: Self = StObject.set(x, "Stopped", js.undefined)
  }
}
