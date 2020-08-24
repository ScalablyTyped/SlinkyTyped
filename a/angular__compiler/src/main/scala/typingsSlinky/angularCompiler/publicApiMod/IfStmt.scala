package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "IfStmt")
@js.native
class IfStmt protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.IfStmt {
  def this(
    condition: typingsSlinky.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typingsSlinky.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typingsSlinky.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    falseCase: js.UndefOr[scala.Nothing],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    condition: typingsSlinky.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

