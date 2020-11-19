package typingsSlinky.emscripten

import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.emscripten.Emscripten.EnvironmentType
import typingsSlinky.emscripten.Emscripten.WebAssemblyExports
import typingsSlinky.emscripten.Emscripten.WebAssemblyImports
import typingsSlinky.emscripten.WebAssembly.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def _free(ptr: Double): Unit = js.native
  
  def _malloc(size: Double): Double = js.native
  
  def addOnExit(cb: js.Function0[_]): Unit = js.native
  
  def addOnInit(cb: js.Function0[_]): Unit = js.native
  
  def addOnPostRun(cb: js.Function0[_]): Unit = js.native
  
  def addOnPreMain(cb: js.Function0[_]): Unit = js.native
  
  def addOnPreRun(cb: js.Function0[_]): Unit = js.native
  
  var arguments: js.Array[String] = js.native
  
  def destroy(`object`: js.Object): Unit = js.native
  
  var environment: EnvironmentType = js.native
  
  var filePackagePrefixURL: String = js.native
  
  def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): js.typedarray.ArrayBuffer = js.native
  
  def instantiateWasm(imports: WebAssemblyImports, successCallback: js.Function1[/* module */ Module, Unit]): WebAssemblyExports = js.native
  
  def locateFile(url: String, scriptDirectory: String): String = js.native
  
  var logReadFiles: Boolean = js.native
  
  var noExitRuntime: Boolean = js.native
  
  var noInitialRun: Boolean = js.native
  
  def onAbort(what: js.Any): Unit = js.native
  
  def onCustomMessage(event: MessageEvent): Unit = js.native
  
  def onRuntimeInitialized(): Unit = js.native
  
  var postRun: js.Array[js.Function0[Unit]] = js.native
  
  var preInit: js.Array[js.Function0[Unit]] = js.native
  
  var preRun: js.Array[js.Function0[Unit]] = js.native
  
  var preinitializedWebGLContext: WebGLRenderingContext = js.native
  
  var preloadedAudios: js.Any = js.native
  
  var preloadedImages: js.Any = js.native
  
  def print(str: String): Unit = js.native
  
  def printErr(str: String): Unit = js.native
  
  var wasmBinary: js.typedarray.ArrayBuffer = js.native
}
object EmscriptenModule {
  
  @scala.inline
  def apply(
    FAST_MEMORY: Double,
    FHEAP: js.typedarray.Float64Array,
    HEAP: js.typedarray.Int32Array,
    HEAP16: js.typedarray.Int16Array,
    HEAP32: js.typedarray.Int32Array,
    HEAP8: js.typedarray.Int8Array,
    HEAPF32: js.typedarray.Float32Array,
    HEAPF64: js.typedarray.Float64Array,
    HEAPU16: js.typedarray.Uint16Array,
    HEAPU32: js.typedarray.Uint32Array,
    HEAPU8: js.typedarray.Uint8Array,
    IHEAP: js.typedarray.Int32Array,
    TOTAL_MEMORY: Double,
    TOTAL_STACK: Double,
    _free: Double => Unit,
    _malloc: Double => Double,
    addOnExit: js.Function0[_] => Unit,
    addOnInit: js.Function0[_] => Unit,
    addOnPostRun: js.Function0[_] => Unit,
    addOnPreMain: js.Function0[_] => Unit,
    addOnPreRun: js.Function0[_] => Unit,
    arguments: js.Array[String],
    destroy: js.Object => Unit,
    environment: EnvironmentType,
    filePackagePrefixURL: String,
    getPreloadedPackage: (String, Double) => js.typedarray.ArrayBuffer,
    instantiateWasm: (WebAssemblyImports, js.Function1[/* module */ Module, Unit]) => WebAssemblyExports,
    locateFile: (String, String) => String,
    logReadFiles: Boolean,
    noExitRuntime: Boolean,
    noInitialRun: Boolean,
    onAbort: js.Any => Unit,
    onCustomMessage: MessageEvent => Unit,
    onRuntimeInitialized: () => Unit,
    postRun: js.Array[js.Function0[Unit]],
    preInit: js.Array[js.Function0[Unit]],
    preRun: js.Array[js.Function0[Unit]],
    preinitializedWebGLContext: WebGLRenderingContext,
    preloadedAudios: js.Any,
    preloadedImages: js.Any,
    print: String => Unit,
    printErr: String => Unit,
    wasmBinary: js.typedarray.ArrayBuffer
  ): EmscriptenModule = {
    val __obj = js.Dynamic.literal(FAST_MEMORY = FAST_MEMORY.asInstanceOf[js.Any], FHEAP = FHEAP.asInstanceOf[js.Any], HEAP = HEAP.asInstanceOf[js.Any], HEAP16 = HEAP16.asInstanceOf[js.Any], HEAP32 = HEAP32.asInstanceOf[js.Any], HEAP8 = HEAP8.asInstanceOf[js.Any], HEAPF32 = HEAPF32.asInstanceOf[js.Any], HEAPF64 = HEAPF64.asInstanceOf[js.Any], HEAPU16 = HEAPU16.asInstanceOf[js.Any], HEAPU32 = HEAPU32.asInstanceOf[js.Any], HEAPU8 = HEAPU8.asInstanceOf[js.Any], IHEAP = IHEAP.asInstanceOf[js.Any], TOTAL_MEMORY = TOTAL_MEMORY.asInstanceOf[js.Any], TOTAL_STACK = TOTAL_STACK.asInstanceOf[js.Any], _free = js.Any.fromFunction1(_free), _malloc = js.Any.fromFunction1(_malloc), addOnExit = js.Any.fromFunction1(addOnExit), addOnInit = js.Any.fromFunction1(addOnInit), addOnPostRun = js.Any.fromFunction1(addOnPostRun), addOnPreMain = js.Any.fromFunction1(addOnPreMain), addOnPreRun = js.Any.fromFunction1(addOnPreRun), arguments = arguments.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), environment = environment.asInstanceOf[js.Any], filePackagePrefixURL = filePackagePrefixURL.asInstanceOf[js.Any], getPreloadedPackage = js.Any.fromFunction2(getPreloadedPackage), instantiateWasm = js.Any.fromFunction2(instantiateWasm), locateFile = js.Any.fromFunction2(locateFile), logReadFiles = logReadFiles.asInstanceOf[js.Any], noExitRuntime = noExitRuntime.asInstanceOf[js.Any], noInitialRun = noInitialRun.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1(onAbort), onCustomMessage = js.Any.fromFunction1(onCustomMessage), onRuntimeInitialized = js.Any.fromFunction0(onRuntimeInitialized), postRun = postRun.asInstanceOf[js.Any], preInit = preInit.asInstanceOf[js.Any], preRun = preRun.asInstanceOf[js.Any], preinitializedWebGLContext = preinitializedWebGLContext.asInstanceOf[js.Any], preloadedAudios = preloadedAudios.asInstanceOf[js.Any], preloadedImages = preloadedImages.asInstanceOf[js.Any], print = js.Any.fromFunction1(print), printErr = js.Any.fromFunction1(printErr), wasmBinary = wasmBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenModule]
  }
  
  @scala.inline
  implicit class EmscriptenModuleOps[Self <: EmscriptenModule] (val x: Self) extends AnyVal {
    
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
    def setFAST_MEMORY(value: Double): Self = this.set("FAST_MEMORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFHEAP(value: js.typedarray.Float64Array): Self = this.set("FHEAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAP(value: js.typedarray.Int32Array): Self = this.set("HEAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAP16(value: js.typedarray.Int16Array): Self = this.set("HEAP16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAP32(value: js.typedarray.Int32Array): Self = this.set("HEAP32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAP8(value: js.typedarray.Int8Array): Self = this.set("HEAP8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAPF32(value: js.typedarray.Float32Array): Self = this.set("HEAPF32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAPF64(value: js.typedarray.Float64Array): Self = this.set("HEAPF64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAPU16(value: js.typedarray.Uint16Array): Self = this.set("HEAPU16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAPU32(value: js.typedarray.Uint32Array): Self = this.set("HEAPU32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAPU8(value: js.typedarray.Uint8Array): Self = this.set("HEAPU8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIHEAP(value: js.typedarray.Int32Array): Self = this.set("IHEAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOTAL_MEMORY(value: Double): Self = this.set("TOTAL_MEMORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOTAL_STACK(value: Double): Self = this.set("TOTAL_STACK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_free(value: Double => Unit): Self = this.set("_free", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_malloc(value: Double => Double): Self = this.set("_malloc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnExit(value: js.Function0[_] => Unit): Self = this.set("addOnExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnInit(value: js.Function0[_] => Unit): Self = this.set("addOnInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnPostRun(value: js.Function0[_] => Unit): Self = this.set("addOnPostRun", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnPreMain(value: js.Function0[_] => Unit): Self = this.set("addOnPreMain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnPreRun(value: js.Function0[_] => Unit): Self = this.set("addOnPreRun", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: js.Object => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnvironment(value: EnvironmentType): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePackagePrefixURL(value: String): Self = this.set("filePackagePrefixURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPreloadedPackage(value: (String, Double) => js.typedarray.ArrayBuffer): Self = this.set("getPreloadedPackage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInstantiateWasm(value: (WebAssemblyImports, js.Function1[/* module */ Module, Unit]) => WebAssemblyExports): Self = this.set("instantiateWasm", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLocateFile(value: (String, String) => String): Self = this.set("locateFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLogReadFiles(value: Boolean): Self = this.set("logReadFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoExitRuntime(value: Boolean): Self = this.set("noExitRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoInitialRun(value: Boolean): Self = this.set("noInitialRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAbort(value: js.Any => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCustomMessage(value: MessageEvent => Unit): Self = this.set("onCustomMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRuntimeInitialized(value: () => Unit): Self = this.set("onRuntimeInitialized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostRunVarargs(value: js.Function0[Unit]*): Self = this.set("postRun", js.Array(value :_*))
    
    @scala.inline
    def setPostRun(value: js.Array[js.Function0[Unit]]): Self = this.set("postRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreInitVarargs(value: js.Function0[Unit]*): Self = this.set("preInit", js.Array(value :_*))
    
    @scala.inline
    def setPreInit(value: js.Array[js.Function0[Unit]]): Self = this.set("preInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreRunVarargs(value: js.Function0[Unit]*): Self = this.set("preRun", js.Array(value :_*))
    
    @scala.inline
    def setPreRun(value: js.Array[js.Function0[Unit]]): Self = this.set("preRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreinitializedWebGLContext(value: WebGLRenderingContext): Self = this.set("preinitializedWebGLContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadedAudios(value: js.Any): Self = this.set("preloadedAudios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadedImages(value: js.Any): Self = this.set("preloadedImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: String => Unit): Self = this.set("print", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrintErr(value: String => Unit): Self = this.set("printErr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWasmBinary(value: js.typedarray.ArrayBuffer): Self = this.set("wasmBinary", value.asInstanceOf[js.Any])
  }
}
