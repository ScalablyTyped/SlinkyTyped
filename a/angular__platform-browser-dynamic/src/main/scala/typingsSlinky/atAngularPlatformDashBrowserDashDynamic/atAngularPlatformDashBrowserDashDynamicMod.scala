package typingsSlinky.atAngularPlatformDashBrowserDashDynamic

import typingsSlinky.atAngularCompiler.atAngularCompilerMod.CompileMetadataResolver
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.CompileReflector
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.CompilerConfig
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.JitEvaluator
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.NgModuleCompiler
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.StyleCompiler
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.SummaryResolver
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.TemplateParser
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.ViewCompiler
import typingsSlinky.atAngularCompiler.srcResourceUnderscoreLoaderMod.ResourceLoader
import typingsSlinky.atAngularCore.atAngularCoreMod.Compiler
import typingsSlinky.atAngularCore.atAngularCoreMod.CompilerFactory
import typingsSlinky.atAngularCore.atAngularCoreMod.ComponentFactory
import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atAngularCore.atAngularCoreMod.PlatformRef
import typingsSlinky.atAngularCore.atAngularCoreMod.Provider
import typingsSlinky.atAngularCore.atAngularCoreMod.StaticProvider
import typingsSlinky.atAngularCore.atAngularCoreMod.Type
import typingsSlinky.atAngularCore.atAngularCoreMod.Version
import typingsSlinky.atAngularCore.atAngularCoreMod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic", JSImport.Namespace)
@js.native
object atAngularPlatformDashBrowserDashDynamicMod extends js.Object {
  @js.native
  class JitCompilerFactory () extends CompilerFactory {
    var _defaultOptions: js.Any = js.native
  }
  
  @js.native
  class ɵCompilerImpl protected () extends Compiler {
    def this(
      injector: Injector,
      _metadataResolver: CompileMetadataResolver,
      templateParser: TemplateParser,
      styleCompiler: StyleCompiler,
      viewCompiler: ViewCompiler,
      ngModuleCompiler: NgModuleCompiler,
      summaryResolver: SummaryResolver[Type[_]],
      compileReflector: CompileReflector,
      jitEvaluator: JitEvaluator,
      compilerConfig: CompilerConfig,
      console: ɵConsole
    ) = this()
    var _delegate: js.Any = js.native
    var _metadataResolver: js.Any = js.native
    var getExtraNgModuleProviders: js.Any = js.native
    val injector: Injector = js.native
    def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
    def hasAotSummary(ref: Type[_]): Boolean = js.native
    def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
  }
  
  @js.native
  class ɵResourceLoaderImpl () extends ResourceLoader
  
  @js.native
  class ɵangular_packages_platform_browser_dynamic_platform_browser_dynamic_a () extends ResourceLoader {
    var _cache: js.Any = js.native
  }
  
  val RESOURCE_CACHE_PROVIDER: js.Array[Provider] = js.native
  val VERSION: Version = js.native
  val ɵINTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS: js.Array[StaticProvider] = js.native
  def platformBrowserDynamic(): PlatformRef = js.native
  def platformBrowserDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵplatformCoreDynamic(): PlatformRef = js.native
  def ɵplatformCoreDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
}

