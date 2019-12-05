package typingsSlinky.authmosphere

import typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/Logger", JSImport.Namespace)
@js.native
object libSrcTypesLoggerMod extends js.Object {
  @js.native
  sealed trait LogLevel extends js.Object
  
  @js.native
  trait Logger extends js.Object {
    def debug(message: String): Unit = js.native
    def debug(message: String, error: js.Any): Unit = js.native
    def error(message: String): Unit = js.native
    def error(message: String, error: js.Any): Unit = js.native
    def fatal(message: String): Unit = js.native
    def fatal(message: String, error: js.Any): Unit = js.native
    def info(message: String): Unit = js.native
    def info(message: String, error: js.Any): Unit = js.native
    def trace(message: String): Unit = js.native
    def trace(message: String, error: js.Any): Unit = js.native
    def warn(message: String): Unit = js.native
    def warn(message: String, error: js.Any): Unit = js.native
  }
  
  @js.native
  object LogLevel extends js.Object {
    @js.native
    sealed trait debug extends LogLevel
    
    @js.native
    sealed trait error extends LogLevel
    
    @js.native
    sealed trait fatal extends LogLevel
    
    @js.native
    sealed trait info extends LogLevel
    
    @js.native
    sealed trait trace extends LogLevel
    
    @js.native
    sealed trait warn extends LogLevel
    
    /* "debug" */ val debug: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.debug with String = js.native
    /* "error" */ val error: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.error with String = js.native
    /* "fatal" */ val fatal: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.fatal with String = js.native
    /* "info" */ val info: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.info with String = js.native
    /* "trace" */ val trace: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.trace with String = js.native
    /* "warn" */ val warn: typingsSlinky.authmosphere.libSrcTypesLoggerMod.LogLevel.warn with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevel with String] = js.native
  }
  
}

