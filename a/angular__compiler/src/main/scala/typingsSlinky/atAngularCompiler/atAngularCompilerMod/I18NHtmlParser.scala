package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typingsSlinky.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "I18NHtmlParser")
@js.native
class I18NHtmlParser protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.I18NHtmlParser {
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

