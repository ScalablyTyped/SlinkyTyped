package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typingsSlinky.forkTsCheckerWebpackPlugin.reportMod.Report
import typingsSlinky.forkTsCheckerWebpackPlugin.reporterReporterMod.Reporter
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterRpcClientMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcClient", "composeReporterRpcClients")
  @js.native
  def composeReporterRpcClients(clients: js.Array[ReporterRpcClient]): ReporterRpcClient = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/reporter/reporter-rpc/ReporterRpcClient", "createReporterRpcClient")
  @js.native
  def createReporterRpcClient[TConfiguration /* <: js.Object */](channel: RpcMessageChannel, configuration: TConfiguration): ReporterRpcClient = js.native
  
  @js.native
  trait ReporterRpcClient extends Reporter {
    
    def connect(): js.Promise[Unit] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def isConnected(): Boolean = js.native
  }
  object ReporterRpcClient {
    
    @scala.inline
    def apply(
      connect: () => js.Promise[Unit],
      disconnect: () => js.Promise[Unit],
      getReport: FilesChange => js.Promise[Report],
      isConnected: () => Boolean
    ): ReporterRpcClient = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), getReport = js.Any.fromFunction1(getReport), isConnected = js.Any.fromFunction0(isConnected))
      __obj.asInstanceOf[ReporterRpcClient]
    }
    
    @scala.inline
    implicit class ReporterRpcClientMutableBuilder[Self <: ReporterRpcClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
    }
  }
}
