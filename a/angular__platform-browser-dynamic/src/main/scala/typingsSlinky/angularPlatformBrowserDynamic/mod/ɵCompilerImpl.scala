package typingsSlinky.angularPlatformBrowserDynamic.mod

import typingsSlinky.angularCompiler.mod.CompileMetadataResolver
import typingsSlinky.angularCompiler.mod.CompileReflector
import typingsSlinky.angularCompiler.mod.CompilerConfig
import typingsSlinky.angularCompiler.mod.JitEvaluator
import typingsSlinky.angularCompiler.mod.NgModuleCompiler
import typingsSlinky.angularCompiler.mod.StyleCompiler
import typingsSlinky.angularCompiler.mod.SummaryResolver
import typingsSlinky.angularCompiler.mod.TemplateParser
import typingsSlinky.angularCompiler.mod.ViewCompiler
import typingsSlinky.angularCore.mod.Compiler
import typingsSlinky.angularCore.mod.ComponentFactory
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.Type
import typingsSlinky.angularCore.mod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
