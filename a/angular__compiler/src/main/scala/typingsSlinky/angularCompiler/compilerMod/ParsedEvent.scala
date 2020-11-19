package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.astMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
