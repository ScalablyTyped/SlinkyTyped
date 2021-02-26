package typingsSlinky.protractor

import typingsSlinky.protractor.loggerMod.Logger
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exitCodesMod {
  
  @JSImport("protractor/built/exitCodes", "BrowserError")
  @js.native
  class BrowserError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
  }
  /* static members */
  object BrowserError {
    
    @JSImport("protractor/built/exitCodes", "BrowserError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("protractor/built/exitCodes", "BrowserError.CODE")
    @js.native
    def CODE: Double = js.native
    @scala.inline
    def CODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("protractor/built/exitCodes", "BrowserError.ERR_MSGS")
    @js.native
    def ERR_MSGS: js.Array[String] = js.native
    @scala.inline
    def ERR_MSGS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MSGS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("protractor/built/exitCodes", "ConfigError")
  @js.native
  class ConfigError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
    def this(logger: Logger, message: String, error: js.Error) = this()
  }
  /* static members */
  object ConfigError {
    
    @JSImport("protractor/built/exitCodes", "ConfigError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("protractor/built/exitCodes", "ConfigError.CODE")
    @js.native
    def CODE: Double = js.native
    @scala.inline
    def CODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("protractor/built/exitCodes", "ErrorHandler")
  @js.native
  class ErrorHandler () extends StObject
  /* static members */
  object ErrorHandler {
    
    @JSImport("protractor/built/exitCodes", "ErrorHandler.isError")
    @js.native
    def isError(errMsgs: js.Array[String], e: js.Error): Boolean = js.native
    
    @JSImport("protractor/built/exitCodes", "ErrorHandler.parseError")
    @js.native
    def parseError(e: js.Error): Double = js.native
  }
  
  @JSImport("protractor/built/exitCodes", "IError")
  @js.native
  class IError () extends Error {
    
    var code: js.UndefOr[Double] = js.native
  }
  
  @JSImport("protractor/built/exitCodes", "ProtractorError")
  @js.native
  class ProtractorError protected () extends IError {
    def this(logger: Logger, message: String, code: Double) = this()
    def this(logger: Logger, message: String, code: Double, error: js.Error) = this()
  }
  /* static members */
  object ProtractorError {
    
    @JSImport("protractor/built/exitCodes", "ProtractorError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("protractor/built/exitCodes", "ProtractorError.CODE")
    @js.native
    def CODE: Double = js.native
    @scala.inline
    def CODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("protractor/built/exitCodes", "ProtractorError.ERR_MSGS")
    @js.native
    def ERR_MSGS: js.Array[String] = js.native
    @scala.inline
    def ERR_MSGS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_MSGS")(x.asInstanceOf[js.Any])
    
    @JSImport("protractor/built/exitCodes", "ProtractorError.SUPRESS_EXIT_CODE")
    @js.native
    def SUPRESS_EXIT_CODE: Boolean = js.native
    @scala.inline
    def SUPRESS_EXIT_CODE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPRESS_EXIT_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("protractor/built/exitCodes", "ProtractorError.log")
    @js.native
    def log(logger: Logger, code: Double, message: String, stack: String): Unit = js.native
  }
}
