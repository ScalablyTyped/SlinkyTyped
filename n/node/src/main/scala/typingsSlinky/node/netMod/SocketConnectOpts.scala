package typingsSlinky.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.netMod.TcpSocketConnectOpts
  - typingsSlinky.node.netMod.IpcSocketConnectOpts
*/
trait SocketConnectOpts extends js.Object

object SocketConnectOpts {
  @scala.inline
  implicit def apply(value: IpcSocketConnectOpts): SocketConnectOpts = value.asInstanceOf[SocketConnectOpts]
  @scala.inline
  implicit def apply(value: TcpSocketConnectOpts): SocketConnectOpts = value.asInstanceOf[SocketConnectOpts]
}

