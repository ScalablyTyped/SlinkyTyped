package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Expansion")
@js.native
class Expansion protected ()
  extends typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Expansion {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

