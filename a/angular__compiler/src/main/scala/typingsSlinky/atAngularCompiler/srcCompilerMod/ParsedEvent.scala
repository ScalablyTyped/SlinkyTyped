package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

