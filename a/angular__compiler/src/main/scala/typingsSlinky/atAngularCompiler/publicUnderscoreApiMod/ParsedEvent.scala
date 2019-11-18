package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

