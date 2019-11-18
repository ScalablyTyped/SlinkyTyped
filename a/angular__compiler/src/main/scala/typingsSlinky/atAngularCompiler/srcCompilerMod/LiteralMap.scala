package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.Anon_Key
import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.LiteralMapKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "LiteralMap")
@js.native
class LiteralMap protected ()
  extends typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.LiteralMap {
  def this(
    span: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParseSpan,
    keys: js.Array[LiteralMapKey],
    values: js.Array[_]
  ) = this()
}

@JSImport("@angular/compiler/src/compiler", "literalMap")
@js.native
object literalMap extends js.Object {
  def apply(values: js.Array[Anon_Key]): typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def apply(
    values: js.Array[Anon_Key],
    `type`: typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType
  ): typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
}

