package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import typingsSlinky.angularCompiler.anon.InstantiableResourceLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
  var ResourceLoader: InstantiableResourceLoader
  def compileBase(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3BaseMetadataFacade): js.Any
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any
  def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan
}

object CompilerFacade {
  @scala.inline
  def apply(
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    ResourceLoader: InstantiableResourceLoader,
    compileBase: (CoreEnvironment, String, R3BaseMetadataFacade) => js.Any,
    compileComponent: (CoreEnvironment, String, R3ComponentMetadataFacade) => js.Any,
    compileDirective: (CoreEnvironment, String, R3DirectiveMetadataFacade) => js.Any,
    compileInjectable: (CoreEnvironment, String, R3InjectableMetadataFacade) => js.Any,
    compileInjector: (CoreEnvironment, String, R3InjectorMetadataFacade) => js.Any,
    compileNgModule: (CoreEnvironment, String, R3NgModuleMetadataFacade) => js.Any,
    compilePipe: (CoreEnvironment, String, R3PipeMetadataFacade) => js.Any,
    createParseSourceSpan: (String, String, String) => ParseSourceSpan
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3ResolvedDependencyType = R3ResolvedDependencyType.asInstanceOf[js.Any], ResourceLoader = ResourceLoader.asInstanceOf[js.Any], compileBase = js.Any.fromFunction3(compileBase), compileComponent = js.Any.fromFunction3(compileComponent), compileDirective = js.Any.fromFunction3(compileDirective), compileInjectable = js.Any.fromFunction3(compileInjectable), compileInjector = js.Any.fromFunction3(compileInjector), compileNgModule = js.Any.fromFunction3(compileNgModule), compilePipe = js.Any.fromFunction3(compilePipe), createParseSourceSpan = js.Any.fromFunction3(createParseSourceSpan))
    __obj.asInstanceOf[CompilerFacade]
  }
  @scala.inline
  implicit class CompilerFacadeOps[Self <: CompilerFacade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setR3ResolvedDependencyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
    ): Self = this.set("R3ResolvedDependencyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceLoader(value: InstantiableResourceLoader): Self = this.set("ResourceLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompileBase(value: (CoreEnvironment, String, R3BaseMetadataFacade) => js.Any): Self = this.set("compileBase", js.Any.fromFunction3(value))
    @scala.inline
    def setCompileComponent(value: (CoreEnvironment, String, R3ComponentMetadataFacade) => js.Any): Self = this.set("compileComponent", js.Any.fromFunction3(value))
    @scala.inline
    def setCompileDirective(value: (CoreEnvironment, String, R3DirectiveMetadataFacade) => js.Any): Self = this.set("compileDirective", js.Any.fromFunction3(value))
    @scala.inline
    def setCompileInjectable(value: (CoreEnvironment, String, R3InjectableMetadataFacade) => js.Any): Self = this.set("compileInjectable", js.Any.fromFunction3(value))
    @scala.inline
    def setCompileInjector(value: (CoreEnvironment, String, R3InjectorMetadataFacade) => js.Any): Self = this.set("compileInjector", js.Any.fromFunction3(value))
    @scala.inline
    def setCompileNgModule(value: (CoreEnvironment, String, R3NgModuleMetadataFacade) => js.Any): Self = this.set("compileNgModule", js.Any.fromFunction3(value))
    @scala.inline
    def setCompilePipe(value: (CoreEnvironment, String, R3PipeMetadataFacade) => js.Any): Self = this.set("compilePipe", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateParseSourceSpan(value: (String, String, String) => ParseSourceSpan): Self = this.set("createParseSourceSpan", js.Any.fromFunction3(value))
  }
  
}

