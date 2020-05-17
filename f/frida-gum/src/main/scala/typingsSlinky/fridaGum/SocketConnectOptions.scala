package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpConnectOptions
  - typingsSlinky.fridaGum.UnixConnectOptions
*/
trait SocketConnectOptions extends js.Object

object SocketConnectOptions {
  @scala.inline
  implicit def apply(value: TcpConnectOptions): SocketConnectOptions = value.asInstanceOf[SocketConnectOptions]
  @scala.inline
  implicit def apply(value: UnixConnectOptions): SocketConnectOptions = value.asInstanceOf[SocketConnectOptions]
}

