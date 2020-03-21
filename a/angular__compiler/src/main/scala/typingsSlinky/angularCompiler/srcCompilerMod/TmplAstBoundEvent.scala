package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.astMod.ParsedEventType
import typingsSlinky.angularCompiler.r3AstMod.BoundEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected () extends BoundEvent {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.angularCompiler.astMod.AST,
    target: String,
    phase: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.angularCompiler.astMod.AST,
    target: String,
    phase: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.angularCompiler.astMod.AST,
    target: Null,
    phase: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.angularCompiler.astMod.AST,
    target: Null,
    phase: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "TmplAstBoundEvent")
@js.native
object TmplAstBoundEvent extends js.Object {
  def fromParsedEvent(event: typingsSlinky.angularCompiler.astMod.ParsedEvent): BoundEvent = js.native
}

