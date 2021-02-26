package typingsSlinky.artillery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type EventEmitter = typingsSlinky.node.eventsMod.EventEmitter
  
  type Next = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  type RequestResponse = typingsSlinky.request.mod.RequestResponse
  
  type ResponseRequest = typingsSlinky.request.mod.ResponseRequest
  
  @js.native
  trait ScenarioContext extends StObject {
    
    var vars: StringDictionary[js.Any] = js.native
  }
  object ScenarioContext {
    
    @scala.inline
    def apply(vars: StringDictionary[js.Any]): ScenarioContext = {
      val __obj = js.Dynamic.literal(vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioContext]
    }
    
    @scala.inline
    implicit class ScenarioContextMutableBuilder[Self <: ScenarioContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVars(value: StringDictionary[js.Any]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    }
  }
}
