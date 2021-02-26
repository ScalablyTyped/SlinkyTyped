package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.abstractEmitterMod.OutputEmitter
import typingsSlinky.angularCompiler.anon.AnalyzedInjectables
import typingsSlinky.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
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
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aotCompilerMod {
  
  @JSImport("@angular/compiler/src/aot/compiler", "AotCompiler")
  @js.native
  class AotCompiler protected () extends StObject {
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
  
  @JSImport("@angular/compiler/src/aot/compiler", "analyzeAndValidateNgModules")
  @js.native
  def analyzeAndValidateNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  
  @JSImport("@angular/compiler/src/aot/compiler", "analyzeFile")
  @js.native
  def analyzeFile(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
  
  @JSImport("@angular/compiler/src/aot/compiler", "analyzeFileForInjectables")
  @js.native
  def analyzeFileForInjectables(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFileWithInjectables = js.native
  
  @JSImport("@angular/compiler/src/aot/compiler", "analyzeNgModules")
  @js.native
  def analyzeNgModules(
    fileNames: js.Array[String],
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver
  ): NgAnalyzedModules = js.native
  
  @JSImport("@angular/compiler/src/aot/compiler", "mergeAnalyzedFiles")
  @js.native
  def mergeAnalyzedFiles(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
  
  @js.native
  trait NgAnalyzeModulesHost extends StObject {
    
    def isSourceFile(filePath: String): Boolean = js.native
  }
  object NgAnalyzeModulesHost {
    
    @scala.inline
    def apply(isSourceFile: String => Boolean): NgAnalyzeModulesHost = {
      val __obj = js.Dynamic.literal(isSourceFile = js.Any.fromFunction1(isSourceFile))
      __obj.asInstanceOf[NgAnalyzeModulesHost]
    }
    
    @scala.inline
    implicit class NgAnalyzeModulesHostMutableBuilder[Self <: NgAnalyzeModulesHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSourceFile(value: String => Boolean): Self = StObject.set(x, "isSourceFile", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NgAnalyzedFile extends StObject {
    
    var abstractDirectives: js.Array[StaticSymbol] = js.native
    
    var directives: js.Array[StaticSymbol] = js.native
    
    var exportsNonSourceFiles: Boolean = js.native
    
    var fileName: String = js.native
    
    var injectables: js.Array[CompileInjectableMetadata] = js.native
    
    var ngModules: js.Array[CompileNgModuleMetadata] = js.native
    
    var pipes: js.Array[StaticSymbol] = js.native
  }
  object NgAnalyzedFile {
    
    @scala.inline
    def apply(
      abstractDirectives: js.Array[StaticSymbol],
      directives: js.Array[StaticSymbol],
      exportsNonSourceFiles: Boolean,
      fileName: String,
      injectables: js.Array[CompileInjectableMetadata],
      ngModules: js.Array[CompileNgModuleMetadata],
      pipes: js.Array[StaticSymbol]
    ): NgAnalyzedFile = {
      val __obj = js.Dynamic.literal(abstractDirectives = abstractDirectives.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], exportsNonSourceFiles = exportsNonSourceFiles.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgAnalyzedFile]
    }
    
    @scala.inline
    implicit class NgAnalyzedFileMutableBuilder[Self <: NgAnalyzedFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbstractDirectives(value: js.Array[StaticSymbol]): Self = StObject.set(x, "abstractDirectives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbstractDirectivesVarargs(value: StaticSymbol*): Self = StObject.set(x, "abstractDirectives", js.Array(value :_*))
      
      @scala.inline
      def setDirectives(value: js.Array[StaticSymbol]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesVarargs(value: StaticSymbol*): Self = StObject.set(x, "directives", js.Array(value :_*))
      
      @scala.inline
      def setExportsNonSourceFiles(value: Boolean): Self = StObject.set(x, "exportsNonSourceFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectables(value: js.Array[CompileInjectableMetadata]): Self = StObject.set(x, "injectables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectablesVarargs(value: CompileInjectableMetadata*): Self = StObject.set(x, "injectables", js.Array(value :_*))
      
      @scala.inline
      def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = StObject.set(x, "ngModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgModulesVarargs(value: CompileNgModuleMetadata*): Self = StObject.set(x, "ngModules", js.Array(value :_*))
      
      @scala.inline
      def setPipes(value: js.Array[StaticSymbol]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipesVarargs(value: StaticSymbol*): Self = StObject.set(x, "pipes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NgAnalyzedFileWithInjectables extends StObject {
    
    var fileName: String = js.native
    
    var injectables: js.Array[CompileInjectableMetadata] = js.native
    
    var shallowModules: js.Array[CompileShallowModuleMetadata] = js.native
  }
  object NgAnalyzedFileWithInjectables {
    
    @scala.inline
    def apply(
      fileName: String,
      injectables: js.Array[CompileInjectableMetadata],
      shallowModules: js.Array[CompileShallowModuleMetadata]
    ): NgAnalyzedFileWithInjectables = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], shallowModules = shallowModules.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgAnalyzedFileWithInjectables]
    }
    
    @scala.inline
    implicit class NgAnalyzedFileWithInjectablesMutableBuilder[Self <: NgAnalyzedFileWithInjectables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectables(value: js.Array[CompileInjectableMetadata]): Self = StObject.set(x, "injectables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectablesVarargs(value: CompileInjectableMetadata*): Self = StObject.set(x, "injectables", js.Array(value :_*))
      
      @scala.inline
      def setShallowModules(value: js.Array[CompileShallowModuleMetadata]): Self = StObject.set(x, "shallowModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShallowModulesVarargs(value: CompileShallowModuleMetadata*): Self = StObject.set(x, "shallowModules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NgAnalyzedModules extends StObject {
    
    var files: js.Array[NgAnalyzedFile] = js.native
    
    var ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata] = js.native
    
    var ngModules: js.Array[CompileNgModuleMetadata] = js.native
    
    var symbolsMissingModule: js.UndefOr[js.Array[StaticSymbol]] = js.native
  }
  object NgAnalyzedModules {
    
    @scala.inline
    def apply(
      files: js.Array[NgAnalyzedFile],
      ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata],
      ngModules: js.Array[CompileNgModuleMetadata]
    ): NgAnalyzedModules = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], ngModuleByPipeOrDirective = ngModuleByPipeOrDirective.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgAnalyzedModules]
    }
    
    @scala.inline
    implicit class NgAnalyzedModulesMutableBuilder[Self <: NgAnalyzedModules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[NgAnalyzedFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: NgAnalyzedFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setNgModuleByPipeOrDirective(value: Map[StaticSymbol, CompileNgModuleMetadata]): Self = StObject.set(x, "ngModuleByPipeOrDirective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = StObject.set(x, "ngModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgModulesVarargs(value: CompileNgModuleMetadata*): Self = StObject.set(x, "ngModules", js.Array(value :_*))
      
      @scala.inline
      def setSymbolsMissingModule(value: js.Array[StaticSymbol]): Self = StObject.set(x, "symbolsMissingModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsMissingModuleUndefined: Self = StObject.set(x, "symbolsMissingModule", js.undefined)
      
      @scala.inline
      def setSymbolsMissingModuleVarargs(value: StaticSymbol*): Self = StObject.set(x, "symbolsMissingModule", js.Array(value :_*))
    }
  }
}
