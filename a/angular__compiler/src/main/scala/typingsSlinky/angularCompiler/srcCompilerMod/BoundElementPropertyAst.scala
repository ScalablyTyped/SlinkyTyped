package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.coreMod.SecurityContext
import typingsSlinky.angularCompiler.templateAstMod.PropertyBindingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typingsSlinky.angularCompiler.templateAstMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: typingsSlinky.angularCompiler.astMod.BoundElementProperty): typingsSlinky.angularCompiler.templateAstMod.BoundElementPropertyAst = js.native
}

