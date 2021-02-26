package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentRunStateChange extends StObject {
  
  /**
    * The assessment run state.
    */
  var state: AssessmentRunState = js.native
  
  /**
    * The last time the assessment run state changed.
    */
  var stateChangedAt: js.Date = js.native
}
object AssessmentRunStateChange {
  
  @scala.inline
  def apply(state: AssessmentRunState, stateChangedAt: js.Date): AssessmentRunStateChange = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunStateChange]
  }
  
  @scala.inline
  implicit class AssessmentRunStateChangeMutableBuilder[Self <: AssessmentRunStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: AssessmentRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangedAt(value: js.Date): Self = StObject.set(x, "stateChangedAt", value.asInstanceOf[js.Any])
  }
}
