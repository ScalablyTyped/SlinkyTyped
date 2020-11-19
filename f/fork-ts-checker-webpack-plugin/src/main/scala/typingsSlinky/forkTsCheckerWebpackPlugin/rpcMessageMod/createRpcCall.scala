package typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod

import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure
import typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/RpcMessage", "createRpcCall")
@js.native
object createRpcCall extends js.Object {
  
  def apply[TProcedure /* <: RpcProcedure[_, _] */](procedure: TProcedure, index: Double, payload: RpcProcedurePayload[TProcedure]): RpcCall[TProcedure] = js.native
}
