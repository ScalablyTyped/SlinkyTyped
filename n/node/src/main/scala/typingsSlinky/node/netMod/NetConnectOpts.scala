package typingsSlinky.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.netMod.TcpNetConnectOpts
  - typingsSlinky.node.netMod.IpcNetConnectOpts
*/
trait NetConnectOpts extends js.Object

object NetConnectOpts {
  @scala.inline
  implicit def apply(value: IpcNetConnectOpts): NetConnectOpts = value.asInstanceOf[NetConnectOpts]
  @scala.inline
  implicit def apply(value: TcpNetConnectOpts): NetConnectOpts = value.asInstanceOf[NetConnectOpts]
}

