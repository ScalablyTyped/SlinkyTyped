package typingsSlinky.forkTsCheckerWebpackPlugin.reporterRpcServiceMod

import typingsSlinky.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcService", "registerReporterRpcService")
@js.native
object registerReporterRpcService extends js.Object {
  
  def apply[TConfiguration /* <: js.Object */](
    servicePort: RpcMessagePort,
    reporterFactory: js.Function1[/* configuration */ TConfiguration, Reporter]
  ): ReporterRpcService = js.native
}
