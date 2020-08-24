package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "DeclareVarStmt")
@js.native
class DeclareVarStmt protected ()
  extends typingsSlinky.angularCompiler.outputAstMod.DeclareVarStmt {
  def this(
    name: String,
    value: js.UndefOr[typingsSlinky.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[typingsSlinky.angularCompiler.outputAstMod.Type | Null],
    modifiers: js.UndefOr[js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier] | Null],
    sourceSpan: js.UndefOr[typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan | Null]
  ) = this()
}

