package typingsSlinky.angularCompiler.expressionConverterMod

import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan
import typingsSlinky.angularCompiler.astMod.FunctionCall
import typingsSlinky.angularCompiler.astMod.ParseSpan
import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BuiltinFunctionCall")
@js.native
class BuiltinFunctionCall protected () extends FunctionCall {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, args: js.Array[AST], converter: BuiltinConverter) = this()
  
  @JSName("args")
  var args_BuiltinFunctionCall: js.Array[AST] = js.native
  
  def converter(args: js.Array[Expression]): Expression = js.native
  @JSName("converter")
  var converter_Original: BuiltinConverter = js.native
}
