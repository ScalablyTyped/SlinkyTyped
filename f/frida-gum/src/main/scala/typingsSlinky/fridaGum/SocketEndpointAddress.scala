package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpEndpointAddress
  - typingsSlinky.fridaGum.UnixEndpointAddress
*/
trait SocketEndpointAddress extends js.Object

object SocketEndpointAddress {
  @scala.inline
  implicit def apply(value: TcpEndpointAddress): SocketEndpointAddress = value.asInstanceOf[SocketEndpointAddress]
  @scala.inline
  implicit def apply(value: UnixEndpointAddress): SocketEndpointAddress = value.asInstanceOf[SocketEndpointAddress]
}

