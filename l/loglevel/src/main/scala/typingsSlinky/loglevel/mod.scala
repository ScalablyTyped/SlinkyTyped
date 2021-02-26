package typingsSlinky.loglevel

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.loglevel.loglevelNumbers.`0`
import typingsSlinky.loglevel.loglevelNumbers.`1`
import typingsSlinky.loglevel.loglevelNumbers.`2`
import typingsSlinky.loglevel.loglevelNumbers.`3`
import typingsSlinky.loglevel.loglevelNumbers.`4`
import typingsSlinky.loglevel.loglevelNumbers.`5`
import typingsSlinky.loglevel.loglevelStrings.debug_
import typingsSlinky.loglevel.loglevelStrings.error_
import typingsSlinky.loglevel.loglevelStrings.info_
import typingsSlinky.loglevel.loglevelStrings.silent_
import typingsSlinky.loglevel.loglevelStrings.trace_
import typingsSlinky.loglevel.loglevelStrings.warn_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("loglevel", JSImport.Namespace)
  @js.native
  val ^ : RootLogger = js.native
  
  /**
    * Log levels
    */
  @js.native
  trait LogLevel extends StObject {
    
    var DEBUG: `1` = js.native
    
    var ERROR: `4` = js.native
    
    var INFO: `2` = js.native
    
    var SILENT: `5` = js.native
    
    var TRACE: `0` = js.native
    
    var WARN: `3` = js.native
  }
  object LogLevel {
    
    @scala.inline
    def apply(DEBUG: `1`, ERROR: `4`, INFO: `2`, SILENT: `5`, TRACE: `0`, WARN: `3`): LogLevel = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogLevel]
    }
    
    @scala.inline
    implicit class LogLevelMutableBuilder[Self <: LogLevel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEBUG(value: `1`): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: `4`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: `2`): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSILENT(value: `5`): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRACE(value: `0`): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARN(value: `3`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Possible log level descriptors, may be string, lower or upper case, or number.
    */
  /* Inlined loglevel.loglevel.LogLevelNumbers | 'trace' | 'debug' | 'info' | 'warn' | 'error' | 'silent' | keyof loglevel.loglevel.LogLevel */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.loglevel.loglevelNumbers.`3`
    - typingsSlinky.loglevel.loglevelNumbers.`2`
    - typingsSlinky.loglevel.loglevelNumbers.`4`
    - typingsSlinky.loglevel.loglevelNumbers.`0`
    - typingsSlinky.loglevel.loglevelNumbers.`5`
    - typingsSlinky.loglevel.loglevelNumbers.`1`
    - typingsSlinky.loglevel.loglevelStrings.DEBUG
    - typingsSlinky.loglevel.loglevelStrings.info_
    - typingsSlinky.loglevel.loglevelStrings.INFO
    - typingsSlinky.loglevel.loglevelStrings.warn_
    - typingsSlinky.loglevel.loglevelStrings.TRACE
    - typingsSlinky.loglevel.loglevelStrings.SILENT
    - typingsSlinky.loglevel.loglevelStrings.silent_
    - typingsSlinky.loglevel.loglevelStrings.WARN
    - typingsSlinky.loglevel.loglevelStrings.debug_
    - typingsSlinky.loglevel.loglevelStrings.ERROR
    - typingsSlinky.loglevel.loglevelStrings.error_
    - typingsSlinky.loglevel.loglevelStrings.trace_
  */
  trait LogLevelDesc extends StObject
  object LogLevelDesc {
    
    @scala.inline
    def `0`: typingsSlinky.loglevel.loglevelNumbers.`0` = 0.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`0`]
    
    @scala.inline
    def `1`: typingsSlinky.loglevel.loglevelNumbers.`1` = 1.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.loglevel.loglevelNumbers.`2` = 2.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.loglevel.loglevelNumbers.`3` = 3.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.loglevel.loglevelNumbers.`4` = 4.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.loglevel.loglevelNumbers.`5` = 5.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`5`]
    
    @scala.inline
    def DEBUG: typingsSlinky.loglevel.loglevelStrings.DEBUG = "DEBUG".asInstanceOf[typingsSlinky.loglevel.loglevelStrings.DEBUG]
    
    @scala.inline
    def ERROR: typingsSlinky.loglevel.loglevelStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.loglevel.loglevelStrings.ERROR]
    
    @scala.inline
    def INFO: typingsSlinky.loglevel.loglevelStrings.INFO = "INFO".asInstanceOf[typingsSlinky.loglevel.loglevelStrings.INFO]
    
    @scala.inline
    def SILENT: typingsSlinky.loglevel.loglevelStrings.SILENT = "SILENT".asInstanceOf[typingsSlinky.loglevel.loglevelStrings.SILENT]
    
    @scala.inline
    def TRACE: typingsSlinky.loglevel.loglevelStrings.TRACE = "TRACE".asInstanceOf[typingsSlinky.loglevel.loglevelStrings.TRACE]
    
    @scala.inline
    def WARN: typingsSlinky.loglevel.loglevelStrings.WARN = "WARN".asInstanceOf[typingsSlinky.loglevel.loglevelStrings.WARN]
    
    @scala.inline
    def debug: debug_ = "debug".asInstanceOf[debug_]
    
    @scala.inline
    def error: error_ = "error".asInstanceOf[error_]
    
    @scala.inline
    def info: info_ = "info".asInstanceOf[info_]
    
    @scala.inline
    def silent: silent_ = "silent".asInstanceOf[silent_]
    
    @scala.inline
    def trace: trace_ = "trace".asInstanceOf[trace_]
    
    @scala.inline
    def warn: warn_ = "warn".asInstanceOf[warn_]
  }
  
  /**
    * Possible log level numbers.
    */
  /* Inlined loglevel.loglevel.LogLevel[keyof loglevel.loglevel.LogLevel] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.loglevel.loglevelNumbers.`3`
    - typingsSlinky.loglevel.loglevelNumbers.`2`
    - typingsSlinky.loglevel.loglevelNumbers.`4`
    - typingsSlinky.loglevel.loglevelNumbers.`0`
    - typingsSlinky.loglevel.loglevelNumbers.`5`
    - typingsSlinky.loglevel.loglevelNumbers.`1`
  */
  trait LogLevelNumbers extends StObject
  object LogLevelNumbers {
    
    @scala.inline
    def `0`: typingsSlinky.loglevel.loglevelNumbers.`0` = 0.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`0`]
    
    @scala.inline
    def `1`: typingsSlinky.loglevel.loglevelNumbers.`1` = 1.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.loglevel.loglevelNumbers.`2` = 2.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.loglevel.loglevelNumbers.`3` = 3.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.loglevel.loglevelNumbers.`4` = 4.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.loglevel.loglevelNumbers.`5` = 5.asInstanceOf[typingsSlinky.loglevel.loglevelNumbers.`5`]
  }
  
  @js.native
  trait Logger extends StObject {
    
    /**
      * Output debug message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def debug(msg: js.Any*): Unit = js.native
    
    /**
      * This disables all log messages, and is equivalent to log.setLevel("silent").
      *
      * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
      *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
      *     false as the optional 'persist' second argument, persistence will be skipped.
      */
    def disableAll(): Unit = js.native
    def disableAll(persist: Boolean): Unit = js.native
    
    /**
      * This enables all log messages, and is equivalent to log.setLevel("trace").
      *
      * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
      *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
      *     false as the optional 'persist' second argument, persistence will be skipped.
      */
    def enableAll(): Unit = js.native
    def enableAll(persist: Boolean): Unit = js.native
    
    /**
      * Output error message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def error(msg: js.Any*): Unit = js.native
    
    /**
      * Returns the current logging level, as a value from LogLevel.
      * It's very unlikely you'll need to use this for normal application logging; it's provided partly to help plugin
      * development, and partly to let you optimize logging code as below, where debug data is only generated if the
      * level is set such that it'll actually be logged. This probably doesn't affect you, unless you've run profiling
      * on your code and you have hard numbers telling you that your log data generation is a real performance problem.
      */
    def getLevel(): `3` | `2` | `4` | `0` | `5` | `1` = js.native
    
    /**
      * Output info message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def info(msg: js.Any*): Unit = js.native
    
    /**
      * Available log levels.
      */
    val levels: LogLevel = js.native
    
    /**
      * Output debug message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def log(msg: js.Any*): Unit = js.native
    
    /**
      * Plugin API entry point. This will be called for each enabled method each time the level is set
      * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
      * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
      * recommended that this wraps the initially provided value of log.methodFactory
      */
    def methodFactory(methodName: String, level: LogLevelNumbers, loggerName: String): LoggingMethod = js.native
    /**
      * Plugin API entry point. This will be called for each enabled method each time the level is set
      * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
      * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
      * recommended that this wraps the initially provided value of log.methodFactory
      */
    @JSName("methodFactory")
    var methodFactory_Original: MethodFactory = js.native
    
    /**
      * This sets the current log level only if one has not been persisted and can’t be loaded. This is useful when
      * initializing scripts; if a developer or user has previously called setLevel(), this won’t alter their settings.
      * For example, your application might set the log level to error in a production environment, but when debugging
      * an issue, you might call setLevel("trace") on the console to see all the logs. If that error setting was set
      * using setDefaultLevel(), it will still say as trace on subsequent page loads and refreshes instead of resetting
      * to error.
      *
      * The level argument takes is the same values that you might pass to setLevel(). Levels set using
      * setDefaultLevel() never persist to subsequent page loads.
      *
      * @param level as a string, like 'error' (case-insensitive) or as a number from 0 to 5 (or as log.levels. values)
      */
    def setDefaultLevel(level: LogLevelDesc): Unit = js.native
    
    /**
      * This disables all logging below the given level, so that after a log.setLevel("warn") call log.warn("something")
      * or log.error("something") will output messages, but log.info("something") will not.
      *
      * @param level as a string, like 'error' (case-insensitive) or as a number from 0 to 5 (or as log.levels. values)
      * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
      *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
      *     false as the optional 'persist' second argument, persistence will be skipped.
      */
    def setLevel(level: LogLevelDesc): Unit = js.native
    def setLevel(level: LogLevelDesc, persist: Boolean): Unit = js.native
    
    /**
      * Output trace message to console.
      * This will also include a full stack trace
      *
      * @param msg any data to log to the console
      */
    def trace(msg: js.Any*): Unit = js.native
    
    /**
      * Output warn message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def warn(msg: js.Any*): Unit = js.native
  }
  
  type LoggingMethod = js.Function1[/* repeated */ js.Any, Unit]
  
  type MethodFactory = js.Function3[
    /* methodName */ String, 
    /* level */ LogLevelNumbers, 
    /* loggerName */ String, 
    LoggingMethod
  ]
  
  @js.native
  trait RootLogger extends Logger {
    
    /**
      * A .default property for ES6 default import compatibility
      */
    var default: RootLogger = js.native
    
    /**
      * This gets you a new logger object that works exactly like the root log object, but can have its level and
      * logging methods set independently. All loggers must have a name (which is a non-empty string). Calling
      * getLogger() multiple times with the same name will return an identical logger object.
      * In large applications, it can be incredibly useful to turn logging on and off for particular modules as you are
      * working with them. Using the getLogger() method lets you create a separate logger for each part of your
      * application with its own logging level. Likewise, for small, independent modules, using a named logger instead
      * of the default root logger allows developers using your module to selectively turn on deep, trace-level logging
      * when trying to debug problems, while logging only errors or silencing logging altogether under normal
      * circumstances.
      * @param name The name of the produced logger
      */
    def getLogger(name: String): Logger = js.native
    
    /**
      * This will return you the dictionary of all loggers created with getLogger, keyed off of their names.
      */
    def getLoggers(): StringDictionary[Logger] = js.native
    
    /**
      * If you're using another JavaScript library that exposes a 'log' global, you can run into conflicts with loglevel.
      * Similarly to jQuery, you can solve this by putting loglevel into no-conflict mode immediately after it is loaded
      * onto the page. This resets to 'log' global to its value before loglevel was loaded (typically undefined), and
      * returns the loglevel object, which you can then bind to another name yourself.
      */
    def noConflict(): js.Any = js.native
  }
  
  type _To = RootLogger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RootLogger = ^
}
