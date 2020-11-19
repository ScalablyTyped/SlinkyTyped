package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.VariableAst {
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
/* static members */
@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
object VariableAst extends js.Object {
  
  def fromParsedVariable(v: typingsSlinky.angularCompiler.astMod.ParsedVariable): typingsSlinky.angularCompiler.templateAstMod.VariableAst = js.native
}
