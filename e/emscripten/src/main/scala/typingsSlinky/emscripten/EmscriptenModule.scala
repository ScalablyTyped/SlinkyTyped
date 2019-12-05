package typingsSlinky.emscripten

import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.emscripten.Emscripten.CCallOpts
import typingsSlinky.emscripten.Emscripten.EnvironmentType
import typingsSlinky.emscripten.Emscripten.TypeCompatibleWithC
import typingsSlinky.emscripten.Emscripten.ValueType
import typingsSlinky.emscripten.Emscripten.WebAssemblyExports
import typingsSlinky.emscripten.Emscripten.WebAssemblyImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenModule extends js.Object {
  var ALLOC_DYNAMIC: Double = js.native
  var ALLOC_NONE: Double = js.native
  var ALLOC_NORMAL: Double = js.native
  var ALLOC_STACK: Double = js.native
  var ALLOC_STATIC: Double = js.native
  var FAST_MEMORY: Double = js.native
  var FHEAP: scala.scalajs.js.typedarray.Float64Array = js.native
  // USE_TYPED_ARRAYS == 1
  var HEAP: scala.scalajs.js.typedarray.Int32Array = js.native
  var HEAP16: scala.scalajs.js.typedarray.Int16Array = js.native
  var HEAP32: scala.scalajs.js.typedarray.Int32Array = js.native
  // USE_TYPED_ARRAYS == 2
  var HEAP8: scala.scalajs.js.typedarray.Int8Array = js.native
  var HEAPF32: scala.scalajs.js.typedarray.Float32Array = js.native
  var HEAPF64: scala.scalajs.js.typedarray.Float64Array = js.native
  var HEAPU16: scala.scalajs.js.typedarray.Uint16Array = js.native
  var HEAPU32: scala.scalajs.js.typedarray.Uint32Array = js.native
  var HEAPU8: scala.scalajs.js.typedarray.Uint8Array = js.native
  var IHEAP: scala.scalajs.js.typedarray.Int32Array = js.native
  var Runtime: js.Any = js.native
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
  var wasmBinary: scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def _free(ptr: Double): Unit = js.native
  def _malloc(size: Double): Double = js.native
  def addOnExit(cb: js.Function0[_]): Unit = js.native
  def addOnInit(cb: js.Function0[_]): Unit = js.native
  def addOnPostRun(cb: js.Function0[_]): Unit = js.native
  def addOnPreMain(cb: js.Function0[_]): Unit = js.native
  def addOnPreRun(cb: js.Function0[_]): Unit = js.native
  def addRunDependency(id: js.Any): Unit = js.native
  def allocate(slab: js.Any, types: String, allocator: Double, ptr: Double): Double = js.native
  def allocate(slab: js.Any, types: js.Array[String], allocator: Double, ptr: Double): Double = js.native
  def ccall(
    ident: String,
    returnType: Null,
    argTypes: js.Array[ValueType],
    args: js.Array[TypeCompatibleWithC]
  ): js.Any = js.native
  def ccall(
    ident: String,
    returnType: Null,
    argTypes: js.Array[ValueType],
    args: js.Array[TypeCompatibleWithC],
    opts: CCallOpts
  ): js.Any = js.native
  def ccall(
    ident: String,
    returnType: ValueType,
    argTypes: js.Array[ValueType],
    args: js.Array[TypeCompatibleWithC]
  ): js.Any = js.native
  def ccall(
    ident: String,
    returnType: ValueType,
    argTypes: js.Array[ValueType],
    args: js.Array[TypeCompatibleWithC],
    opts: CCallOpts
  ): js.Any = js.native
  def cwrap(ident: String, returnType: Null, argTypes: js.Array[ValueType]): js.Function1[/* repeated */ js.Any, _] = js.native
  def cwrap(ident: String, returnType: Null, argTypes: js.Array[ValueType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
  def cwrap(ident: String, returnType: ValueType, argTypes: js.Array[ValueType]): js.Function1[/* repeated */ js.Any, _] = js.native
  def cwrap(ident: String, returnType: ValueType, argTypes: js.Array[ValueType], opts: CCallOpts): js.Function1[/* repeated */ js.Any, _] = js.native
  def destroy(`object`: js.Object): Unit = js.native
  def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def getValue(ptr: Double, `type`: String): Double = js.native
  def getValue(ptr: Double, `type`: String, noSafe: Boolean): Double = js.native
  def instantiateWasm(
    imports: WebAssemblyImports,
    successCallback: js.Function1[/* module */ typingsSlinky.emscripten.WebAssembly.Module, Unit]
  ): WebAssemblyExports = js.native
  // Tools
  def intArrayFromString(stringy: String): js.Array[Double] = js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean): js.Array[Double] = js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean, length: Double): js.Array[Double] = js.native
  def intArrayToString(array: js.Array[Double]): String = js.native
  def locateFile(url: String): String = js.native
  def onAbort(what: js.Any): Unit = js.native
  def onCustomMessage(event: MessageEvent): Unit = js.native
  def onRuntimeInitialized(): Unit = js.native
  def print(str: String): Unit = js.native
  def printErr(str: String): Unit = js.native
  def removeRunDependency(id: js.Any): Unit = js.native
  def setValue(ptr: Double, value: js.Any, `type`: String): Unit = js.native
  def setValue(ptr: Double, value: js.Any, `type`: String, noSafe: Boolean): Unit = js.native
  def writeArrayToMemory(array: js.Array[Double], buffer: Double): Unit = js.native
  def writeAsciiToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
  def writeStringToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
}

