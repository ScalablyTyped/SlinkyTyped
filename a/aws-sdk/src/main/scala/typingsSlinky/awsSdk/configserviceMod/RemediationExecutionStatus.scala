package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemediationExecutionStatus extends StObject {
  
  /**
    * Start time when the remediation was executed.
    */
  var InvocationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The time when the remediation execution was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  
  var ResourceKey: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceKey] = js.native
  
  /**
    * ENUM of the values.
    */
  var State: js.UndefOr[RemediationExecutionState] = js.native
  
  /**
    * Details of every step.
    */
  var StepDetails: js.UndefOr[RemediationExecutionSteps] = js.native
}
object RemediationExecutionStatus {
  
  @scala.inline
  def apply(): RemediationExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStatus]
  }
  
  @scala.inline
  implicit class RemediationExecutionStatusMutableBuilder[Self <: RemediationExecutionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationTime(value: js.Date): Self = StObject.set(x, "InvocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationTimeUndefined: Self = StObject.set(x, "InvocationTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setResourceKey(value: ResourceKey): Self = StObject.set(x, "ResourceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceKeyUndefined: Self = StObject.set(x, "ResourceKey", js.undefined)
    
    @scala.inline
    def setState(value: RemediationExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStepDetails(value: RemediationExecutionSteps): Self = StObject.set(x, "StepDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDetailsUndefined: Self = StObject.set(x, "StepDetails", js.undefined)
    
    @scala.inline
    def setStepDetailsVarargs(value: RemediationExecutionStep*): Self = StObject.set(x, "StepDetails", js.Array(value :_*))
  }
}
