package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortCriteria extends StObject {
  
  /**
    * The type of job action to take to initiate the job abort.
    */
  var action: AbortAction = js.native
  
  /**
    * The type of job execution failures that can initiate a job abort.
    */
  var failureType: JobExecutionFailureType = js.native
  
  /**
    * The minimum number of things which must receive job execution notifications before the job can be aborted.
    */
  var minNumberOfExecutedThings: MinimumNumberOfExecutedThings = js.native
  
  /**
    * The minimum percentage of job execution failures that must occur to initiate the job abort. AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
    */
  var thresholdPercentage: AbortThresholdPercentage = js.native
}
object AbortCriteria {
  
  @scala.inline
  def apply(
    action: AbortAction,
    failureType: JobExecutionFailureType,
    minNumberOfExecutedThings: MinimumNumberOfExecutedThings,
    thresholdPercentage: AbortThresholdPercentage
  ): AbortCriteria = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], minNumberOfExecutedThings = minNumberOfExecutedThings.asInstanceOf[js.Any], thresholdPercentage = thresholdPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortCriteria]
  }
  
  @scala.inline
  implicit class AbortCriteriaMutableBuilder[Self <: AbortCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: AbortAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureType(value: JobExecutionFailureType): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNumberOfExecutedThings(value: MinimumNumberOfExecutedThings): Self = StObject.set(x, "minNumberOfExecutedThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdPercentage(value: AbortThresholdPercentage): Self = StObject.set(x, "thresholdPercentage", value.asInstanceOf[js.Any])
  }
}
