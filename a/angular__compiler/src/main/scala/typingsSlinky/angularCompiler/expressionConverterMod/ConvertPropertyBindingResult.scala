package typingsSlinky.angularCompiler.expressionConverterMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "ConvertPropertyBindingResult")
@js.native
class ConvertPropertyBindingResult protected () extends js.Object {
  def this(stmts: js.Array[Statement], currValExpr: Expression) = this()
  var currValExpr: Expression = js.native
  var stmts: js.Array[Statement] = js.native
}

