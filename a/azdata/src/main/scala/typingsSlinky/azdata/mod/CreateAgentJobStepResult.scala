package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAgentJobStepResult extends ResultStatus {
  
  var step: AgentJobStepInfo = js.native
}
object CreateAgentJobStepResult {
  
  @scala.inline
  def apply(errorMessage: String, step: AgentJobStepInfo, success: Boolean): CreateAgentJobStepResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentJobStepResult]
  }
  
  @scala.inline
  implicit class CreateAgentJobStepResultMutableBuilder[Self <: CreateAgentJobStepResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: AgentJobStepInfo): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
