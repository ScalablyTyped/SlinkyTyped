package typingsSlinky.atAngularCompiler.srcDirectiveUnderscoreNormalizerMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata
import typingsSlinky.atAngularCompiler.srcConfigMod.CompilerConfig
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser
import typingsSlinky.atAngularCompiler.srcResourceUnderscoreLoaderMod.ResourceLoader
import typingsSlinky.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver
import typingsSlinky.atAngularCompiler.srcUtilMod.SyncAsync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/directive_normalizer", "DirectiveNormalizer")
@js.native
class DirectiveNormalizer protected () extends js.Object {
  def this(
    _resourceLoader: ResourceLoader,
    _urlResolver: UrlResolver,
    _htmlParser: HtmlParser,
    _config: CompilerConfig
  ) = this()
  var _config: js.Any = js.native
  var _fetch: js.Any = js.native
  var _htmlParser: js.Any = js.native
  var _inlineStyles: js.Any = js.native
  var _loadMissingExternalStylesheets: js.Any = js.native
  var _normalizeLoadedTemplateMetadata: js.Any = js.native
  var _normalizeStylesheet: js.Any = js.native
  var _normalizeTemplateMetadata: js.Any = js.native
  var _preParseTemplate: js.Any = js.native
  var _preparseLoadedTemplate: js.Any = js.native
  var _resourceLoader: js.Any = js.native
  var _resourceLoaderCache: js.Any = js.native
  var _urlResolver: js.Any = js.native
  def clearCache(): Unit = js.native
  def clearCacheFor(normalizedDirective: CompileDirectiveMetadata): Unit = js.native
  def normalizeTemplate(prenormData: PrenormalizedTemplateMetadata): SyncAsync[CompileTemplateMetadata] = js.native
}

