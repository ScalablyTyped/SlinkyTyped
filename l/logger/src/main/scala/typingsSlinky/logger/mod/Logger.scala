package typingsSlinky.logger.mod

import typingsSlinky.logger.loggerBooleans.`false`
import typingsSlinky.logger.loggerStrings.debug
import typingsSlinky.logger.loggerStrings.error
import typingsSlinky.logger.loggerStrings.fatal
import typingsSlinky.logger.loggerStrings.info
import typingsSlinky.logger.loggerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logger", "Logger")
@js.native
class Logger () extends js.Object {
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
@JSImport("logger", "Logger")
@js.native
object Logger extends js.Object {
  
  val levels: js.Tuple5[fatal, error, warn, info, debug] = js.native
}
