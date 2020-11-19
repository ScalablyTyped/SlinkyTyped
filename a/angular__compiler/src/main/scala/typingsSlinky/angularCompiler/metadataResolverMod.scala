package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.Annotation
import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typingsSlinky.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleSummary
import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeSummary
import typingsSlinky.angularCompiler.compileMetadataMod.ProviderMeta
import typingsSlinky.angularCompiler.compileMetadataMod.ProxyClass
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.configMod.CompilerConfig
import typingsSlinky.angularCompiler.coreMod.Type
import typingsSlinky.angularCompiler.directiveNormalizerMod.DirectiveNormalizer
import typingsSlinky.angularCompiler.directiveResolverMod.DirectiveResolver
import typingsSlinky.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry
import typingsSlinky.angularCompiler.htmlParserMod.HtmlParser
import typingsSlinky.angularCompiler.ngModuleResolverMod.NgModuleResolver
import typingsSlinky.angularCompiler.pipeResolverMod.PipeResolver
import typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typingsSlinky.angularCompiler.srcUtilMod.Console
import typingsSlinky.angularCompiler.srcUtilMod.SyncAsync
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbolCache
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/metadata_resolver", JSImport.Namespace)
@js.native
object metadataResolverMod extends js.Object {
  
  val ERROR_COMPONENT_TYPE: /* "ngComponentType" */ String = js.native
  
  @js.native
  class CompileMetadataResolver protected () extends js.Object {
    def this(
      _config: CompilerConfig,
      _htmlParser: HtmlParser,
      _ngModuleResolver: NgModuleResolver,
      _directiveResolver: DirectiveResolver,
      _pipeResolver: PipeResolver,
      _summaryResolver: SummaryResolver[_],
      _schemaRegistry: ElementSchemaRegistry,
      _directiveNormalizer: DirectiveNormalizer,
      _console: Console,
      _staticSymbolCache: StaticSymbolCache,
      _reflector: CompileReflector
    ) = this()
    def this(
      _config: CompilerConfig,
      _htmlParser: HtmlParser,
      _ngModuleResolver: NgModuleResolver,
      _directiveResolver: DirectiveResolver,
      _pipeResolver: PipeResolver,
      _summaryResolver: SummaryResolver[_],
      _schemaRegistry: ElementSchemaRegistry,
      _directiveNormalizer: DirectiveNormalizer,
      _console: Console,
      _staticSymbolCache: StaticSymbolCache,
      _reflector: CompileReflector,
      _errorCollector: ErrorCollector
    ) = this()
    
    var _addTypeToModule: js.Any = js.native
    
    var _checkSelfImport: js.Any = js.native
    
    var _config: js.Any = js.native
    
    var _console: js.Any = js.native
    
    var _createProxyClass: js.Any = js.native
    
    var _directiveCache: js.Any = js.native
    
    var _directiveNormalizer: js.Any = js.native
    
    var _directiveResolver: js.Any = js.native
    
    var _errorCollector: js.Any = js.native
    
    var _getDependenciesMetadata: js.Any = js.native
    
    var _getEntryComponentMetadata: js.Any = js.native
    
    var _getEntryComponentsFromProvider: js.Any = js.native
    
    var _getFactoryMetadata: js.Any = js.native
    
    var _getIdentifierMetadata: js.Any = js.native
    
    var _getInjectableTypeMetadata: js.Any = js.native
    
    var _getProvidersMetadata: js.Any = js.native
    
    var _getQueriesMetadata: js.Any = js.native
    
    var _getQueryMetadata: js.Any = js.native
    
    var _getTokenMetadata: js.Any = js.native
    
    var _getTransitiveNgModuleMetadata: js.Any = js.native
    
    var _getTypeDescriptor: js.Any = js.native
    
    var _getTypeMetadata: js.Any = js.native
    
    var _htmlParser: js.Any = js.native
    
    var _loadPipeMetadata: js.Any = js.native
    
    var _loadSummary: js.Any = js.native
    
    var _ngModuleCache: js.Any = js.native
    
    var _ngModuleOfTypes: js.Any = js.native
    
    var _ngModuleResolver: js.Any = js.native
    
    var _nonNormalizedDirectiveCache: js.Any = js.native
    
    var _pipeCache: js.Any = js.native
    
    var _pipeResolver: js.Any = js.native
    
    var _queryVarBindings: js.Any = js.native
    
    var _reflector: js.Any = js.native
    
    var _reportError: js.Any = js.native
    
    var _schemaRegistry: js.Any = js.native
    
    var _shallowModuleCache: js.Any = js.native
    
    var _staticSymbolCache: js.Any = js.native
    
    var _summaryCache: js.Any = js.native
    
    var _summaryResolver: js.Any = js.native
    
    var _validateProvider: js.Any = js.native
    
    def clearCache(): Unit = js.native
    
    def clearCacheFor(`type`: Type): Unit = js.native
    
    var getComponentFactory: js.Any = js.native
    
    var getComponentViewClass: js.Any = js.native
    
    /**
      * Gets the metadata for the given directive.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
      */
    def getDirectiveMetadata(directiveType: js.Any): CompileDirectiveMetadata = js.native
    
    def getDirectiveSummary(dirType: js.Any): CompileDirectiveSummary = js.native
    
    var getGeneratedClass: js.Any = js.native
    
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata): CompileDirectiveMetadata = js.native
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata, hostViewType: ProxyClass): CompileDirectiveMetadata = js.native
    def getHostComponentMetadata(compMeta: CompileDirectiveMetadata, hostViewType: StaticSymbol): CompileDirectiveMetadata = js.native
    
    def getHostComponentType(dirType: js.Any): StaticSymbol | ProxyClass = js.native
    
    def getHostComponentViewClass(dirType: js.Any): StaticSymbol | ProxyClass = js.native
    
    def getInjectableMetadata(`type`: js.Any): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: js.UndefOr[scala.Nothing], throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[_]): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: js.Array[_], throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    def getInjectableMetadata(`type`: js.Any, dependencies: Null, throwOnUnknownDeps: Boolean): CompileInjectableMetadata | Null = js.native
    
    def getInjectableSummary(`type`: js.Any): CompileTypeSummary = js.native
    
    def getNgModuleMetadata(moduleType: js.Any): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: js.UndefOr[scala.Nothing], alreadyCollecting: Set[_]): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: Boolean): CompileNgModuleMetadata | Null = js.native
    def getNgModuleMetadata(moduleType: js.Any, throwIfNotFound: Boolean, alreadyCollecting: Set[_]): CompileNgModuleMetadata | Null = js.native
    
    def getNgModuleSummary(moduleType: js.Any): CompileNgModuleSummary | Null = js.native
    def getNgModuleSummary(moduleType: js.Any, alreadyCollecting: Set[_]): CompileNgModuleSummary | Null = js.native
    
    def getNonNormalizedDirectiveMetadata(directiveType: js.Any): Annotation | Null = js.native
    
    def getOrLoadPipeMetadata(pipeType: js.Any): CompilePipeMetadata = js.native
    
    /**
      * Gets the metadata for the given pipe.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
      */
    def getPipeMetadata(pipeType: js.Any): CompilePipeMetadata | Null = js.native
    
    def getPipeSummary(pipeType: js.Any): CompilePipeSummary = js.native
    
    def getProviderMetadata(provider: ProviderMeta): CompileProviderMetadata = js.native
    
    def getReflector(): CompileReflector = js.native
    
    var getRendererType: js.Any = js.native
    
    def getShallowModuleMetadata(moduleType: js.Any): CompileShallowModuleMetadata | Null = js.native
    
    var initComponentFactory: js.Any = js.native
    
    def isAbstractDirective(`type`: js.Any): Boolean = js.native
    
    def isDirective(`type`: js.Any): Boolean = js.native
    
    def isInjectable(`type`: js.Any): Boolean = js.native
    
    def isNgModule(`type`: js.Any): Boolean = js.native
    
    def isPipe(`type`: js.Any): Boolean = js.native
    
    def loadDirectiveMetadata(ngModuleType: js.Any, directiveType: js.Any, isSync: Boolean): SyncAsync[Null] = js.native
    
    /**
      * Loads the declared directives and pipes of an NgModule.
      */
    def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: Boolean): js.Promise[_] = js.native
    def loadNgModuleDirectiveAndPipeMetadata(moduleType: js.Any, isSync: Boolean, throwIfNotFound: Boolean): js.Promise[_] = js.native
  }
  
  type ErrorCollector = js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
}
