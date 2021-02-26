package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldFailure extends StObject {
  
  /**
    * The failure code of the world export job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  
    */
  var failureCode: js.UndefOr[WorldGenerationJobErrorCode] = js.native
  
  /**
    * The number of failed worlds.
    */
  var failureCount: js.UndefOr[Integer] = js.native
  
  /**
    * The sample reason why the world failed. World errors are aggregated. A sample is used as the sampleFailureReason. 
    */
  var sampleFailureReason: js.UndefOr[GenericString] = js.native
}
object WorldFailure {
  
  @scala.inline
  def apply(): WorldFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldFailure]
  }
  
  @scala.inline
  implicit class WorldFailureMutableBuilder[Self <: WorldFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCode(value: WorldGenerationJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Integer): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    @scala.inline
    def setSampleFailureReason(value: GenericString): Self = StObject.set(x, "sampleFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleFailureReasonUndefined: Self = StObject.set(x, "sampleFailureReason", js.undefined)
  }
}
