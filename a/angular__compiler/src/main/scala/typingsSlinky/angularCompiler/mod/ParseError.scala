package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseError")
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

