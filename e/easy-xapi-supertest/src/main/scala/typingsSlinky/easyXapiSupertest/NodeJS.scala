package typingsSlinky.easyXapiSupertest

import typingsSlinky.easyXapiSupertest.anon.Ares
import typingsSlinky.easyXapiSupertest.anon.End
import typingsSlinky.easyXapiSupertest.anon.FnCall
import typingsSlinky.easyXapiSupertest.anon.FnCallSRadix
import typingsSlinky.easyXapiSupertest.anon.HeapTotal
import typingsSlinky.easyXapiSupertest.anon.Instantiable
import typingsSlinky.easyXapiSupertest.anon.Targetdefaults
import typingsSlinky.easyXapiSupertest.anon.Typeofconsole
import typingsSlinky.node.Buffer
import typingsSlinky.std.ArrayBufferConstructor
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.DataViewConstructor
import typingsSlinky.std.DateConstructor
import typingsSlinky.std.Error
import typingsSlinky.std.ErrorConstructor
import typingsSlinky.std.EvalErrorConstructor
import typingsSlinky.std.Float32ArrayConstructor
import typingsSlinky.std.Float64ArrayConstructor
import typingsSlinky.std.FunctionConstructor
import typingsSlinky.std.Int16ArrayConstructor
import typingsSlinky.std.Int32ArrayConstructor
import typingsSlinky.std.Int8ArrayConstructor
import typingsSlinky.std.MapConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.RangeErrorConstructor
import typingsSlinky.std.ReferenceErrorConstructor
import typingsSlinky.std.RegExpConstructor
import typingsSlinky.std.SetConstructor
import typingsSlinky.std.StringConstructor
import typingsSlinky.std.SyntaxErrorConstructor
import typingsSlinky.std.TypeErrorConstructor
import typingsSlinky.std.URIErrorConstructor
import typingsSlinky.std.Uint16ArrayConstructor
import typingsSlinky.std.Uint32ArrayConstructor
import typingsSlinky.std.Uint8ArrayConstructor
import typingsSlinky.std.WeakMapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/************************************************
*                                               *
*               GLOBAL INTERFACES               *
*                                               *
************************************************/
object NodeJS {
  
  @js.native
  trait ErrnoException extends Error {
    
    var code: js.UndefOr[String] = js.native
    
    var errno: js.UndefOr[Double] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var syscall: js.UndefOr[String] = js.native
  }
  object ErrnoException {
    
    @scala.inline
    def apply(message: String, name: String): ErrnoException = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrnoException]
    }
    
    @scala.inline
    implicit class ErrnoExceptionMutableBuilder[Self <: ErrnoException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
    }
  }
  
  @js.native
  trait EventEmitter extends StObject {
    
    def addListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    
    def on(event: String, listener: js.Function): EventEmitter = js.native
    
    def once(event: String, listener: js.Function): EventEmitter = js.native
    
    def removeAllListeners(): EventEmitter = js.native
    def removeAllListeners(event: String): EventEmitter = js.native
    
    def removeListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
  }
  
  @js.native
  trait Global extends StObject {
    
    def Array(): js.Array[_] = js.native
    def Array(arrayLength: Double): js.Array[_] = js.native
    def Array[T](items: T*): js.Array[T] = js.native
    
    var ArrayBuffer: ArrayBufferConstructor = js.native
    
    @JSName("Array")
    var Array_Original: ArrayConstructor = js.native
    @JSName("Array")
    def Array_T[T](arrayLength: Double): js.Array[T] = js.native
    
    def Boolean[T](): scala.Boolean = js.native
    def Boolean[T](value: T): scala.Boolean = js.native
    @JSName("Boolean")
    var Boolean_Original: BooleanConstructor = js.native
    
    var Buffer: Instantiable = js.native
    
    var DataView: DataViewConstructor = js.native
    
    def Date(): String = js.native
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
    def Error(): js.Error = js.native
    def Error(message: String): js.Error = js.native
    @JSName("Error")
    var Error_Original: ErrorConstructor = js.native
    
    def EvalError(): js.EvalError = js.native
    def EvalError(message: String): js.EvalError = js.native
    @JSName("EvalError")
    def EvalError_Error(): js.Error = js.native
    @JSName("EvalError")
    def EvalError_Error(message: String): js.Error = js.native
    @JSName("EvalError")
    var EvalError_Original: EvalErrorConstructor = js.native
    
    var Float32Array: Float32ArrayConstructor = js.native
    
    var Float64Array: Float64ArrayConstructor = js.native
    
    def Function(args: String*): js.Function = js.native
    @JSName("Function")
    var Function_Original: FunctionConstructor = js.native
    
    var GLOBAL: Global = js.native
    
    var Infinity: Double = js.native
    
    var Int16Array: Int16ArrayConstructor = js.native
    
    var Int32Array: Int32ArrayConstructor = js.native
    
    var Int8Array: Int8ArrayConstructor = js.native
    
    var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any = js.native
    
    var JSON: typingsSlinky.std.JSON = js.native
    
    var Map: MapConstructor = js.native
    
    var Math: typingsSlinky.std.Math = js.native
    
    var NaN: Double = js.native
    
    def Number(): Double = js.native
    def Number(value: js.Any): Double = js.native
    @JSName("Number")
    var Number_Original: NumberConstructor = js.native
    
    def Object(): js.Any = js.native
    def Object(value: js.Any): js.Any = js.native
    @JSName("Object")
    var Object_Original: ObjectConstructor = js.native
    
    var Promise: js.Function = js.native
    
    def RangeError(): js.RangeError = js.native
    def RangeError(message: String): js.RangeError = js.native
    @JSName("RangeError")
    def RangeError_Error(): js.Error = js.native
    @JSName("RangeError")
    def RangeError_Error(message: String): js.Error = js.native
    @JSName("RangeError")
    var RangeError_Original: RangeErrorConstructor = js.native
    
    def ReferenceError(): js.ReferenceError = js.native
    def ReferenceError(message: String): js.ReferenceError = js.native
    @JSName("ReferenceError")
    def ReferenceError_Error(): js.Error = js.native
    @JSName("ReferenceError")
    def ReferenceError_Error(message: String): js.Error = js.native
    @JSName("ReferenceError")
    var ReferenceError_Original: ReferenceErrorConstructor = js.native
    
    def RegExp(pattern: String): js.RegExp = js.native
    def RegExp(pattern: String, flags: String): js.RegExp = js.native
    def RegExp(pattern: js.RegExp): js.RegExp = js.native
    def RegExp(pattern: js.RegExp, flags: String): js.RegExp = js.native
    @JSName("RegExp")
    var RegExp_Original: RegExpConstructor = js.native
    
    var Set: SetConstructor = js.native
    
    def String(): java.lang.String = js.native
    def String(value: js.Any): java.lang.String = js.native
    @JSName("String")
    var String_Original: StringConstructor = js.native
    
    var Symbol: js.Function = js.native
    
    def SyntaxError(): js.SyntaxError = js.native
    def SyntaxError(message: String): js.SyntaxError = js.native
    @JSName("SyntaxError")
    def SyntaxError_Error(): js.Error = js.native
    @JSName("SyntaxError")
    def SyntaxError_Error(message: String): js.Error = js.native
    @JSName("SyntaxError")
    var SyntaxError_Original: SyntaxErrorConstructor = js.native
    
    def TypeError(): js.Error = js.native
    def TypeError(message: String): js.Error = js.native
    @JSName("TypeError")
    var TypeError_Original: TypeErrorConstructor = js.native
    @JSName("TypeError")
    def TypeError_TypeError(): js.TypeError = js.native
    @JSName("TypeError")
    def TypeError_TypeError(message: String): js.TypeError = js.native
    
    def URIError(): js.URIError = js.native
    def URIError(message: String): js.URIError = js.native
    @JSName("URIError")
    def URIError_Error(): js.Error = js.native
    @JSName("URIError")
    def URIError_Error(message: String): js.Error = js.native
    @JSName("URIError")
    var URIError_Original: URIErrorConstructor = js.native
    
    var Uint16Array: Uint16ArrayConstructor = js.native
    
    var Uint32Array: Uint32ArrayConstructor = js.native
    
    var Uint8Array: Uint8ArrayConstructor = js.native
    
    var Uint8ClampedArray: js.Function = js.native
    
    var WeakMap: WeakMapConstructor = js.native
    
    var WeakSet: js.Function = js.native
    
    def clearImmediate(immediateId: js.Any): Unit = js.native
    
    def clearInterval(intervalId: Timer): Unit = js.native
    
    def clearTimeout(timeoutId: Timer): Unit = js.native
    
    var console: Typeofconsole = js.native
    
    def decodeURI(encodedURI: String): String = js.native
    
    def decodeURIComponent(encodedURIComponent: String): String = js.native
    @JSName("decodeURIComponent")
    var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String] = js.native
    
    @JSName("decodeURI")
    var decodeURI_Original: js.Function1[/* encodedURI */ String, String] = js.native
    
    def encodeURI(uri: String): String = js.native
    
    def encodeURIComponent(uriComponent: String): String = js.native
    def encodeURIComponent(uriComponent: Boolean): String = js.native
    def encodeURIComponent(uriComponent: Double): String = js.native
    @JSName("encodeURIComponent")
    var encodeURIComponent_Original: FnCall = js.native
    
    @JSName("encodeURI")
    var encodeURI_Original: js.Function1[/* uri */ String, String] = js.native
    
    def escape(str: String): String = js.native
    
    def eval(x: String): js.Any = js.native
    @JSName("eval")
    var eval_Original: js.Function1[/* x */ String, _] = js.native
    
    def gc(): Unit = js.native
    
    var global: Global = js.native
    
    def isFinite(number: Double): Boolean = js.native
    @JSName("isFinite")
    var isFinite_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    def isNaN(number: Double): Boolean = js.native
    @JSName("isNaN")
    var isNaN_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    def parseFloat(string: String): Double = js.native
    @JSName("parseFloat")
    var parseFloat_Original: js.Function1[/* string */ String, Double] = js.native
    
    def parseInt(s: String): Double = js.native
    def parseInt(s: String, radix: Double): Double = js.native
    @JSName("parseInt")
    var parseInt_Original: FnCallSRadix = js.native
    
    var process: Process = js.native
    
    var root: Global = js.native
    
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): js.Any = js.native
    
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = js.native
    
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = js.native
    
    var undefined: js.UndefOr[scala.Nothing] = js.native
    
    def unescape(str: String): String = js.native
  }
  
  @js.native
  trait Process extends EventEmitter {
    
    def abort(): Unit = js.native
    
    var arch: String = js.native
    
    var argv: js.Array[String] = js.native
    
    def chdir(directory: String): Unit = js.native
    
    var config: Targetdefaults = js.native
    
    def cwd(): String = js.native
    
    var env: js.Any = js.native
    
    var execPath: String = js.native
    
    def exit(): Unit = js.native
    def exit(code: Double): Unit = js.native
    
    def getgid(): Double = js.native
    
    def getuid(): Double = js.native
    
    def hrtime(): js.Array[Double] = js.native
    def hrtime(time: js.Array[Double]): js.Array[Double] = js.native
    
    def kill(pid: Double): Unit = js.native
    def kill(pid: Double, signal: String): Unit = js.native
    
    def memoryUsage(): HeapTotal = js.native
    
    def nextTick(callback: js.Function): Unit = js.native
    
    var pid: Double = js.native
    
    var platform: String = js.native
    
    // Worker
    var send: js.UndefOr[js.Function2[/* message */ js.Any, /* sendHandle */ js.UndefOr[js.Any], Unit]] = js.native
    
    def setgid(id: String): Unit = js.native
    def setgid(id: Double): Unit = js.native
    
    def setuid(id: String): Unit = js.native
    def setuid(id: Double): Unit = js.native
    
    var stderr: WritableStream = js.native
    
    var stdin: ReadableStream = js.native
    
    var stdout: WritableStream = js.native
    
    var title: String = js.native
    
    def umask(): Double = js.native
    def umask(mask: Double): Double = js.native
    
    def uptime(): Double = js.native
    
    var version: String = js.native
    
    var versions: Ares = js.native
  }
  
  @js.native
  trait ReadWriteStream
    extends ReadableStream
       with WritableStream
  
  @js.native
  trait ReadableStream extends EventEmitter {
    
    def pause(): Unit = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def read(): String | Buffer = js.native
    def read(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    def resume(): Unit = js.native
    
    def setEncoding(encoding: String): Unit = js.native
    
    def unpipe[T /* <: WritableStream */](): Unit = js.native
    def unpipe[T /* <: WritableStream */](destination: T): Unit = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: Buffer): Unit = js.native
    
    def wrap(oldStream: ReadableStream): ReadableStream = js.native
  }
  
  @js.native
  trait Timer extends StObject {
    
    def ref(): Unit = js.native
    
    def unref(): Unit = js.native
  }
  object Timer {
    
    @scala.inline
    def apply(ref: () => Unit, unref: () => Unit): Timer = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit class TimerMutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WritableStream extends EventEmitter {
    
    def end(): Unit = js.native
    def end(buffer: Buffer): Unit = js.native
    def end(buffer: Buffer, cb: js.Function): Unit = js.native
    def end(str: String): Unit = js.native
    def end(str: String, cb: js.Function): Unit = js.native
    def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
    def end(str: String, encoding: String): Unit = js.native
    def end(str: String, encoding: String, cb: js.Function): Unit = js.native
    
    var writable: Boolean = js.native
    
    def write(buffer: Buffer): Boolean = js.native
    def write(buffer: Buffer, cb: js.Function): Boolean = js.native
    def write(str: String): Boolean = js.native
    def write(str: String, cb: js.Function): Boolean = js.native
    def write(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
    def write(str: String, encoding: String): Boolean = js.native
    def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
  }
}
