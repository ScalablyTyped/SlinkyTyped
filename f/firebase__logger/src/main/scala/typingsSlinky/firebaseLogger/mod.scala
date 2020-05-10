package typingsSlinky.firebaseLogger

import typingsSlinky.firebaseLogger.loggerMod.LogCallback
import typingsSlinky.firebaseLogger.loggerMod.LogLevel
import typingsSlinky.firebaseLogger.loggerMod.LogLevelString
import typingsSlinky.firebaseLogger.loggerMod.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  def setLogLevel(level: LogLevel): Unit = js.native
  def setLogLevel(level: LogLevelString): Unit = js.native
  def setUserLogHandler(): Unit = js.native
  def setUserLogHandler(logCallback: Null, options: LogOptions): Unit = js.native
  def setUserLogHandler(logCallback: LogCallback): Unit = js.native
  def setUserLogHandler(logCallback: LogCallback, options: LogOptions): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    /* 0 */ val DEBUG: typingsSlinky.firebaseLogger.loggerMod.LogLevel.DEBUG with Double = js.native
    /* 4 */ val ERROR: typingsSlinky.firebaseLogger.loggerMod.LogLevel.ERROR with Double = js.native
    /* 2 */ val INFO: typingsSlinky.firebaseLogger.loggerMod.LogLevel.INFO with Double = js.native
    /* 5 */ val SILENT: typingsSlinky.firebaseLogger.loggerMod.LogLevel.SILENT with Double = js.native
    /* 1 */ val VERBOSE: typingsSlinky.firebaseLogger.loggerMod.LogLevel.VERBOSE with Double = js.native
    /* 3 */ val WARN: typingsSlinky.firebaseLogger.loggerMod.LogLevel.WARN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.firebaseLogger.loggerMod.LogLevel with Double] = js.native
  }
  
}

