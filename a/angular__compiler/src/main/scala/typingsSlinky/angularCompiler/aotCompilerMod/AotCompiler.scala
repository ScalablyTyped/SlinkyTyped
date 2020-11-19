package typingsSlinky.angularCompiler.aotCompilerMod

import typingsSlinky.angularCompiler.abstractEmitterMod.OutputEmitter
import typingsSlinky.angularCompiler.anon.AnalyzedInjectables
import typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost
import typingsSlinky.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typingsSlinky.angularCompiler.configMod.CompilerConfig
import typingsSlinky.angularCompiler.generatedFileMod.GeneratedFile
import typingsSlinky.angularCompiler.injectableCompilerMod.InjectableCompiler
import typingsSlinky.angularCompiler.lazyRoutesMod.LazyRoute
import typingsSlinky.angularCompiler.messageBundleMod.MessageBundle
import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.ngModuleCompilerMod.NgModuleCompiler
import typingsSlinky.angularCompiler.partialModuleMod.PartialModule
import typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import typingsSlinky.angularCompiler.styleCompilerMod.StyleCompiler
import typingsSlinky.angularCompiler.templateParserMod.TemplateParser
import typingsSlinky.angularCompiler.typeCheckCompilerMod.TypeCheckCompiler
import typingsSlinky.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/compiler", "AotCompiler")
@js.native
class AotCompiler protected () extends js.Object {
  def this(
    _config: CompilerConfig,
    _options: AotCompilerOptions,
    _host: AotCompilerHost,
    reflector: StaticReflector,
    _metadataResolver: CompileMetadataResolver,
    _templateParser: TemplateParser,
    _styleCompiler: StyleCompiler,
    _viewCompiler: ViewCompiler,
    _typeCheckCompiler: TypeCheckCompiler,
    _ngModuleCompiler: NgModuleCompiler,
    _injectableCompiler: InjectableCompiler,
    _outputEmitter: OutputEmitter,
    _summaryResolver: SummaryResolver[StaticSymbol],
    _symbolResolver: StaticSymbolResolver
  ) = this()
  
  var _analyzeFile: js.Any = js.native
  
  var _analyzeFileForInjectables: js.Any = js.native
  
  var _analyzedFiles: js.Any = js.native
  
  var _analyzedFilesForInjectables: js.Any = js.native
  
  var _codegenSourceModule: js.Any = js.native
  
  var _codegenStyles: js.Any = js.native
  
  var _compileComponent: js.Any = js.native
  
  var _compileComponentFactory: js.Any = js.native
  
  var _compileImplFile: js.Any = js.native
  
  var _compileModule: js.Any = js.native
  
  var _compilePartialModule: js.Any = js.native
  
  var _compileShallowModules: js.Any = js.native
  
  var _config: js.Any = js.native
  
  var _createNgFactoryStub: js.Any = js.native
  
  var _createOutputContext: js.Any = js.native
  
  var _createSummary: js.Any = js.native
  
  var _createTypeCheckBlock: js.Any = js.native
  
  var _emitPartialModule2: js.Any = js.native
  
  var _externalIdentifierReferences: js.Any = js.native
  
  var _fileNameToModuleName: js.Any = js.native
  
  var _host: js.Any = js.native
  
  var _injectableCompiler: js.Any = js.native
  
  var _metadataResolver: js.Any = js.native
  
  var _ngModuleCompiler: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _outputEmitter: js.Any = js.native
  
  var _parseTemplate: js.Any = js.native
  
  var _styleCompiler: js.Any = js.native
  
  var _summaryResolver: js.Any = js.native
  
  var _symbolResolver: js.Any = js.native
  
  var _templateAstCache: js.Any = js.native
  
  var _templateParser: js.Any = js.native
  
  var _typeCheckCompiler: js.Any = js.native
  
  var _viewCompiler: js.Any = js.native
  
  def analyzeModulesAsync(rootFiles: js.Array[String]): js.Promise[NgAnalyzedModules] = js.native
  
  def analyzeModulesSync(rootFiles: js.Array[String]): NgAnalyzedModules = js.native
  
  def clearCache(): Unit = js.native
  
  def emitAllImpls(analyzeResult: NgAnalyzedModules): js.Array[GeneratedFile] = js.native
  
  def emitAllPartialModules(
    hasNgModuleByPipeOrDirectiveFiles: NgAnalyzedModules,
    r3Files: js.Array[NgAnalyzedFileWithInjectables]
  ): js.Array[PartialModule] = js.native
  
  def emitAllPartialModules2(files: js.Array[NgAnalyzedFileWithInjectables]): js.Array[PartialModule] = js.native
  
  def emitBasicStub(genFileName: String): GeneratedFile = js.native
  def emitBasicStub(genFileName: String, originalFileName: String): GeneratedFile = js.native
  
  def emitMessageBundle(analyzeResult: NgAnalyzedModules): MessageBundle = js.native
  def emitMessageBundle(analyzeResult: NgAnalyzedModules, locale: String): MessageBundle = js.native
  
  def emitTypeCheckStub(genFileName: String, originalFileName: String): GeneratedFile | Null = js.native
  
  def findGeneratedFileNames(fileName: String): js.Array[String] = js.native
  
  def listLazyRoutes(): js.Array[LazyRoute] = js.native
  def listLazyRoutes(entryRoute: js.UndefOr[scala.Nothing], analyzedModules: NgAnalyzedModules): js.Array[LazyRoute] = js.native
  def listLazyRoutes(entryRoute: String): js.Array[LazyRoute] = js.native
  def listLazyRoutes(entryRoute: String, analyzedModules: NgAnalyzedModules): js.Array[LazyRoute] = js.native
  
  def loadFilesAsync(fileNames: js.Array[String], tsFiles: js.Array[String]): js.Promise[AnalyzedInjectables] = js.native
  
  def loadFilesSync(fileNames: js.Array[String], tsFiles: js.Array[String]): AnalyzedInjectables = js.native
  
  val reflector: StaticReflector = js.native
}
