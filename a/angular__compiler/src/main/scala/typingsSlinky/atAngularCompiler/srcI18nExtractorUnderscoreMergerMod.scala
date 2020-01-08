package typingsSlinky.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsSlinky.atAngularCompiler.srcI18nParseUnderscoreUtilMod.I18nError
import typingsSlinky.atAngularCompiler.srcI18nTranslationUnderscoreBundleMod.TranslationBundle
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/extractor_merger", JSImport.Namespace)
@js.native
object srcI18nExtractorUnderscoreMergerMod extends js.Object {
  @js.native
  class ExtractionResult protected () extends js.Object {
    def this(messages: js.Array[Message], errors: js.Array[I18nError]) = this()
    var errors: js.Array[I18nError] = js.native
    var messages: js.Array[Message] = js.native
  }
  
  def extractMessages(
    nodes: js.Array[Node],
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ExtractionResult = js.native
  def mergeTranslations(
    nodes: js.Array[Node],
    translations: TranslationBundle,
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ParseTreeResult = js.native
}

