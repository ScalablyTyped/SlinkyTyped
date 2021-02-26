package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStopJobRunError extends StObject {
  
  /**
    * Specifies details about the error that was encountered.
    */
  var ErrorDetail: js.UndefOr[typingsSlinky.awsSdk.glueMod.ErrorDetail] = js.native
  
  /**
    * The name of the job definition that is used in the job run in question.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * The JobRunId of the job run in question.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}
object BatchStopJobRunError {
  
  @scala.inline
  def apply(): BatchStopJobRunError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunError]
  }
  
  @scala.inline
  implicit class BatchStopJobRunErrorMutableBuilder[Self <: BatchStopJobRunError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobRunId(value: IdString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
  }
}
