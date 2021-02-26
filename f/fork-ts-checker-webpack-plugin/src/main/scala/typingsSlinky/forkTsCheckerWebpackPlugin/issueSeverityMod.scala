package typingsSlinky.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueSeverityMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity", "compareIssueSeverities")
  @js.native
  def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity", "isIssueSeverity")
  @js.native
  def isIssueSeverity(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity.IssueSeverity */ Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
    - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning
  */
  trait IssueSeverity extends StObject
  object IssueSeverity {
    
    @scala.inline
    def error: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error = "error".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error]
    
    @scala.inline
    def warning: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning = "warning".asInstanceOf[typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning]
  }
}
