package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.outputAstMod.LiteralMapEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.LiteralMapExpr {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: typingsSlinky.angularCompiler.outputAstMod.MapType) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
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
