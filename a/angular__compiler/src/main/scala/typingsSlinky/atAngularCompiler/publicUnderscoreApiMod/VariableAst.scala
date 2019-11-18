package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.VariableAst {
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedVariable): typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst = js.native
}

