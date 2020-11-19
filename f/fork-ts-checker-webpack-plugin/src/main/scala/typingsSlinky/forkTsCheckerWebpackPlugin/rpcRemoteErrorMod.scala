package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/error/RpcRemoteError", JSImport.Namespace)
@js.native
object rpcRemoteErrorMod extends js.Object {
  
  @js.native
  class RpcRemoteError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, stack: String) = this()
  }
}
