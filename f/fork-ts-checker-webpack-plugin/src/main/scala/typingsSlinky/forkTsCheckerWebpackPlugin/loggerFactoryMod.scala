package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerFactoryMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/LoggerFactory", "createLogger")
  @js.native
  def createLogger(
    `type`: LoggerType,
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Logger = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/logger/LoggerFactory", "createLogger")
  @js.native
  def createLogger(
    `type`: Logger,
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Logger = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.console
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`webpack-infrastructure`
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.silent
  */
  trait LoggerType extends StObject
  object LoggerType {
    
    @scala.inline
    def console: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.console = "console".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.console]
    
    @scala.inline
    def silent: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.silent = "silent".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.silent]
    
    @scala.inline
    def `webpack-infrastructure`: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`webpack-infrastructure` = "webpack-infrastructure".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`webpack-infrastructure`]
  }
}
