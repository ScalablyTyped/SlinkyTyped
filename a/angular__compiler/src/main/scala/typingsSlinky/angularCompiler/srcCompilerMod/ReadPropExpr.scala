package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ReadPropExpr")
@js.native
class ReadPropExpr protected ()
  extends typingsSlinky.angularCompiler.outputAstMod.ReadPropExpr {
  def this(receiver: typingsSlinky.angularCompiler.outputAstMod.Expression, name: String) = this()
  def this(
    receiver: typingsSlinky.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    receiver: typingsSlinky.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    receiver: typingsSlinky.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

