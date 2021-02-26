package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStartResponse extends StObject {
  
  /**
    * List of failed operations
    */
  var Failed: js.UndefOr[listOfBatchFailedResultModel] = js.native
  
  /**
    * List of successful operations
    */
  var Successful: js.UndefOr[listOfBatchSuccessfulResultModel] = js.native
}
object BatchStartResponse {
  
  @scala.inline
  def apply(): BatchStartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStartResponse]
  }
  
  @scala.inline
  implicit class BatchStartResponseMutableBuilder[Self <: BatchStartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: listOfBatchFailedResultModel): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    @scala.inline
    def setFailedVarargs(value: BatchFailedResultModel*): Self = StObject.set(x, "Failed", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: listOfBatchSuccessfulResultModel): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    @scala.inline
    def setSuccessfulVarargs(value: BatchSuccessfulResultModel*): Self = StObject.set(x, "Successful", js.Array(value :_*))
  }
}
