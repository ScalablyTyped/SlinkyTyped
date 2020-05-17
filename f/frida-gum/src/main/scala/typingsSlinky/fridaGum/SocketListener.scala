package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener created by `Socket.listen()`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpListener
  - typingsSlinky.fridaGum.UnixListener
*/
trait SocketListener extends js.Object

object SocketListener {
  @scala.inline
  implicit def apply(value: TcpListener): SocketListener = value.asInstanceOf[SocketListener]
  @scala.inline
  implicit def apply(value: UnixListener): SocketListener = value.asInstanceOf[SocketListener]
}

