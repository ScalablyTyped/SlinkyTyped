package typingsSlinky.angularCompiler.templateAstMod

import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundTextAst")
@js.native
class BoundTextAst protected () extends TemplateAst {
  def this(value: AST, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
  var ngContentIndex: Double = js.native
  var value: AST = js.native
}

