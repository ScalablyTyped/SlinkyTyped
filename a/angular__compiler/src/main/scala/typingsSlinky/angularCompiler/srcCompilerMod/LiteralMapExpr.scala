package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.outputAstMod.LiteralMapEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected ()
  extends typingsSlinky.angularCompiler.outputAstMod.LiteralMapExpr {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: typingsSlinky.angularCompiler.outputAstMod.MapType) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: typingsSlinky.angularCompiler.outputAstMod.MapType,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

