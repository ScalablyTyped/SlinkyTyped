package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.srcCoreMod.SecurityContext
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    unit: String,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    unit: Null,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.BoundElementProperty): typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundElementPropertyAst = js.native
}

