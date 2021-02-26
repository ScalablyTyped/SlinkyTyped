package typingsSlinky.browserBunyan

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
import typingsSlinky.bunyan.mod.LogLevel
import typingsSlinky.bunyan.mod.Logger
import typingsSlinky.bunyan.mod.LoggerOptions
import typingsSlinky.bunyan.mod.RingBuffer
import typingsSlinky.bunyan.mod.RingBufferOptions
import typingsSlinky.bunyan.mod.RotatingFileStream
import typingsSlinky.bunyan.mod.RotatingFileStreamOptions
import typingsSlinky.bunyan.mod.StdSerializers_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ConsoleFormattedStream extends StObject {
    
    var ConsoleFormattedStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream = js.native
    
    var ConsoleRawStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleRawStream = js.native
  }
  object ConsoleFormattedStream {
    
    @scala.inline
    def apply(
      ConsoleFormattedStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream,
      ConsoleRawStream: ConsoleRawStream
    ): ConsoleFormattedStream = {
      val __obj = js.Dynamic.literal(ConsoleFormattedStream = ConsoleFormattedStream.asInstanceOf[js.Any], ConsoleRawStream = ConsoleRawStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsoleFormattedStream]
    }
    
    @scala.inline
    implicit class ConsoleFormattedStreamMutableBuilder[Self <: ConsoleFormattedStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsoleFormattedStream(value: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream): Self = StObject.set(x, "ConsoleFormattedStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleRawStream(value: ConsoleRawStream): Self = StObject.set(x, "ConsoleRawStream", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<browser-bunyan.browser-bunyan.BrowserBunyan.ConsoleFormattedStreamLevelStyle> */
  @js.native
  trait PartialConsoleFormattedSt extends StObject {
    
    var debug: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var fatal: js.UndefOr[String] = js.native
    
    var info: js.UndefOr[String] = js.native
    
    var trace: js.UndefOr[String] = js.native
    
    var warn: js.UndefOr[String] = js.native
  }
  object PartialConsoleFormattedSt {
    
    @scala.inline
    def apply(): PartialConsoleFormattedSt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConsoleFormattedSt]
    }
    
    @scala.inline
    implicit class PartialConsoleFormattedStMutableBuilder[Self <: PartialConsoleFormattedSt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFatal(value: String): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  /* Inlined std.Partial<browser-bunyan.browser-bunyan.BrowserBunyan.ConsoleFormattedStreamStyle> */
  @js.native
  trait PartialConsoleFormattedStDef extends StObject {
    
    var `def`: js.UndefOr[String] = js.native
    
    var levels: js.UndefOr[PartialConsoleFormattedSt] = js.native
    
    var msg: js.UndefOr[String] = js.native
    
    var src: js.UndefOr[String] = js.native
  }
  object PartialConsoleFormattedStDef {
    
    @scala.inline
    def apply(): PartialConsoleFormattedStDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConsoleFormattedStDef]
    }
    
    @scala.inline
    implicit class PartialConsoleFormattedStDefMutableBuilder[Self <: PartialConsoleFormattedStDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDef(value: String): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
      
      @scala.inline
      def setLevels(value: PartialConsoleFormattedSt): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  @js.native
  trait Typeofbunyan extends StObject {
    
    val DEBUG: Double = js.native
    
    val ERROR: Double = js.native
    
    val FATAL: Double = js.native
    
    val INFO: Double = js.native
    
    var RingBuffer: Instantiable1[/* options */ RingBufferOptions, typingsSlinky.bunyan.mod.RingBuffer] = js.native
    
    var RotatingFileStream: Instantiable1[
        /* options */ RotatingFileStreamOptions, 
        typingsSlinky.bunyan.mod.RotatingFileStream
      ] = js.native
    
    val TRACE: Double = js.native
    
    val WARN: Double = js.native
    
    def createLogger(options: LoggerOptions): Logger = js.native
    
    /* Inlined {[ name in bunyan.bunyan.LogLevelString ]: number} */
    val levelFromName: TypeoflevelFromName = js.native
    
    val nameFromLevel: js.Any = js.native
    
    def resolveLevel(value: LogLevel): Double = js.native
    
    def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _] = js.native
    
    val stdSerializers: StdSerializers_ = js.native
  }
  object Typeofbunyan {
    
    @scala.inline
    def apply(
      DEBUG: Double,
      ERROR: Double,
      FATAL: Double,
      INFO: Double,
      RingBuffer: Instantiable1[/* options */ RingBufferOptions, RingBuffer],
      RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream],
      TRACE: Double,
      WARN: Double,
      createLogger: LoggerOptions => Logger,
      levelFromName: TypeoflevelFromName,
      nameFromLevel: js.Any,
      resolveLevel: LogLevel => Double,
      safeCycles: () => js.Function2[/* key */ String, /* value */ js.Any, _],
      stdSerializers: StdSerializers_
    ): Typeofbunyan = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], RingBuffer = RingBuffer.asInstanceOf[js.Any], RotatingFileStream = RotatingFileStream.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], createLogger = js.Any.fromFunction1(createLogger), levelFromName = levelFromName.asInstanceOf[js.Any], nameFromLevel = nameFromLevel.asInstanceOf[js.Any], resolveLevel = js.Any.fromFunction1(resolveLevel), safeCycles = js.Any.fromFunction0(safeCycles), stdSerializers = stdSerializers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofbunyan]
    }
    
    @scala.inline
    implicit class TypeofbunyanMutableBuilder[Self <: Typeofbunyan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateLogger(value: LoggerOptions => Logger): Self = StObject.set(x, "createLogger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFATAL(value: Double): Self = StObject.set(x, "FATAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelFromName(value: TypeoflevelFromName): Self = StObject.set(x, "levelFromName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFromLevel(value: js.Any): Self = StObject.set(x, "nameFromLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveLevel(value: LogLevel => Double): Self = StObject.set(x, "resolveLevel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRingBuffer(value: Instantiable1[/* options */ RingBufferOptions, RingBuffer]): Self = StObject.set(x, "RingBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotatingFileStream(value: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream]): Self = StObject.set(x, "RotatingFileStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeCycles(value: () => js.Function2[/* key */ String, /* value */ js.Any, _]): Self = StObject.set(x, "safeCycles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStdSerializers(value: StdSerializers_): Self = StObject.set(x, "stdSerializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRACE(value: Double): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeoflevelFromName extends StObject {
    
    var debug: Double = js.native
    
    var error: Double = js.native
    
    var fatal: Double = js.native
    
    var info: Double = js.native
    
    var trace: Double = js.native
    
    var warn: Double = js.native
  }
  object TypeoflevelFromName {
    
    @scala.inline
    def apply(debug: Double, error: Double, fatal: Double, info: Double, trace: Double, warn: Double): TypeoflevelFromName = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeoflevelFromName]
    }
    
    @scala.inline
    implicit class TypeoflevelFromNameMutableBuilder[Self <: TypeoflevelFromName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatal(value: Double): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrace(value: Double): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
