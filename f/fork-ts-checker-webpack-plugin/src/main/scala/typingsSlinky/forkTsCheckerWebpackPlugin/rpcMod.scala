package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.rpcClientMod.RpcClient
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageChannelMod.RpcMessageChannel
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcCall
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcRemoteError
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcReturn
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcThrow
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessagePortMod.RpcMessagePort
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcServiceMod.RpcService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc", JSImport.Namespace)
@js.native
object rpcMod extends js.Object {
  
  def createRpcCall[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, index: Double, payload: RpcProcedurePayload[TProcedure]): RpcCall[TProcedure] = js.native
  
  def createRpcClient(port: RpcMessagePort): RpcClient = js.native
  
  def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload): RpcMessage[TType, TProcedure, TPayload] = js.native
  def createRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */, TPayload](procedure: TProcedure, id: Double, `type`: TType, payload: TPayload, source: String): RpcMessage[TType, TProcedure, TPayload] = js.native
  
  def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort): RpcMessageChannel = js.native
  def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.UndefOr[scala.Nothing],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = js.native
  def createRpcMessageChannel(servicePort: RpcMessagePort, clientPort: RpcMessagePort, linkPorts: js.Function0[js.Promise[Unit]]): RpcMessageChannel = js.native
  def createRpcMessageChannel(
    servicePort: RpcMessagePort,
    clientPort: RpcMessagePort,
    linkPorts: js.Function0[js.Promise[Unit]],
    unlinkPorts: js.Function0[js.Promise[Unit]]
  ): RpcMessageChannel = js.native
  
  def createRpcReturn[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, index: Double, payload: RpcProcedureResult[TProcedure]): RpcReturn[TProcedure] = js.native
  
  def createRpcService(port: RpcMessagePort): RpcService = js.native
  
  def createRpcThrow[TProcedure /* <: RpcProcedure[_, _] */, TError](procedure: TProcedure, index: Double, payload: RpcRemoteError): RpcThrow[TProcedure] = js.native
  
  def getRpcMessageKey(message: RpcMessage[String, RpcProcedure[_, _], _]): String = js.native
  
  def isRpcCallMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcCall<TProcedure> */ Boolean = js.native
  
  def isRpcMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcMessage<TType, TProcedure, unknown> */ Boolean = js.native
  
  def isRpcReturnMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcReturn<TProcedure> */ Boolean = js.native
  
  def isRpcThrowMessage[TType /* <: String */, TProcedure /* <: RpcProcedure[_, _] */](candidate: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage.RpcThrow<TProcedure> */ Boolean = js.native
}
