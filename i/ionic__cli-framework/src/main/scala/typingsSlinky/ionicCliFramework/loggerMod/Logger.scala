package typingsSlinky.ionicCliFramework.loggerMod

import typingsSlinky.ionicCliFramework.anon.PartialLoggerOptions
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/logger", "Logger")
@js.native
class Logger () extends js.Object {
  def this(hasLevelHandlers: LoggerOptions) = this()
  
  def clone(opts: PartialLoggerOptions): Logger = js.native
  
  def createRecord(msg: String): LogRecord = js.native
  def createRecord(msg: String, level: js.UndefOr[scala.Nothing], format: Boolean): LogRecord = js.native
  def createRecord(msg: String, level: LoggerLevelWeight): LogRecord = js.native
  def createRecord(msg: String, level: LoggerLevelWeight, format: Boolean): LogRecord = js.native
  
  def createWriteStream(): WritableStream = js.native
  def createWriteStream(level: js.UndefOr[scala.Nothing], format: Boolean): WritableStream = js.native
  def createWriteStream(level: LoggerLevelWeight): WritableStream = js.native
  def createWriteStream(level: LoggerLevelWeight, format: Boolean): WritableStream = js.native
  
  /**
    * Log a message using the `debug` logger level.
    *
    * @param msg The string to log.
    */
  def debug(msg: String): Unit = js.native
  
  /**
    * Log a message using the `error` logger level.
    *
    * @param msg The string to log.
    */
  def error(msg: String): Unit = js.native
  
  var handlers: Set[LoggerHandler] = js.native
  
  /**
    * Log a message using the `info` logger level.
    *
    * @param msg The string to log.
    */
  def info(msg: String): Unit = js.native
  
  var level: LoggerLevelWeight = js.native
  
  /**
    * Log a record using a logger output found via `level`.
    */
  def log(record: LogRecord): Unit = js.native
  
  /**
    * Log a message as-is.
    *
    * @param msg The string to log.
    */
  def msg(msg: String): Unit = js.native
  
  /**
    * Log newlines using a logger output found via `level`.
    *
    * @param num The number of newlines to log.
    * @param level The logger level. If omitted, the default output is used.
    */
  def nl(): Unit = js.native
  def nl(num: js.UndefOr[scala.Nothing], level: LoggerLevelWeight): Unit = js.native
  def nl(num: Double): Unit = js.native
  def nl(num: Double, level: LoggerLevelWeight): Unit = js.native
  
  /**
    * Log a message using the `warn` logger level.
    *
    * @param msg The string to log.
    */
  def warn(msg: String): Unit = js.native
}
/* static members */
@JSImport("@ionic/cli-framework/lib/logger", "Logger")
@js.native
object Logger extends js.Object {
  
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}
