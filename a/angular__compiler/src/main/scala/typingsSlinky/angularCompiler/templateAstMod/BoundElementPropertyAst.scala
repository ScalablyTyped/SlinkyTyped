package typingsSlinky.angularCompiler.templateAstMod

import typingsSlinky.angularCompiler.astMod.ASTWithSource
import typingsSlinky.angularCompiler.astMod.BoundElementProperty
import typingsSlinky.angularCompiler.coreMod.SecurityContext
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected () extends TemplateAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: String,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  
  val isAnimation: Boolean = js.native
  
  var name: String = js.native
  
  var securityContext: SecurityContext = js.native
  
  var `type`: PropertyBindingType = js.native
  
  var unit: String | Null = js.native
  
  var value: ASTWithSource = js.native
}
/* static members */
@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  
  def fromBoundProperty(prop: BoundElementProperty): BoundElementPropertyAst = js.native
}
