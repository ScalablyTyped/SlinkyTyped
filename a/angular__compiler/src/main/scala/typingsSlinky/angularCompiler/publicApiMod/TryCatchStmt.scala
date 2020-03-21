package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.TryCatchStmt {
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

