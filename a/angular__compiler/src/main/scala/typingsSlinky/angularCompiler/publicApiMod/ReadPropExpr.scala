package typingsSlinky.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ReadPropExpr")
@js.native
class ReadPropExpr protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.ReadPropExpr {
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

