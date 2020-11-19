package typingsSlinky.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.netMod.TcpSocketConnectOpts
  - typingsSlinky.node.netMod.IpcSocketConnectOpts
*/
trait SocketConnectOpts extends js.Object
object SocketConnectOpts {
  
  @scala.inline
  def TcpSocketConnectOpts(port: Double): SocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOpts]
  }
  
  @scala.inline
  def IpcSocketConnectOpts(path: String): SocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOpts]
  }
}
