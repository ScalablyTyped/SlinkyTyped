package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcClientMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcClient", "createRpcClient")
  @js.native
  def createRpcClient(port: RpcMessagePort): RpcClient = js.native
  
  @js.native
  trait RpcClient extends StObject {
    
    def connect(): js.Promise[Unit] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def dispatchCall[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, payload: RpcProcedurePayload[TProcedure]): js.Promise[RpcProcedureResult[TProcedure]] = js.native
    
    def isConnected(): Boolean = js.native
  }
  object RpcClient {
    
    @scala.inline
    def apply(
      connect: () => js.Promise[Unit],
      disconnect: () => js.Promise[Unit],
      dispatchCall: (js.Any, RpcProcedurePayload[js.Any]) => js.Promise[RpcProcedureResult[js.Any]],
      isConnected: () => Boolean
    ): RpcClient = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), dispatchCall = js.Any.fromFunction2(dispatchCall), isConnected = js.Any.fromFunction0(isConnected))
      __obj.asInstanceOf[RpcClient]
    }
    
    @scala.inline
    implicit class RpcClientMutableBuilder[Self <: RpcClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDispatchCall(value: (js.Any, RpcProcedurePayload[js.Any]) => js.Promise[RpcProcedureResult[js.Any]]): Self = StObject.set(x, "dispatchCall", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
    }
  }
}
