package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typingsSlinky.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typingsSlinky.forkTsCheckerWebpackPlugin.reporterRpcClientMod.ReporterRpcClient
import typingsSlinky.forkTsCheckerWebpackPlugin.reporterRpcServiceMod.ReporterRpcService
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter", JSImport.Namespace)
@js.native
object reporterMod extends js.Object {
  
  /**
    * Computes aggregated files change based on the subsequent files changes.
    *
    * @param changes List of subsequent files changes
    * @returns Files change that represents all subsequent changes as a one event
    */
  def aggregateFilesChanges(changes: js.Array[FilesChange]): FilesChange = js.native
  
  def composeReporterRpcClients(clients: js.Array[ReporterRpcClient]): ReporterRpcClient = js.native
  
  /**
    * This higher order reporter aggregates too frequent getReport requests to avoid unnecessary computation.
    */
  def createAggregatedReporter[TReporter /* <: Reporter */](reporter: TReporter): TReporter = js.native
  
  def createReporterRpcClient[TConfiguration /* <: js.Object */](channel: RpcMessageChannel, configuration: TConfiguration): ReporterRpcClient = js.native
  
  def registerReporterRpcService[TConfiguration /* <: js.Object */](
    servicePort: RpcMessagePort,
    reporterFactory: js.Function1[/* configuration */ TConfiguration, Reporter]
  ): ReporterRpcService = js.native
}
