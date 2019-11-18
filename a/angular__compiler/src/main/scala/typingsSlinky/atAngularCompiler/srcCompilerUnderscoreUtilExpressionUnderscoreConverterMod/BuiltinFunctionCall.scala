package typingsSlinky.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.FunctionCall
import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParseSpan
import typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BuiltinFunctionCall")
@js.native
class BuiltinFunctionCall protected () extends FunctionCall {
  def this(span: ParseSpan, args: js.Array[AST], converter: BuiltinConverter) = this()
  @JSName("args")
  var args_BuiltinFunctionCall: js.Array[AST] = js.native
  @JSName("converter")
  var converter_Original: BuiltinConverter = js.native
  def converter(args: js.Array[Expression]): Expression = js.native
}

