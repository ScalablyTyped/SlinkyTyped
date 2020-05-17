package typingsSlinky.angularCompiler.r3AstMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "TextAttribute")
@js.native
class TextAttribute protected () extends Node {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: typingsSlinky.angularCompiler.i18nAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsSlinky.angularCompiler.i18nAstMod.Node] = js.native
  var name: String = js.native
  var value: String = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}

