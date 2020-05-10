package typingsSlinky.emscripten

import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.emscripten.Emscripten.EnvironmentType
import typingsSlinky.emscripten.Emscripten.WebAssemblyExports
import typingsSlinky.emscripten.Emscripten.WebAssemblyImports
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenModule extends js.Object {
  var FAST_MEMORY: Double = js.native
  var FHEAP: js.typedarray.Float64Array = js.native
  // USE_TYPED_ARRAYS == 1
  var HEAP: js.typedarray.Int32Array = js.native
  var HEAP16: js.typedarray.Int16Array = js.native
  var HEAP32: js.typedarray.Int32Array = js.native
  // USE_TYPED_ARRAYS == 2
  var HEAP8: js.typedarray.Int8Array = js.native
  var HEAPF32: js.typedarray.Float32Array = js.native
  var HEAPF64: js.typedarray.Float64Array = js.native
  var HEAPU16: js.typedarray.Uint16Array = js.native
  var HEAPU32: js.typedarray.Uint32Array = js.native
  var HEAPU8: js.typedarray.Uint8Array = js.native
  var IHEAP: js.typedarray.Int32Array = js.native
  var TOTAL_MEMORY: Double = js.native
  var TOTAL_STACK: Double = js.native
  var arguments: js.Array[String] = js.native
  var environment: EnvironmentType = js.native
  var filePackagePrefixURL: String = js.native
  var logReadFiles: Boolean = js.native
  var noExitRuntime: Boolean = js.native
  var noInitialRun: Boolean = js.native
  var postRun: js.Array[js.Function0[Unit]] = js.native
  var preInit: js.Array[js.Function0[Unit]] = js.native
  var preRun: js.Array[js.Function0[Unit]] = js.native
  var preinitializedWebGLContext: WebGLRenderingContext = js.native
  var preloadedAudios: js.Any = js.native
  var preloadedImages: js.Any = js.native
  var wasmBinary: js.typedarray.ArrayBuffer = js.native
  /**
    * Initializes an EmscriptenModule object and returns it. The initialized
    * obejct will be passed to then(). Works only when -s MODULARIZE=1 is
    * enabled. This is default exported function when -s EXPORT_ES6=1 is
    * enabled.
    * https://emscripten.org/docs/getting_started/FAQ.html#how-can-i-tell-when-the-page-is-fully-loaded-and-it-is-safe-to-call-compiled-functions
    * @param moduleOverrides Properties of an initialized module to override.
    */
  def apply(): this.type = js.native
  def apply(moduleOverrides: Partial[this.type]): this.type = js.native
  def _free(ptr: Double): Unit = js.native
  def _malloc(size: Double): Double = js.native
  def addOnExit(cb: js.Function0[_]): Unit = js.native
  def addOnInit(cb: js.Function0[_]): Unit = js.native
  def addOnPostRun(cb: js.Function0[_]): Unit = js.native
  def addOnPreMain(cb: js.Function0[_]): Unit = js.native
  def addOnPreRun(cb: js.Function0[_]): Unit = js.native
  def destroy(`object`: js.Object): Unit = js.native
  def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): js.typedarray.ArrayBuffer = js.native
  def instantiateWasm(
    imports: WebAssemblyImports,
    successCallback: js.Function1[/* module */ typingsSlinky.emscripten.WebAssembly.Module, Unit]
  ): WebAssemblyExports = js.native
  def locateFile(url: String, scriptDirectory: String): String = js.native
  def onAbort(what: js.Any): Unit = js.native
  def onCustomMessage(event: MessageEvent): Unit = js.native
  def onRuntimeInitialized(): Unit = js.native
  def print(str: String): Unit = js.native
  def printErr(str: String): Unit = js.native
  /**
    * Promise-like then() inteface.
    * WRANGING: Emscripten's then() is not really promise-based 'thenable'.
    * Don't try to use it with Promise.resolve() or in an async function
    * without deleting delete Module["then"] in the callback.
    * https://github.com/kripken/emscripten/issues/5820
    * Works only when -s MODULARIZE=1 is enabled.
    * @param callback A callback chained from Module() with an Module instance.
    */
  def `then`(callback: js.Function1[/* module */ this.type, Unit]): this.type = js.native
}

