package typingsSlinky.atFirebaseLogger

import typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger", JSImport.Namespace)
@js.native
object atFirebaseLoggerMod extends js.Object {
  @js.native
  class Logger protected ()
    extends typingsSlinky.atFirebaseLogger.distSrcLoggerMod.Logger {
    /**
      * Gives you an instance of a Logger to capture messages according to
      * Firebase's logging scheme.
      *
      * @param name The name that the logs will be associated with
      */
    def this(name: String) = this()
  }
  
  def setLogLevel(level: LogLevel): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    /* 0 */ val DEBUG: typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel.DEBUG with Double = js.native
    /* 4 */ val ERROR: typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel.ERROR with Double = js.native
    /* 2 */ val INFO: typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel.INFO with Double = js.native
    /* 5 */ val SILENT: typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel.SILENT with Double = js.native
    /* 1 */ val VERBOSE: typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel.VERBOSE with Double = js.native
    /* 3 */ val WARN: typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel.WARN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.atFirebaseLogger.distSrcLoggerMod.LogLevel with Double] = js.native
  }
  
}

