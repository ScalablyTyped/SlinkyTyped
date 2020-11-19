package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.VariableAst {
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
@JSImport("@angular/compiler/compiler", "VariableAst")
@js.native
object VariableAst extends js.Object {
  
  def fromParsedVariable(v: typingsSlinky.angularCompiler.astMod.ParsedVariable): typingsSlinky.angularCompiler.templateAstMod.VariableAst = js.native
}
