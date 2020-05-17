package typingsSlinky.mitm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mitm.mod.SocketConnectCallback
  - typingsSlinky.mitm.mod.SocketConnectionCallback
  - typingsSlinky.mitm.mod.HttpCallback
*/
trait Callback extends js.Object

object Callback {
  @scala.inline
  implicit def apply(value: HttpCallback | SocketConnectCallback | SocketConnectionCallback): Callback = value.asInstanceOf[Callback]
}

