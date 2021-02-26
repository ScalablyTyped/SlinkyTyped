package typingsSlinky.jupyterlabLogconsole

import typingsSlinky.jupyterlabLogconsole.anon.LastModel
import typingsSlinky.jupyterlabLogconsole.anon.Level
import typingsSlinky.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typingsSlinky.jupyterlabLogconsole.tokensMod.IContentChange
import typingsSlinky.jupyterlabLogconsole.tokensMod.ILogger
import typingsSlinky.jupyterlabLogconsole.tokensMod.IStateChange
import typingsSlinky.jupyterlabLogconsole.tokensMod.LogLevel
import typingsSlinky.jupyterlabNbformat.mod.IOutput
import typingsSlinky.jupyterlabOutputarea.mod.OutputAreaModel
import typingsSlinky.jupyterlabRendermime.mod.OutputModel
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@jupyterlab/logconsole/lib/logger", "LogOutputModel")
  @js.native
  class LogOutputModel protected ()
    extends OutputModel
       with ILogOutputModel {
    /**
      * Construct a LogOutputModel.
      *
      * @param options - The model initialization options.
      */
    def this(options: IOptions) = this()
  }
  /**
    * Log Output Model namespace that defines initialization options.
    */
  object LogOutputModel {
    
    @js.native
    trait IOptions
      extends typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
    object IOptions {
      
      @scala.inline
      def apply(value: IOutput): IOptions = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
    }
  }
  
  @JSImport("@jupyterlab/logconsole/lib/logger", "Logger")
  @js.native
  class Logger protected () extends ILogger {
    /**
      * Construct a Logger.
      *
      * @param source - The name of the log source.
      */
    def this(options: typingsSlinky.jupyterlabLogconsole.loggerMod.Logger.IOptions) = this()
    
    var _contentChanged: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _level: js.Any = js.native
    
    var _log: js.Any = js.native
    
    var _rendermime: js.Any = js.native
    
    var _stateChanged: js.Any = js.native
    
    var _version: js.Any = js.native
    
    /**
      * A signal emitted when the list of log messages changes.
      */
    @JSName("contentChanged")
    def contentChanged_MLogger: ISignal[this.type, IContentChange] = js.native
    
    /**
      * Whether the logger is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MLogger: Boolean = js.native
    
    /**
      * Number of outputs logged.
      */
    @JSName("length")
    def length_MLogger: Double = js.native
    
    /**
      * The level of outputs logged
      */
    @JSName("level")
    def level_MLogger: LogLevel = js.native
    
    /**
      * The maximum number of outputs stored.
      *
      * #### Notes
      * Oldest entries will be trimmed to ensure the length is at most
      * `.maxLength`.
      */
    @JSName("maxLength")
    def maxLength_MLogger: Double = js.native
    
    /**
      * The output area model used for the logger.
      *
      * #### Notes
      * This will usually not be accessed directly. It is a public attribute so
      * that the renderer can access it.
      */
    @JSName("outputAreaModel")
    val outputAreaModel_Logger: LoggerOutputAreaModel = js.native
    
    /**
      * Rendermime to use when rendering outputs logged.
      */
    @JSName("rendermime")
    def rendermime_MLogger: IRenderMimeRegistry | Null = js.native
    
    /**
      * A signal emitted when the log state changes.
      */
    @JSName("stateChanged")
    def stateChanged_MLogger: ISignal[this.type, IStateChange] = js.native
    
    /**
      * The number of messages that have ever been stored.
      */
    @JSName("version")
    def version_MLogger: Double = js.native
  }
  object Logger {
    
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The maximum number of messages to store.
        */
      var maxLength: Double = js.native
      
      /**
        * The log source identifier.
        */
      var source: String = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(maxLength: Double, source: String): typingsSlinky.jupyterlabLogconsole.loggerMod.Logger.IOptions = {
        val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.jupyterlabLogconsole.loggerMod.Logger.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.jupyterlabLogconsole.loggerMod.Logger.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
  - typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel because Already inherited
  - typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerOutputAreaModel because var conflicts: trusted. Inlined maxLength */ @JSImport("@jupyterlab/logconsole/lib/logger", "LoggerOutputAreaModel")
  @js.native
  class LoggerOutputAreaModel protected () extends OutputAreaModel {
    def this(hasMaxLengthOptions: typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions) = this()
    
    /**
      * Manually apply length limit.
      */
    var _applyMaxLength: js.Any = js.native
    
    var _maxLength: js.Any = js.native
    
    /**
      * Maximum number of outputs to store in the model.
      */
    def maxLength: Double = js.native
    def maxLength_=(value: Double): Unit = js.native
    /**
      * The maximum number of outputs to store.
      */
    @JSName("maxLength")
    var maxLength_FLoggerOutputAreaModel: Double = js.native
    
    /**
      * Whether an output should combine with the previous output.
      *
      * We combine if the two outputs are in the same second, which is the
      * resolution for our time display.
      */
    /* protected */ def shouldCombine(options: LastModel): Boolean = js.native
  }
  object LoggerOutputAreaModel {
    
    @js.native
    trait IOptions
      extends typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions {
      
      /**
        * The maximum number of messages stored.
        */
      var maxLength: Double = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(maxLength: Double): typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions = {
        val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * All severity levels, including an internal one for metadata.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata
    - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical
    - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error
    - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning
    - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info
    - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug
  */
  trait FullLogLevel extends StObject
  object FullLogLevel {
    
    @scala.inline
    def critical: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical = "critical".asInstanceOf[typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical]
    
    @scala.inline
    def debug: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug = "debug".asInstanceOf[typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug]
    
    @scala.inline
    def error: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error = "error".asInstanceOf[typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error]
    
    @scala.inline
    def info: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info = "info".asInstanceOf[typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info]
    
    @scala.inline
    def metadata: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata = "metadata".asInstanceOf[typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata]
    
    @scala.inline
    def warning: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = "warning".asInstanceOf[typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning]
  }
  
  /**
    * Custom Notebook Output with log info.
    */
  type ILogOutput = IOutput with Level
  
  @js.native
  trait ILogOutputModel extends IOutputModel {
    
    /**
      * Log level
      */
    val level: FullLogLevel = js.native
    
    /**
      * Date & time when output is logged.
      */
    val timestamp: js.Date = js.native
  }
  object ILogOutputModel {
    
    @scala.inline
    def apply(
      changed: ISignal[ILogOutputModel, Unit],
      data: ReadonlyPartialJSONObject,
      dispose: () => Unit,
      level: FullLogLevel,
      metadata: ReadonlyPartialJSONObject,
      setData: ISetDataOptions => Unit,
      timestamp: js.Date,
      toJSON: () => IOutput,
      trusted: Boolean,
      `type`: String
    ): ILogOutputModel = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), level = level.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), timestamp = timestamp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogOutputModel]
    }
    
    @scala.inline
    implicit class ILogOutputModelMutableBuilder[Self <: ILogOutputModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: FullLogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
