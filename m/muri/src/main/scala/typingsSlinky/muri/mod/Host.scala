package typingsSlinky.muri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.muri.mod.DefaultHost
  - typingsSlinky.muri.mod.SocketHost
*/
trait Host extends js.Object

object Host {
  @scala.inline
  implicit def apply(value: DefaultHost): Host = value.asInstanceOf[Host]
  @scala.inline
  implicit def apply(value: SocketHost): Host = value.asInstanceOf[Host]
}

