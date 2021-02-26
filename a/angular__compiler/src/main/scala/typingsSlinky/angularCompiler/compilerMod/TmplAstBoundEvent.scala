package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.astMod.ParsedEventType
import typingsSlinky.angularCompiler.r3AstMod.BoundEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.TmplAstBoundEvent {
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
object TmplAstBoundEvent {
  
  @JSImport("@angular/compiler/compiler", "TmplAstBoundEvent.fromParsedEvent")
  @js.native
  def fromParsedEvent(event: typingsSlinky.angularCompiler.astMod.ParsedEvent): BoundEvent = js.native
}
