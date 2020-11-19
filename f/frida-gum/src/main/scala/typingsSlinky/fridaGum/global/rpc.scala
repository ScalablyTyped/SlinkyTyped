package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.RpcExports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("rpc")
@js.native
object rpc extends js.Object {
  
  /**
    * Empty object that you can either replace or insert into to expose an RPC-style API to your application.
    * The key specifies the method name and the value is your exported function. This function may either return
    * a plain value for returning that to the caller immediately, or a Promise for returning asynchronously.
    */
  var exports: RpcExports = js.native
}
