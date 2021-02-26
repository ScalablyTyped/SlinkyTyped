package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.coreMod.SecurityContext
import typingsSlinky.angularCompiler.templateAstMod.PropertyBindingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typingsSlinky.angularCompiler.templateAstMod.BoundElementPropertyAst {
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
object BoundElementPropertyAst {
  
  @JSImport("@angular/compiler/src/compiler", "BoundElementPropertyAst.fromBoundProperty")
  @js.native
  def fromBoundProperty(prop: typingsSlinky.angularCompiler.astMod.BoundElementProperty): typingsSlinky.angularCompiler.templateAstMod.BoundElementPropertyAst = js.native
}
