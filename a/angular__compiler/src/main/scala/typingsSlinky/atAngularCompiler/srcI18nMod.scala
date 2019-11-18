package typingsSlinky.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typingsSlinky.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typingsSlinky.atAngularCompiler.srcI18nExtractorMod.ExtractorHost
import typingsSlinky.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser
import typingsSlinky.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n", JSImport.Namespace)
@js.native
object srcI18nMod extends js.Object {
  @js.native
  class Extractor protected ()
    extends typingsSlinky.atAngularCompiler.srcI18nExtractorMod.Extractor {
    def this(
      host: ExtractorHost,
      staticSymbolResolver: StaticSymbolResolver,
      messageBundle: typingsSlinky.atAngularCompiler.srcI18nMessageUnderscoreBundleMod.MessageBundle,
      metadataResolver: CompileMetadataResolver
    ) = this()
  }
  
  @js.native
  class I18NHtmlParser protected ()
    extends typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreHtmlUnderscoreParserMod.I18NHtmlParser {
    def this(_htmlParser: HtmlParser) = this()
    def this(_htmlParser: HtmlParser, translations: String) = this()
    def this(_htmlParser: HtmlParser, translations: String, translationsFormat: String) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
  }
  
  @js.native
  class MessageBundle protected ()
    extends typingsSlinky.atAngularCompiler.srcI18nMessageUnderscoreBundleMod.MessageBundle {
    def this(
      _htmlParser: HtmlParser,
      _implicitTags: js.Array[String],
      _implicitAttrs: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      _implicitTags: js.Array[String],
      _implicitAttrs: StringDictionary[js.Array[String]],
      _locale: String
    ) = this()
  }
  
  @js.native
  abstract class Serializer ()
    extends typingsSlinky.atAngularCompiler.srcI18nSerializersSerializerMod.Serializer
  
  @js.native
  class Xliff ()
    extends typingsSlinky.atAngularCompiler.srcI18nSerializersXliffMod.Xliff
  
  @js.native
  class Xliff2 ()
    extends typingsSlinky.atAngularCompiler.srcI18nSerializersXliff2Mod.Xliff2
  
  @js.native
  class Xmb ()
    extends typingsSlinky.atAngularCompiler.srcI18nSerializersXmbMod.Xmb
  
  @js.native
  class Xtb ()
    extends typingsSlinky.atAngularCompiler.srcI18nSerializersXtbMod.Xtb
  
  /* static members */
  @js.native
  object Extractor extends js.Object {
    def create(host: ExtractorHost): Anon_Extractor = js.native
    def create(host: ExtractorHost, locale: String): Anon_Extractor = js.native
  }
  
}

