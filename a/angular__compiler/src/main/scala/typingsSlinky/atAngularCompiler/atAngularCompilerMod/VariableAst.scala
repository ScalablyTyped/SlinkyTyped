package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.VariableAst {
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedVariable): typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst = js.native
}

