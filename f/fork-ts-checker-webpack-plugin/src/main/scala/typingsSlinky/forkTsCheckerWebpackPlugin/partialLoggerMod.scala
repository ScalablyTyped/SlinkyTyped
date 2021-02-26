package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialLoggerMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/PartialLogger", "createPartialLogger")
  @js.native
  def createPartialLogger(methods: js.Array[LoggerMethods], logger: Logger): Logger = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.info
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.log
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
  */
  trait LoggerMethods extends StObject
  object LoggerMethods {
    
    @scala.inline
    def error: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error = "error".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error]
    
    @scala.inline
    def info: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.info = "info".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.info]
    
    @scala.inline
    def log: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.log = "log".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.log]
  }
}
