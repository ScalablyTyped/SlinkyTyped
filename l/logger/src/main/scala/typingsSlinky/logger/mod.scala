package typingsSlinky.logger

import typingsSlinky.logger.loggerBooleans.`false`
import typingsSlinky.logger.loggerStrings.debug
import typingsSlinky.logger.loggerStrings.error
import typingsSlinky.logger.loggerStrings.fatal
import typingsSlinky.logger.loggerStrings.info
import typingsSlinky.logger.loggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logger", "Logger")
  @js.native
  class Logger () extends StObject {
    def this(logFilePath: String) = this()
    
    def debug(args: String*): String | `false` = js.native
    @JSName("debug")
    var debug_Original: Args = js.native
    
    def error(args: String*): String | `false` = js.native
    @JSName("error")
    var error_Original: Args = js.native
    
    def fatal(args: String*): String | `false` = js.native
    @JSName("fatal")
    var fatal_Original: Args = js.native
    
    def format(level: LogLevel, data: String, message: String): String = js.native
    
    def info(args: String*): String | `false` = js.native
    @JSName("info")
    var info_Original: Args = js.native
    
    def log(level: LogLevel, args: String*): String | `false` = js.native
    
    def setLevel(level: LogLevel): Double | `false` = js.native
    
    def warn(args: String*): String | `false` = js.native
    @JSName("warn")
    var warn_Original: Args = js.native
  }
  object Logger {
    
    @JSImport("logger", "Logger.levels")
    @js.native
    val levels: js.Tuple5[fatal, error, warn, info, debug] = js.native
  }
  
  @JSImport("logger", "createLogger")
  @js.native
  def createLogger(): Logger = js.native
  @JSImport("logger", "createLogger")
  @js.native
  def createLogger(logFilePath: String): Logger = js.native
  
  type Args = js.Function1[/* repeated */ String, String | `false`]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.logger.loggerStrings.fatal
    - typingsSlinky.logger.loggerStrings.error
    - typingsSlinky.logger.loggerStrings.warn
    - typingsSlinky.logger.loggerStrings.info
    - typingsSlinky.logger.loggerStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def debug: typingsSlinky.logger.loggerStrings.debug = "debug".asInstanceOf[typingsSlinky.logger.loggerStrings.debug]
    
    @scala.inline
    def error: typingsSlinky.logger.loggerStrings.error = "error".asInstanceOf[typingsSlinky.logger.loggerStrings.error]
    
    @scala.inline
    def fatal: typingsSlinky.logger.loggerStrings.fatal = "fatal".asInstanceOf[typingsSlinky.logger.loggerStrings.fatal]
    
    @scala.inline
    def info: typingsSlinky.logger.loggerStrings.info = "info".asInstanceOf[typingsSlinky.logger.loggerStrings.info]
    
    @scala.inline
    def warn: typingsSlinky.logger.loggerStrings.warn = "warn".asInstanceOf[typingsSlinky.logger.loggerStrings.warn]
  }
}
