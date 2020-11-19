package typingsSlinky.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rpcMessageMod {
  
  type RpcCall[TProcedure /* <: typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */] = typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage[
    typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.call, 
    TProcedure, 
    typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedurePayload[TProcedure]
  ]
  
  type RpcReturn[TProcedure /* <: typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */] = typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage[
    typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`return`, 
    TProcedure, 
    typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedureResult[TProcedure]
  ]
  
  type RpcThrow[TProcedure /* <: typingsSlinky.forkTsCheckerWebpackPlugin.rpcProcedureMod.RpcProcedure[_, _] */] = typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcMessage[
    typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`throw`, 
    TProcedure, 
    typingsSlinky.forkTsCheckerWebpackPlugin.rpcMessageMod.RpcRemoteError
  ]
}
