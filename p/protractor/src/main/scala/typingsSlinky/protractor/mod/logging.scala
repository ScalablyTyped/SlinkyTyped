package typingsSlinky.protractor.mod

import typingsSlinky.seleniumWebdriver.loggingMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logging {
  
  @JSImport("protractor", "logging.Entry")
  @js.native
  class Entry protected ()
    extends typingsSlinky.seleniumWebdriver.mod.logging.Entry {
    def this(level: String, message: String) = this()
    def this(level: Double, message: String) = this()
    /**
      * @param {(!logging.Level|string)} level The entry level.
      * @param {string} message The log message.
      * @param {number=} opt_timestamp The time this entry was generated, in
      *     milliseconds since 0:00:00, January 1, 1970 UTC. If omitted, the
      *     current time will be used.
      * @param {string=} opt_type The log type, if known.
      * @constructor
      */
    def this(level: typingsSlinky.seleniumWebdriver.loggingMod.Level, message: String) = this()
    def this(level: String, message: String, opt_timestamp: Double) = this()
    def this(level: Double, message: String, opt_timestamp: Double) = this()
    def this(level: typingsSlinky.seleniumWebdriver.loggingMod.Level, message: String, opt_timestamp: Double) = this()
    def this(level: String, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: IType) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(
      level: typingsSlinky.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: js.UndefOr[scala.Nothing],
      opt_type: String
    ) = this()
    def this(
      level: typingsSlinky.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: js.UndefOr[scala.Nothing],
      opt_type: IType
    ) = this()
    def this(
      level: typingsSlinky.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: String
    ) = this()
    def this(
      level: typingsSlinky.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: IType
    ) = this()
  }
  
  @JSImport("protractor", "logging.Level")
  @js.native
  class Level protected ()
    extends typingsSlinky.seleniumWebdriver.mod.logging.Level {
    /**
      * @param {string} name the level's name.
      * @param {number} level the level's numeric value.
      */
    def this(name: String, level: Double) = this()
  }
  /* static members */
  object Level {
    
    @JSImport("protractor", "logging.Level")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates all log messages should be recorded.
      * @const
      */
    @JSImport("protractor", "logging.Level.ALL")
    @js.native
    def ALL: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def ALL_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `700` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.DEBUG")
    @js.native
    def DEBUG: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def DEBUG_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `500` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.FINE")
    @js.native
    def FINE: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    
    /**
      * Log messages with a level of `400` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.FINER")
    @js.native
    def FINER: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def FINER_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINER")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `300` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.FINEST")
    @js.native
    def FINEST: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def FINEST_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINEST")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def FINE_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `800` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.INFO")
    @js.native
    def INFO: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def INFO_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates no log messages should be recorded.
      * @const
      */
    @JSImport("protractor", "logging.Level.OFF")
    @js.native
    def OFF: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def OFF_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFF")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `1000` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.SEVERE")
    @js.native
    def SEVERE: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def SEVERE_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEVERE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `900` or higher.
      * @const
      */
    @JSImport("protractor", "logging.Level.WARNING")
    @js.native
    def WARNING: typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def WARNING_=(x: typingsSlinky.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("protractor", "logging.LogManager")
  @js.native
  class LogManager ()
    extends typingsSlinky.seleniumWebdriver.mod.logging.LogManager
  
  @JSImport("protractor", "logging.Logger")
  @js.native
  class Logger protected ()
    extends typingsSlinky.seleniumWebdriver.mod.logging.Logger {
    /**
      * @param {string} name the name of this logger.
      * @param {Level=} opt_level the initial level for this logger.
      */
    def this(name: String) = this()
    def this(name: String, opt_level: typingsSlinky.seleniumWebdriver.loggingMod.Level) = this()
  }
  
  @JSImport("protractor", "logging.Preferences")
  @js.native
  class Preferences ()
    extends typingsSlinky.seleniumWebdriver.mod.logging.Preferences
  
  @JSImport("protractor", "logging.Type")
  @js.native
  val Type: IType = js.native
  
  @JSImport("protractor", "logging.addConsoleHandler")
  @js.native
  def addConsoleHandler(): Unit = js.native
  @JSImport("protractor", "logging.addConsoleHandler")
  @js.native
  def addConsoleHandler(opt_logger: typingsSlinky.seleniumWebdriver.loggingMod.Logger): Unit = js.native
  
  @JSImport("protractor", "logging.getLevel")
  @js.native
  def getLevel(nameOrValue: String): typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
  @JSImport("protractor", "logging.getLevel")
  @js.native
  def getLevel(nameOrValue: Double): typingsSlinky.seleniumWebdriver.loggingMod.Level = js.native
  
  @JSImport("protractor", "logging.getLogger")
  @js.native
  def getLogger(): typingsSlinky.seleniumWebdriver.loggingMod.Logger = js.native
  @JSImport("protractor", "logging.getLogger")
  @js.native
  def getLogger(name: String): typingsSlinky.seleniumWebdriver.loggingMod.Logger = js.native
  
  @JSImport("protractor", "logging.installConsoleHandler")
  @js.native
  def installConsoleHandler(): Unit = js.native
  
  @JSImport("protractor", "logging.removeConsoleHandler")
  @js.native
  def removeConsoleHandler(): Unit = js.native
  @JSImport("protractor", "logging.removeConsoleHandler")
  @js.native
  def removeConsoleHandler(opt_logger: typingsSlinky.seleniumWebdriver.loggingMod.Logger): Unit = js.native
}
