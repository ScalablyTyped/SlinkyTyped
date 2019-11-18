package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.TmplAstBoundText {
  def this(
    value: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

