package typingsSlinky.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialFailure extends StObject {
  
  /**
    * The type of error.
    */
  var ExceptionType: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ExceptionType] = js.native
  
  /**
    * The code of the error.
    */
  var FailureCode: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.FailureCode] = js.native
  
  /**
    * A description of the error.
    */
  var FailureDescription: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.FailureDescription] = js.native
  
  /**
    * The specified rule that could not be deleted.
    */
  var FailureResource: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.FailureResource] = js.native
}
object PartialFailure {
  
  @scala.inline
  def apply(): PartialFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFailure]
  }
  
  @scala.inline
  implicit class PartialFailureMutableBuilder[Self <: PartialFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionType(value: ExceptionType): Self = StObject.set(x, "ExceptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionTypeUndefined: Self = StObject.set(x, "ExceptionType", js.undefined)
    
    @scala.inline
    def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setFailureDescription(value: FailureDescription): Self = StObject.set(x, "FailureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDescriptionUndefined: Self = StObject.set(x, "FailureDescription", js.undefined)
    
    @scala.inline
    def setFailureResource(value: FailureResource): Self = StObject.set(x, "FailureResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureResourceUndefined: Self = StObject.set(x, "FailureResource", js.undefined)
  }
}
