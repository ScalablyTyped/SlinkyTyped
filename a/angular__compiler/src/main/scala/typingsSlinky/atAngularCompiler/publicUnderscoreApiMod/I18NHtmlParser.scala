package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typingsSlinky.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "I18NHtmlParser")
@js.native
class I18NHtmlParser protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.I18NHtmlParser {
  def this(_htmlParser: typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser) = this()
  def this(
    _htmlParser: typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    translations: String
  ) = this()
  def this(
    _htmlParser: typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    translations: String,
    translationsFormat: String
  ) = this()
  def this(
    _htmlParser: typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy
  ) = this()
  def this(
    _htmlParser: typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy,
    console: Console
  ) = this()
}

