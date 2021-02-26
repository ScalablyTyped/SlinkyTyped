package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepSummary extends StObject {
  
  /**
    * The action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is available for backward compatibility. We recommend using TERMINATE_CLUSTER instead.
    */
  var ActionOnFailure: js.UndefOr[typingsSlinky.awsSdk.emrMod.ActionOnFailure] = js.native
  
  /**
    * The Hadoop job configuration of the cluster step.
    */
  var Config: js.UndefOr[HadoopStepConfig] = js.native
  
  /**
    * The identifier of the cluster step.
    */
  var Id: js.UndefOr[StepId] = js.native
  
  /**
    * The name of the cluster step.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The current execution status details of the cluster step.
    */
  var Status: js.UndefOr[StepStatus] = js.native
}
object StepSummary {
  
  @scala.inline
  def apply(): StepSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepSummary]
  }
  
  @scala.inline
  implicit class StepSummaryMutableBuilder[Self <: StepSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOnFailure(value: ActionOnFailure): Self = StObject.set(x, "ActionOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionOnFailureUndefined: Self = StObject.set(x, "ActionOnFailure", js.undefined)
    
    @scala.inline
    def setConfig(value: HadoopStepConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    @scala.inline
    def setId(value: StepId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: StepStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
