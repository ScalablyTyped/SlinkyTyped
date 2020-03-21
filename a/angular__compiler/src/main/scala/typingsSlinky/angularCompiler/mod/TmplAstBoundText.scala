package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.TmplAstBoundText {
  def this(
    value: typingsSlinky.angularCompiler.astMod.AST,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: typingsSlinky.angularCompiler.astMod.AST,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: typingsSlinky.angularCompiler.astMod.AST,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

