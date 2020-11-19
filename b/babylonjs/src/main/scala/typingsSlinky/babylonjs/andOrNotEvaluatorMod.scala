package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/andOrNotEvaluator", JSImport.Namespace)
@js.native
object andOrNotEvaluatorMod extends js.Object {
  
  @js.native
  class AndOrNotEvaluator () extends js.Object
  /* static members */
  @js.native
  object AndOrNotEvaluator extends js.Object {
    
    /**
      * Evaluate a query
      * @param query defines the query to evaluate
      * @param evaluateCallback defines the callback used to filter result
      * @returns true if the query matches
      */
    def Eval(query: String, evaluateCallback: js.Function1[/* val */ js.Any, Boolean]): Boolean = js.native
    
    var _HandleParenthesisContent: js.Any = js.native
    
    var _SimplifyNegation: js.Any = js.native
  }
}
