package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "DeclareVarStmt")
@js.native
class DeclareVarStmt protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.DeclareVarStmt {
  def this(
    name: String,
    value: js.UndefOr[typingsSlinky.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[typingsSlinky.angularCompiler.outputAstMod.Type | Null],
    modifiers: js.UndefOr[js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier] | Null],
    sourceSpan: js.UndefOr[typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan | Null]
  ) = this()
}

