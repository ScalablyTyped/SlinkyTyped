package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Expansion")
@js.native
class Expansion protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.Expansion {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsSlinky.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsSlinky.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsSlinky.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

