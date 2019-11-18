package typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod

import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Text")
@js.native
class Text protected () extends Node {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  def this(value: String, sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(
    value: String,
    sourceSpan: ParseSourceSpan,
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: String = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

