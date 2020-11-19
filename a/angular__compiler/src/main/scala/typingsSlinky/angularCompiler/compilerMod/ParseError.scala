package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ParseError")
@js.native
class ParseError protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ParseError {
  def this(span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(
    span: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    msg: String,
    level: typingsSlinky.angularCompiler.srcParseUtilMod.ParseErrorLevel
  ) = this()
}
