package typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod

import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Attribute")
@js.native
class Attribute protected () extends Node {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
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
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  var name: String = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: String = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

