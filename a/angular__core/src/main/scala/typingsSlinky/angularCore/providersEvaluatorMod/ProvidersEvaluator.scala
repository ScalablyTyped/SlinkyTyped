package typingsSlinky.angularCore.providersEvaluatorMod

import typingsSlinky.angularCore.anon.Literals
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StaticInterpreter * / any */ @JSImport("@angular/core/schematics/migrations/missing-injectable/providers_evaluator", "ProvidersEvaluator")
@js.native
class ProvidersEvaluator () extends js.Object {
  
  var _providerLiterals: js.Any = js.native
  
  /**
    * Evaluates the given expression and returns its statically resolved value
    * and a list of object literals which define Angular providers.
    */
  def evaluate(expr: Expression): Literals = js.native
  
  def visitObjectLiteralExpression(node: ObjectLiteralExpression, context: js.Any): js.Any = js.native
}
