package typingsSlinky.angularCompiler.mlParserAstMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Text")
@js.native
class Text protected () extends Node {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  def this(value: String, sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(value: String, sourceSpan: ParseSourceSpan, i18n: typingsSlinky.angularCompiler.i18nAstMod.Node) = this()
  var i18n: js.UndefOr[Message | typingsSlinky.angularCompiler.i18nAstMod.Node] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: String = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

