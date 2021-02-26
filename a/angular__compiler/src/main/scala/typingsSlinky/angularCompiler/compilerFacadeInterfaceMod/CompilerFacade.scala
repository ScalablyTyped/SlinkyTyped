package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import typingsSlinky.angularCompiler.anon.InstantiableResourceLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerFacade extends StObject {
  
  var R3FactoryTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3FactoryTarget */ js.Any = js.native
  
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any = js.native
  
  var ResourceLoader: InstantiableResourceLoader = js.native
  
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any = js.native
  
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any = js.native
  
  def compileFactory(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3FactoryDefMetadataFacade): js.Any = js.native
  
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any = js.native
  
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any = js.native
  
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any = js.native
  
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any = js.native
  
  def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
}
object CompilerFacade {
  
  @scala.inline
  def apply(
    R3FactoryTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3FactoryTarget */ js.Any,
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    ResourceLoader: InstantiableResourceLoader,
    compileComponent: (CoreEnvironment, String, R3ComponentMetadataFacade) => js.Any,
    compileDirective: (CoreEnvironment, String, R3DirectiveMetadataFacade) => js.Any,
    compileFactory: (CoreEnvironment, String, R3FactoryDefMetadataFacade) => js.Any,
    compileInjectable: (CoreEnvironment, String, R3InjectableMetadataFacade) => js.Any,
    compileInjector: (CoreEnvironment, String, R3InjectorMetadataFacade) => js.Any,
    compileNgModule: (CoreEnvironment, String, R3NgModuleMetadataFacade) => js.Any,
    compilePipe: (CoreEnvironment, String, R3PipeMetadataFacade) => js.Any,
    createParseSourceSpan: (String, String, String) => ParseSourceSpan
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3FactoryTarget = R3FactoryTarget.asInstanceOf[js.Any], R3ResolvedDependencyType = R3ResolvedDependencyType.asInstanceOf[js.Any], ResourceLoader = ResourceLoader.asInstanceOf[js.Any], compileComponent = js.Any.fromFunction3(compileComponent), compileDirective = js.Any.fromFunction3(compileDirective), compileFactory = js.Any.fromFunction3(compileFactory), compileInjectable = js.Any.fromFunction3(compileInjectable), compileInjector = js.Any.fromFunction3(compileInjector), compileNgModule = js.Any.fromFunction3(compileNgModule), compilePipe = js.Any.fromFunction3(compilePipe), createParseSourceSpan = js.Any.fromFunction3(createParseSourceSpan))
    __obj.asInstanceOf[CompilerFacade]
  }
  
  @scala.inline
  implicit class CompilerFacadeMutableBuilder[Self <: CompilerFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompileComponent(value: (CoreEnvironment, String, R3ComponentMetadataFacade) => js.Any): Self = StObject.set(x, "compileComponent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompileDirective(value: (CoreEnvironment, String, R3DirectiveMetadataFacade) => js.Any): Self = StObject.set(x, "compileDirective", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompileFactory(value: (CoreEnvironment, String, R3FactoryDefMetadataFacade) => js.Any): Self = StObject.set(x, "compileFactory", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompileInjectable(value: (CoreEnvironment, String, R3InjectableMetadataFacade) => js.Any): Self = StObject.set(x, "compileInjectable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompileInjector(value: (CoreEnvironment, String, R3InjectorMetadataFacade) => js.Any): Self = StObject.set(x, "compileInjector", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompileNgModule(value: (CoreEnvironment, String, R3NgModuleMetadataFacade) => js.Any): Self = StObject.set(x, "compileNgModule", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompilePipe(value: (CoreEnvironment, String, R3PipeMetadataFacade) => js.Any): Self = StObject.set(x, "compilePipe", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateParseSourceSpan(value: (String, String, String) => ParseSourceSpan): Self = StObject.set(x, "createParseSourceSpan", js.Any.fromFunction3(value))
    
    @scala.inline
    def setR3FactoryTarget(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3FactoryTarget */ js.Any
    ): Self = StObject.set(x, "R3FactoryTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR3ResolvedDependencyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
    ): Self = StObject.set(x, "R3ResolvedDependencyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLoader(value: InstantiableResourceLoader): Self = StObject.set(x, "ResourceLoader", value.asInstanceOf[js.Any])
  }
}
