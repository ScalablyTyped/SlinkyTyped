package typingsSlinky.angularCompiler.directiveNormalizerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTemplateMetadata
import typingsSlinky.angularCompiler.configMod.CompilerConfig
import typingsSlinky.angularCompiler.htmlParserMod.HtmlParser
import typingsSlinky.angularCompiler.resourceLoaderMod.ResourceLoader
import typingsSlinky.angularCompiler.srcUtilMod.SyncAsync
import typingsSlinky.angularCompiler.urlResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
