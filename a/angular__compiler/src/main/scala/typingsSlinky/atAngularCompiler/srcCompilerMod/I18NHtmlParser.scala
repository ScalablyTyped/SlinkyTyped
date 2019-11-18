package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typingsSlinky.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "I18NHtmlParser")
@js.native
class I18NHtmlParser protected ()
  extends typingsSlinky.atAngularCompiler.srcI18nMod.I18NHtmlParser {
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

