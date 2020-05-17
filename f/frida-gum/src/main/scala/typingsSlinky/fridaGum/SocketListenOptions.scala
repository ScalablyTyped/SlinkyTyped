package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.TcpListenOptions
  - typingsSlinky.fridaGum.UnixListenOptions
*/
trait SocketListenOptions extends js.Object

object SocketListenOptions {
  @scala.inline
  implicit def apply(value: TcpListenOptions): SocketListenOptions = value.asInstanceOf[SocketListenOptions]
  @scala.inline
  implicit def apply(value: UnixListenOptions): SocketListenOptions = value.asInstanceOf[SocketListenOptions]
}

