package typingsSlinky.log4javascript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4javascript", "Logger")
@js.native
class Logger () extends js.Object {
  
  /**
  	 * Adds the given appender.
  	 */
  def addAppender(appender: Appender): Unit = js.native
  
  /**
  	 * Asserts the given expression is true or evaluates to true. If so, nothing is logged. If not, an error is logged at the ERROR level.
  	 */
  def assert(expr: js.Any): Unit = js.native
  
  /**
  	 * Logs one or more messages and optionally an error at level DEBUG.
  	 */
  def debug(messages: js.Any*): Unit = js.native
  
  /**
  	 * Logs one or more messages and optionally an error at level ERROR.
  	 */
  def error(messages: js.Any*): Unit = js.native
  
  /**
  	 * Logs one or more messages and optionally an error at level FATAL.
  	 */
  def fatal(messages: js.Any*): Unit = js.native
  
  /**
  	 * Returns whether additivity is enabled for this logger.
  	 */
  def getAdditivity(): Boolean = js.native
  
  /**
  	 * Returns all appenders which will log a message.
  	 */
  def getEffectiveAppenders(): js.Array[Appender] = js.native
  
  /**
  	 * Returns the level at which the logger is operating. This is either the level explicitly set on the logger or, if no level
  	 * has been set, the effective level of the logger's parent.
  	 */
  def getEffectiveLevel(): Level = js.native
  
  /**
  	 * Returns the level explicitly set for this logger or null if none has been set.
  	 */
  def getLevel(): Level = js.native
  
  /**
  	 * Starts a new group of log messages. In appenders that support grouping (currently PopUpAppender and InPageAppender),
  	 * a group appears as an expandable section in the console, labelled with the name specified. Specifying initiallyExpanded
  	 * determines whether the group starts off expanded (the default is true). Groups may be nested.
  	 */
  def group(name: String): Unit = js.native
  def group(name: String, initiallyExpanded: Boolean): Unit = js.native
  
  /**
  	 * Ends the current group. If there is no group then this function has no effect.
  	 */
  def groupEnd(): Unit = js.native
  
  /**
  	 * Logs one or more messages and optionally an error at level INFO.
  	 */
  def info(messages: js.Any*): Unit = js.native
  
  /**
  	 * Returns whether the logger is enabled for DEBUG messages.
  	 */
  def isDebugEnabled(): Boolean = js.native
  
  /**
  	 * Returns whether the logger is enabled for the specified level.
  	 */
  def isEnabledFor(level: Level, exception: js.Error): Boolean = js.native
  
  /**
  	 * Returns whether the logger is enabled for ERROR messages.
  	 */
  def isErrorEnabled(): Boolean = js.native
  
  /**
  	 * Returns whether the logger is enabled for FATAL messages.
  	 */
  def isFatalEnabled(): Boolean = js.native
  
  /**
  	 * Returns whether the logger is enabled for INFO messages.
  	 */
  def isInfoEnabled(): Boolean = js.native
  
  /**
  	 * Returns whether the logger is enabled for TRACE messages.
  	 */
  def isTraceEnabled(): Boolean = js.native
  
  /**
  	 * Returns whether the logger is enabled for WARN messages.
  	 */
  def isWarnEnabled(): Boolean = js.native
  
  /**
  	 * Generic logging method used by wrapper methods such as debug, error etc.
  	 */
  def log(level: Level, params: js.Array[_]): Unit = js.native
  
  var name: String = js.native
  
  /**
  	 * Clears all appenders for the current logger.
  	 */
  def removeAllAppenders(): Unit = js.native
  
  /**
  	 * Removes the given appender.
  	 */
  def removeAppender(appender: Appender): Unit = js.native
  
  /**
  	 * Sets whether appender additivity is enabled (the default) or disabled. If set to false, this particular logger will not
  	 * inherit any appenders form its ancestors. Any descendant of this logger, however, will inherit from its ancestors as
  	 * normal, unless its own additivity is explicitly set to false.
  	 * Default value is true.
  	 */
  def setAdditivity(additivity: Boolean): Unit = js.native
  
  /**
  	 * Sets the level. Log messages of a lower level than level will not be logged. Default value is DEBUG.
  	 */
  def setLevel(level: Level): Unit = js.native
  
  /**
  	 * Starts a timer with name name. When the timer is ended with a call to timeEnd using the same name, the amount of time
  	 * that has elapsed in milliseconds since the timer was started is logged at level level. If not level is supplied, the level
  	 * defaults to INFO.
  	 */
  def time(name: String): Unit = js.native
  def time(name: String, level: Level): Unit = js.native
  
  /**
  	 * Ends the timer with name name and logs the time elapsed.
  	 */
  def timeEnd(name: String): Unit = js.native
  
  /**
  	 * Logs one or more messages and optionally an error at level TRACE.
  	 */
  def trace(messages: js.Any*): Unit = js.native
  
  /**
  	 * Logs one or more messages and optionally an error at level WARN.
  	 */
  def warn(messages: js.Any*): Unit = js.native
}
