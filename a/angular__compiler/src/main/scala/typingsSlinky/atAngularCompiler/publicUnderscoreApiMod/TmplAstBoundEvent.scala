package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEventType
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.TmplAstBoundEvent {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: String,
    phase: String,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: String,
    phase: Null,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: Null,
    phase: String,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: Null,
    phase: Null,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "TmplAstBoundEvent")
@js.native
object TmplAstBoundEvent extends js.Object {
  def fromParsedEvent(event: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEvent): BoundEvent = js.native
}

