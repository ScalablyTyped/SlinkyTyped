package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy
import typingsSlinky.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "I18NHtmlParser")
@js.native
class I18NHtmlParser protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.I18NHtmlParser {
  def this(_htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser) = this()
  def this(_htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser, translations: String) = this()
  def this(
    _htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String
  ) = this()
  def this(
    _htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy
  ) = this()
  def this(
    _htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy,
    console: Console
  ) = this()
}

