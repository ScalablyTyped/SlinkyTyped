package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "Statement")
@js.native
abstract class Statement ()
  extends typingsSlinky.angularCompiler.outputAstMod.Statement {
  def this(modifiers: js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier]) = this()
  def this(
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    modifiers: js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
}
