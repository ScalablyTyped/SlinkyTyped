package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "DeclareVarStmt")
@js.native
class DeclareVarStmt protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.DeclareVarStmt {
  def this(
    name: String,
    value: js.UndefOr[typingsSlinky.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[typingsSlinky.angularCompiler.outputAstMod.Type | Null],
    modifiers: js.UndefOr[js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier] | Null],
    sourceSpan: js.UndefOr[typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan | Null]
  ) = this()
}
