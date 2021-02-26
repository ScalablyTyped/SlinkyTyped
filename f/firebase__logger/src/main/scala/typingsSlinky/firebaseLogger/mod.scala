package typingsSlinky.firebaseLogger

import typingsSlinky.firebaseLogger.loggerMod.LogCallback
import typingsSlinky.firebaseLogger.loggerMod.LogLevel
import typingsSlinky.firebaseLogger.loggerMod.LogLevelString
import typingsSlinky.firebaseLogger.loggerMod.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.firebaseLogger.loggerMod.LogLevel with Double] = js.native
    
    /* 0 */ val DEBUG: typingsSlinky.firebaseLogger.loggerMod.LogLevel.DEBUG with Double = js.native
    
    /* 4 */ val ERROR: typingsSlinky.firebaseLogger.loggerMod.LogLevel.ERROR with Double = js.native
    
    /* 2 */ val INFO: typingsSlinky.firebaseLogger.loggerMod.LogLevel.INFO with Double = js.native
    
    /* 5 */ val SILENT: typingsSlinky.firebaseLogger.loggerMod.LogLevel.SILENT with Double = js.native
    
    /* 1 */ val VERBOSE: typingsSlinky.firebaseLogger.loggerMod.LogLevel.VERBOSE with Double = js.native
    
    /* 3 */ val WARN: typingsSlinky.firebaseLogger.loggerMod.LogLevel.WARN with Double = js.native
  }
  
  @JSImport("@firebase/logger", "Logger")
  @js.native
  class Logger protected ()
    extends typingsSlinky.firebaseLogger.loggerMod.Logger {
    /**
      * Gives you an instance of a Logger to capture messages according to
      * Firebase's logging scheme.
      *
      * @param name The name that the logs will be associated with
      */
    def this(name: String) = this()
  }
  
  @JSImport("@firebase/logger", "setLogLevel")
  @js.native
  def setLogLevel(level: LogLevel): Unit = js.native
  @JSImport("@firebase/logger", "setLogLevel")
  @js.native
  def setLogLevel(level: LogLevelString): Unit = js.native
  
  @JSImport("@firebase/logger", "setUserLogHandler")
  @js.native
  def setUserLogHandler(): Unit = js.native
  @JSImport("@firebase/logger", "setUserLogHandler")
  @js.native
  def setUserLogHandler(logCallback: Null, options: LogOptions): Unit = js.native
  @JSImport("@firebase/logger", "setUserLogHandler")
  @js.native
  def setUserLogHandler(logCallback: LogCallback): Unit = js.native
  @JSImport("@firebase/logger", "setUserLogHandler")
  @js.native
  def setUserLogHandler(logCallback: LogCallback, options: LogOptions): Unit = js.native
}
