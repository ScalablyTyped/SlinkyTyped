package typingsSlinky.angularCompiler.jitCompilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.configMod.CompilerConfig
import typingsSlinky.angularCompiler.coreMod.Type
import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.ngModuleCompilerMod.NgModuleCompiler
import typingsSlinky.angularCompiler.outputJitMod.JitEvaluator
import typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typingsSlinky.angularCompiler.srcUtilMod.Console
import typingsSlinky.angularCompiler.styleCompilerMod.StyleCompiler
import typingsSlinky.angularCompiler.templateParserMod.TemplateParser
import typingsSlinky.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/jit/compiler", "JitCompiler")
@js.native
class JitCompiler protected () extends js.Object {
  def this(
    _metadataResolver: CompileMetadataResolver,
    _templateParser: TemplateParser,
    _styleCompiler: StyleCompiler,
    _viewCompiler: ViewCompiler,
    _ngModuleCompiler: NgModuleCompiler,
    _summaryResolver: SummaryResolver[Type],
    _reflector: CompileReflector,
    _jitEvaluator: JitEvaluator,
    _compilerConfig: CompilerConfig,
    _console: Console,
    getExtraNgModuleProviders: js.Function1[/* ngModule */ js.Any, js.Array[CompileProviderMetadata]]
  ) = this()
  
  var _addAotSummaries: js.Any = js.native
  
  var _addedAotSummaries: js.Any = js.native
  
  var _compileModule: js.Any = js.native
  
  var _compileModuleAndAllComponents: js.Any = js.native
  
  var _compileModuleAndComponents: js.Any = js.native
  
  var _compileTemplate: js.Any = js.native
  
  var _compiledDirectiveWrapperCache: js.Any = js.native
  
  var _compiledHostTemplateCache: js.Any = js.native
  
  var _compiledNgModuleCache: js.Any = js.native
  
  var _compiledTemplateCache: js.Any = js.native
  
  var _compilerConfig: js.Any = js.native
  
  var _console: js.Any = js.native
  
  var _createCompiledHostTemplate: js.Any = js.native
  
  var _createCompiledTemplate: js.Any = js.native
  
  var _filterJitIdentifiers: js.Any = js.native
  
  var _interpretOrJit: js.Any = js.native
  
  var _jitEvaluator: js.Any = js.native
  
  var _loadModules: js.Any = js.native
  
  var _metadataResolver: js.Any = js.native
  
  var _ngModuleCompiler: js.Any = js.native
  
  var _parseTemplate: js.Any = js.native
  
  var _reflector: js.Any = js.native
  
  var _resolveAndEvalStylesCompileResult: js.Any = js.native
  
  var _resolveStylesCompileResult: js.Any = js.native
  
  var _sharedStylesheetCount: js.Any = js.native
  
  var _styleCompiler: js.Any = js.native
  
  var _summaryResolver: js.Any = js.native
  
  var _templateParser: js.Any = js.native
  
  var _viewCompiler: js.Any = js.native
  
  def clearCache(): Unit = js.native
  
  def clearCacheFor(`type`: Type): Unit = js.native
  
  def compileModuleAndAllComponentsAsync(moduleType: Type): js.Promise[ModuleWithComponentFactories] = js.native
  
  def compileModuleAndAllComponentsSync(moduleType: Type): ModuleWithComponentFactories = js.native
  
  def compileModuleAsync(moduleType: Type): js.Promise[js.Object] = js.native
  
  def compileModuleSync(moduleType: Type): js.Object = js.native
  
  def getComponentFactory(component: Type): js.Object = js.native
  
  var getExtraNgModuleProviders: js.Any = js.native
  
  def hasAotSummary(ref: Type): Boolean = js.native
  
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
}
