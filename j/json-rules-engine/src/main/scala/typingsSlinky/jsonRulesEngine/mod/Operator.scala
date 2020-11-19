package typingsSlinky.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-rules-engine", "Operator")
@js.native
class Operator[A, B] protected () extends js.Object {
  def this(name: String, evaluator: OperatorEvaluator[A, B]) = this()
  def this(
    name: String,
    evaluator: OperatorEvaluator[A, B],
    validator: js.Function1[/* factValue */ A, Boolean]
  ) = this()
  
  var name: String = js.native
}
