package typingsSlinky.pdf2image.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.vmMod.CompileFunctionOptions
import typingsSlinky.node.vmMod.Context
import typingsSlinky.node.vmMod.CreateContextOptions
import typingsSlinky.node.vmMod.MeasureMemoryOptions
import typingsSlinky.node.vmMod.MemoryMeasurement
import typingsSlinky.node.vmMod.RunningScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedVm extends js.Object {
  
  var Script: Instantiable1[/* code */ String, typingsSlinky.node.vmMod.Script] = js.native
  
  def compileFunction(code: String): js.Function = js.native
  def compileFunction(code: String, params: js.UndefOr[scala.Nothing], options: CompileFunctionOptions): js.Function = js.native
  def compileFunction(code: String, params: js.Array[String]): js.Function = js.native
  def compileFunction(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
  
  def createContext(): Context = js.native
  def createContext(sandbox: js.UndefOr[scala.Nothing], options: CreateContextOptions): Context = js.native
  def createContext(sandbox: Context): Context = js.native
  def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
  
  def isContext(sandbox: Context): Boolean = js.native
  
  /**
    * Measure the memory known to V8 and used by the current execution context or a specified context.
    *
    * The format of the object that the returned Promise may resolve with is
    * specific to the V8 engine and may change from one version of V8 to the next.
    *
    * The returned result is different from the statistics returned by
    * `v8.getHeapSpaceStatistics()` in that `vm.measureMemory()` measures
    * the memory reachable by V8 from a specific context, while
    * `v8.getHeapSpaceStatistics()` measures the memory used by an instance
    * of V8 engine, which can switch among multiple contexts that reference
    * objects in the heap of one engine.
    *
    * @experimental
    */
  def measureMemory(): js.Promise[MemoryMeasurement] = js.native
  def measureMemory(options: MeasureMemoryOptions): js.Promise[MemoryMeasurement] = js.native
  
  def runInContext(code: String, contextifiedSandbox: Context): js.Any = js.native
  def runInContext(code: String, contextifiedSandbox: Context, options: String): js.Any = js.native
  def runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  def runInNewContext(code: String): js.Any = js.native
  def runInNewContext(code: String, sandbox: js.UndefOr[scala.Nothing], options: String): js.Any = js.native
  def runInNewContext(code: String, sandbox: js.UndefOr[scala.Nothing], options: RunningScriptOptions): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context, options: String): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  def runInThisContext(code: String): js.Any = js.native
  def runInThisContext(code: String, options: String): js.Any = js.native
  def runInThisContext(code: String, options: RunningScriptOptions): js.Any = js.native
}
