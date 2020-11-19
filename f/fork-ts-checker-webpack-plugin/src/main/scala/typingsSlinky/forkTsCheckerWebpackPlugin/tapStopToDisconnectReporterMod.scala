package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import typingsSlinky.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/hooks/tapStopToDisconnectReporter", JSImport.Namespace)
@js.native
object tapStopToDisconnectReporterMod extends js.Object {
  
  def tapStopToDisconnectReporter(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    reporter: ReporterRpcClient,
    state: ForkTsCheckerWebpackPluginState
  ): Unit = js.native
}
