package typingsSlinky.angularCompiler.templateAstMod

import typingsSlinky.angularCompiler.astMod.ParsedVariable
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "VariableAst")
@js.native
class VariableAst protected () extends TemplateAst {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var value: String = js.native
}

/* static members */
@JSImport("@angular/compiler/src/template_parser/template_ast", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: ParsedVariable): VariableAst = js.native
}

