package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "WriteVarExpr")
@js.native
class WriteVarExpr protected ()
  extends typingsSlinky.angularCompiler.compilerMod.WriteVarExpr {
  def this(name: String, value: typingsSlinky.angularCompiler.outputAstMod.Expression) = this()
  def this(
    name: String,
    value: typingsSlinky.angularCompiler.outputAstMod.Expression,
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    name: String,
    value: typingsSlinky.angularCompiler.outputAstMod.Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: typingsSlinky.angularCompiler.outputAstMod.Expression,
    `type`: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: typingsSlinky.angularCompiler.outputAstMod.Expression,
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

