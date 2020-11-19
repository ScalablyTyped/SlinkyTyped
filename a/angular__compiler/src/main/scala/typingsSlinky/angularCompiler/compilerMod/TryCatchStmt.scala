package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.TryCatchStmt {
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
