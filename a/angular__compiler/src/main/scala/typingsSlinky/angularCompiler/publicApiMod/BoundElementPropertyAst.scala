package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.coreMod.SecurityContext
import typingsSlinky.angularCompiler.templateAstMod.PropertyBindingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
/* static members */
@JSImport("@angular/compiler/public_api", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  
  def fromBoundProperty(prop: typingsSlinky.angularCompiler.astMod.BoundElementProperty): typingsSlinky.angularCompiler.templateAstMod.BoundElementPropertyAst = js.native
}
