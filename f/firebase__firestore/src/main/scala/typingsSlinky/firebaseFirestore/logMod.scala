package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseLogger.loggerMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  def getLogLevel(): LogLevel = js.native
  def logDebug(msg: String, obj: js.Any*): Unit = js.native
  def logError(msg: String, obj: js.Any*): Unit = js.native
  def setLogLevel(newLevel: LogLevel): Unit = js.native
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

