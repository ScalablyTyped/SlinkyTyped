package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolResultsStep extends StObject {
  
  /** Output only. A tool results execution ID. */
  var executionId: js.UndefOr[String] = js.native
  
  /** Output only. A tool results history ID. */
  var historyId: js.UndefOr[String] = js.native
  
  /** Output only. The cloud project that owns the tool results step. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Output only. A tool results step ID. */
  var stepId: js.UndefOr[String] = js.native
}
object ToolResultsStep {
  
  @scala.inline
  def apply(): ToolResultsStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolResultsStep]
  }
  
  @scala.inline
  implicit class ToolResultsStepMutableBuilder[Self <: ToolResultsStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
