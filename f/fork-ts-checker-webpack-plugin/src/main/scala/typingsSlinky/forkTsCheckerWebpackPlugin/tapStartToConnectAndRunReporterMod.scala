package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginConfigurationMod.ForkTsCheckerWebpackPluginConfiguration
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import typingsSlinky.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tapStartToConnectAndRunReporter", JSImport.Namespace)
@js.native
object tapStartToConnectAndRunReporterMod extends js.Object {
  
  def tapStartToConnectAndRunReporter(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    reporter: ReporterRpcClient,
    configuration: ForkTsCheckerWebpackPluginConfiguration,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = js.native
}
