package typingsSlinky.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsSlinky.angularCompiler.compilerMod.VariableAst {
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
object VariableAst {
  
  @JSImport("@angular/compiler", "VariableAst.fromParsedVariable")
  @js.native
  def fromParsedVariable(v: typingsSlinky.angularCompiler.astMod.ParsedVariable): typingsSlinky.angularCompiler.templateAstMod.VariableAst = js.native
}
