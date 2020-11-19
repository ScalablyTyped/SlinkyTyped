package typingsSlinky.firebaseLogger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/logger/dist/src/logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  /**
    * Gives you an instance of a Logger to capture messages according to
    * Firebase's logging scheme.
    *
    * @param name The name that the logs will be associated with
    */
  def this(name: String) = this()
  
  /**
    * The main (internal) log handler for the Logger instance.
    * Can be set to a new function in internal package code but not by user.
    */
  var _logHandler: js.Any = js.native
  
  /**
    * The log level of the given Logger instance.
    */
  var _logLevel: js.Any = js.native
  
  /**
    * The optional, additional, user-defined log handler for the Logger instance.
    */
  var _userLogHandler: js.Any = js.native
  
  /**
    * The functions below are all based on the `console` interface
    */
  def debug(args: js.Any*): Unit = js.native
  
  def error(args: js.Any*): Unit = js.native
  
  def info(args: js.Any*): Unit = js.native
  
  def log(args: js.Any*): Unit = js.native
  
  def logHandler: LogHandler = js.native
  def logHandler_=(`val`: LogHandler): Unit = js.native
  
  def logLevel: LogLevel = js.native
  def logLevel_=(`val`: LogLevel): Unit = js.native
  
  var name: String = js.native
  
  def setLogLevel(`val`: LogLevel): Unit = js.native
  def setLogLevel(`val`: LogLevelString): Unit = js.native
  
  def userLogHandler: LogHandler | Null = js.native
  def userLogHandler_=(`val`: LogHandler | Null): Unit = js.native
  
  def warn(args: js.Any*): Unit = js.native
}
