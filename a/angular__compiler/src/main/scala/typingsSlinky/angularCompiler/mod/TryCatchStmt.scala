package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typingsSlinky.angularCompiler.compilerMod.TryCatchStmt {
  def this(
    bodyStmts: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    bodyStmts: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

