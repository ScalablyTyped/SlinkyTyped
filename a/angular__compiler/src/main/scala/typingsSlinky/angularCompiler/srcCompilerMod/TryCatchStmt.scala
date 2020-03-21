package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typingsSlinky.angularCompiler.outputAstMod.TryCatchStmt {
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

