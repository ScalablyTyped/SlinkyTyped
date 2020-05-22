package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.outputAstMod.ExpressionType_
import typingsSlinky.angularCompiler.outputAstMod.InvokeFunctionExpr
import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  var expression: InvokeFunctionExpr
  var statements: js.Array[Statement]
  var `type`: ExpressionType_
}

object Expression {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, statements: js.Array[Statement], `type`: ExpressionType_): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

