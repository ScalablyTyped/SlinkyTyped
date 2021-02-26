package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAutomationExecutionResult extends StObject {
  
  /**
    * Detailed information about the current state of an automation execution.
    */
  var AutomationExecution: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecution] = js.native
}
object GetAutomationExecutionResult {
  
  @scala.inline
  def apply(): GetAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutomationExecutionResult]
  }
  
  @scala.inline
  implicit class GetAutomationExecutionResultMutableBuilder[Self <: GetAutomationExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationExecution(value: AutomationExecution): Self = StObject.set(x, "AutomationExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationExecutionUndefined: Self = StObject.set(x, "AutomationExecution", js.undefined)
  }
}
