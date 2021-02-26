package typingsSlinky.angularPlatformBrowserDynamic

import typingsSlinky.angularCompiler.mod.CompileMetadataResolver
import typingsSlinky.angularCompiler.mod.CompileReflector
import typingsSlinky.angularCompiler.mod.CompilerConfig
import typingsSlinky.angularCompiler.mod.JitEvaluator
import typingsSlinky.angularCompiler.mod.NgModuleCompiler
import typingsSlinky.angularCompiler.mod.ResourceLoader
import typingsSlinky.angularCompiler.mod.StyleCompiler
import typingsSlinky.angularCompiler.mod.SummaryResolver
import typingsSlinky.angularCompiler.mod.TemplateParser
import typingsSlinky.angularCompiler.mod.ViewCompiler
import typingsSlinky.angularCore.mod.Compiler
import typingsSlinky.angularCore.mod.CompilerFactory
import typingsSlinky.angularCore.mod.ComponentFactory
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.PlatformRef
import typingsSlinky.angularCore.mod.Provider
import typingsSlinky.angularCore.mod.StaticProvider
import typingsSlinky.angularCore.mod.Type
import typingsSlinky.angularCore.mod.Version
import typingsSlinky.angularCore.mod.ɵConsole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/platform-browser-dynamic", "JitCompilerFactory")
  @js.native
  class JitCompilerFactory () extends CompilerFactory {
    
    var _defaultOptions: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "RESOURCE_CACHE_PROVIDER")
  @js.native
  val RESOURCE_CACHE_PROVIDER: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "platformBrowserDynamic")
  @js.native
  def platformBrowserDynamic(): PlatformRef = js.native
  @JSImport("@angular/platform-browser-dynamic", "platformBrowserDynamic")
  @js.native
  def platformBrowserDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275COMPILER_PROVIDERS__POST_R3__")
  @js.native
  val ɵCOMPILERPROVIDERSPOSTR3: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275CompilerImpl")
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
    
    def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
    
    var getExtraNgModuleProviders: js.Any = js.native
    
    def hasAotSummary(ref: Type[_]): Boolean = js.native
    
    val injector: Injector = js.native
    
    def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275INTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS")
  @js.native
  val ɵINTERNALBROWSERDYNAMICPLATFORMPROVIDERS: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275ResourceLoaderImpl")
  @js.native
  class ɵResourceLoaderImpl () extends ResourceLoader
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275angular_packages_platform_browser_dynamic_platform_browser_dynamic_a")
  @js.native
  class ɵangularPackagesPlatformBrowserDynamicPlatformBrowserDynamicA () extends ResourceLoader {
    
    var _cache: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275platformCoreDynamic")
  @js.native
  def ɵplatformCoreDynamic(): PlatformRef = js.native
  @JSImport("@angular/platform-browser-dynamic", "\u0275platformCoreDynamic")
  @js.native
  def ɵplatformCoreDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
}
