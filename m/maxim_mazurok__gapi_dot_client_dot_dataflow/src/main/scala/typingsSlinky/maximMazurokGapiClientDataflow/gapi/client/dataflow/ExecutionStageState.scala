package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionStageState extends StObject {
  
  /** The time at which the stage transitioned to this state. */
  var currentStateTime: js.UndefOr[String] = js.native
  
  /** The name of the execution stage. */
  var executionStageName: js.UndefOr[String] = js.native
  
  /** Executions stage states allow the same set of values as JobState. */
  var executionStageState: js.UndefOr[String] = js.native
}
object ExecutionStageState {
  
  @scala.inline
  def apply(): ExecutionStageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStageState]
  }
  
  @scala.inline
  implicit class ExecutionStageStateMutableBuilder[Self <: ExecutionStageState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentStateTime(value: String): Self = StObject.set(x, "currentStateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateTimeUndefined: Self = StObject.set(x, "currentStateTime", js.undefined)
    
    @scala.inline
    def setExecutionStageName(value: String): Self = StObject.set(x, "executionStageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStageNameUndefined: Self = StObject.set(x, "executionStageName", js.undefined)
    
    @scala.inline
    def setExecutionStageState(value: String): Self = StObject.set(x, "executionStageState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStageStateUndefined: Self = StObject.set(x, "executionStageState", js.undefined)
  }
}
