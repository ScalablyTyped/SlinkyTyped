package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Attribute")
@js.native
class Attribute protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.Attribute {
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

