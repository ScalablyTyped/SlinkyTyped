package typingsSlinky.cucumber.mod

import typingsSlinky.cucumber.mod.pickle.Pickle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookScenarioResult extends StObject {
  
  var pickle: Pickle = js.native
  
  var result: ScenarioResult = js.native
  
  var sourceLocation: SourceLocation = js.native
}
object HookScenarioResult {
  
  @scala.inline
  def apply(pickle: Pickle, result: ScenarioResult, sourceLocation: SourceLocation): HookScenarioResult = {
    val __obj = js.Dynamic.literal(pickle = pickle.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookScenarioResult]
  }
  
  @scala.inline
  implicit class HookScenarioResultMutableBuilder[Self <: HookScenarioResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: ScenarioResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: SourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
  }
}
