package typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod

import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundText")
@js.native
class BoundText protected () extends Node {
  def this(value: AST, sourceSpan: ParseSourceSpan) = this()
  def this(value: AST, sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(
    value: AST,
    sourceSpan: ParseSourceSpan,
    i18n: typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: AST = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

