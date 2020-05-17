package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import typingsSlinky.angularCompiler.anon.InstantiableResourceLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any = js.native
  var ResourceLoader: InstantiableResourceLoader = js.native
  def compileBase(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3BaseMetadataFacade): js.Any = js.native
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any = js.native
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any = js.native
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any = js.native
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any = js.native
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any = js.native
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any = js.native
  def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
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
    def withR3ResolvedDependencyType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R3ResolvedDependencyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceLoader(value: InstantiableResourceLoader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompileBase(value: (CoreEnvironment, String, R3BaseMetadataFacade) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileBase")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompileComponent(value: (CoreEnvironment, String, R3ComponentMetadataFacade) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileComponent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompileDirective(value: (CoreEnvironment, String, R3DirectiveMetadataFacade) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileDirective")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompileInjectable(value: (CoreEnvironment, String, R3InjectableMetadataFacade) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileInjectable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompileInjector(value: (CoreEnvironment, String, R3InjectorMetadataFacade) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileInjector")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompileNgModule(value: (CoreEnvironment, String, R3NgModuleMetadataFacade) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileNgModule")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompilePipe(value: (CoreEnvironment, String, R3PipeMetadataFacade) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilePipe")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateParseSourceSpan(value: (String, String, String) => ParseSourceSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParseSourceSpan")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

