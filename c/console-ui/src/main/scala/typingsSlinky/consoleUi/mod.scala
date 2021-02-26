package typingsSlinky.consoleUi

import typingsSlinky.consoleUi.anon.Ci
import typingsSlinky.inquirer.mod.QuestionCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The UI provides the CLI with a unified mechanism for providing output and
    * requesting input from the user. This becomes useful when wanting to adjust
    * logLevels, or mock input/output for tests.
    */
  @JSImport("console-ui", JSImport.Namespace)
  @js.native
  class ^ () extends UI {
    def this(options: Ci) = this()
  }
  
  /**
    * The UI provides the CLI with a unified mechanism for providing output and
    * requesting input from the user. This becomes useful when wanting to adjust
    * logLevels, or mock input/output for tests.
    */
  @js.native
  trait UI extends StObject {
    
    /**
      * Launch the prompt interface (inquiry session) with (Array of Questions || Question)
      * See [Inquirer.js#question](https://github.com/SBoudrias/Inquirer.js#question) for Question properties
      */
    def prompt[T](questions: QuestionCollection[T]): js.Promise[T] = js.native
    def prompt[T](questions: QuestionCollection[T], callback: js.Function1[/* answers */ T, Unit]): js.Promise[T] = js.native
    
    /**
      * Sets the write level for the UI. Valid write levels are 'DEBUG', 'INFO',
      * 'WARNING', and 'ERROR'.
      */
    def setWriteLevel(level: WriteLevel): Unit = js.native
    
    /**
      * Begins a progress spinner with a message (only if the INFO write level is visible).
      */
    def startProgress(message: String): Unit = js.native
    
    /**
      * Ends the current progress spinner.
      */
    def stopProgress(): Unit = js.native
    
    /**
      * Unified mechanism to write a string to the console.
      * Optionally include a writeLevel, this is used to decide if the specific
      * logging mechanism should or should not be printed.
      */
    def write(message: String): Unit = js.native
    def write(message: String, level: WriteLevel): Unit = js.native
    
    /**
      * Helper method to write a string with the DEBUG writeLevel and gray chalk
      */
    def writeDebugLine(message: String): Unit = js.native
    
    /**
      * Helper method to write a string with the WARNING writeLevel and yellow chalk.
      * Optionally include a test. If falsy, the deprecation will be printed. By default deprecations
      * will be prepended with DEPRECATION text when printed.
      */
    def writeDeprecateLine(message: String): Unit = js.native
    def writeDeprecateLine(message: String, test: js.UndefOr[scala.Nothing], prepend: Boolean): Unit = js.native
    def writeDeprecateLine(message: String, test: Boolean): Unit = js.native
    def writeDeprecateLine(message: String, test: Boolean, prepend: Boolean): Unit = js.native
    
    /**
      * Unified mechanism to an Error to the console.
      * This will occure at a writeLevel of ERROR
      */
    def writeError(error: js.Object): Unit = js.native
    
    /**
      * Helper method to write a string with the INFO writeLevel and cyan chalk
      */
    def writeInfoLine(message: String): Unit = js.native
    
    /**
      * Unified mechanism to write a string and new line to the console.
      * Optionally include a writeLevel, this is used to decide if the specific
      * logging mechanism should or should not be printed.
      */
    def writeLine(message: String): Unit = js.native
    def writeLine(message: String, level: WriteLevel): Unit = js.native
    
    /**
      * Helper method to write a string with the WARNING writeLevel and yellow chalk.
      * Optionally include a test. If falsy, the warning will be printed. By default, warnings
      * will be prepended with WARNING text when printed.
      */
    def writeWarnLine(message: String): Unit = js.native
    def writeWarnLine(message: String, test: js.UndefOr[scala.Nothing], prepend: Boolean): Unit = js.native
    def writeWarnLine(message: String, test: Boolean): Unit = js.native
    def writeWarnLine(message: String, test: Boolean, prepend: Boolean): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.consoleUi.consoleUiStrings.DEBUG
    - typingsSlinky.consoleUi.consoleUiStrings.INFO
    - typingsSlinky.consoleUi.consoleUiStrings.WARNING
    - typingsSlinky.consoleUi.consoleUiStrings.ERROR
  */
  trait WriteLevel extends StObject
  object WriteLevel {
    
    @scala.inline
    def DEBUG: typingsSlinky.consoleUi.consoleUiStrings.DEBUG = "DEBUG".asInstanceOf[typingsSlinky.consoleUi.consoleUiStrings.DEBUG]
    
    @scala.inline
    def ERROR: typingsSlinky.consoleUi.consoleUiStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.consoleUi.consoleUiStrings.ERROR]
    
    @scala.inline
    def INFO: typingsSlinky.consoleUi.consoleUiStrings.INFO = "INFO".asInstanceOf[typingsSlinky.consoleUi.consoleUiStrings.INFO]
    
    @scala.inline
    def WARNING: typingsSlinky.consoleUi.consoleUiStrings.WARNING = "WARNING".asInstanceOf[typingsSlinky.consoleUi.consoleUiStrings.WARNING]
  }
}
