package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.astMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typingsSlinky.angularCompiler.astMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
