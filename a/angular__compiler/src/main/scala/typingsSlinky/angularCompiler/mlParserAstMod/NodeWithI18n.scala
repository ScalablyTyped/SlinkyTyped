package typingsSlinky.angularCompiler.mlParserAstMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "NodeWithI18n")
@js.native
abstract class NodeWithI18n protected () extends Node {
  def this(sourceSpan: ParseSourceSpan) = this()
  def this(sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(sourceSpan: ParseSourceSpan, i18n: typingsSlinky.angularCompiler.i18nAstMod.Node) = this()
  var i18n: js.UndefOr[Message | typingsSlinky.angularCompiler.i18nAstMod.Node] = js.native
}

