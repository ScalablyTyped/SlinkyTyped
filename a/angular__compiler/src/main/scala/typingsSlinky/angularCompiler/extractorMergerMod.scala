package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig
import typingsSlinky.angularCompiler.mlParserAstMod.Node
import typingsSlinky.angularCompiler.mlParserParserMod.ParseTreeResult
import typingsSlinky.angularCompiler.parseUtilMod.I18nError
import typingsSlinky.angularCompiler.translationBundleMod.TranslationBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/i18n/extractor_merger", JSImport.Namespace)
@js.native
object extractorMergerMod extends js.Object {
  
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
  
  @js.native
  class ExtractionResult protected () extends js.Object {
    def this(messages: js.Array[Message], errors: js.Array[I18nError]) = this()
    
    var errors: js.Array[I18nError] = js.native
    
    var messages: js.Array[Message] = js.native
  }
}
