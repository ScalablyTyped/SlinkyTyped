package typingsSlinky.node.childProcessMod

import typingsSlinky.node.netMod.Server
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.netMod.Socket
  - typingsSlinky.node.netMod.Server
*/
trait SendHandle extends js.Object

object SendHandle {
  @scala.inline
  implicit def apply(value: Server): SendHandle = value.asInstanceOf[SendHandle]
  @scala.inline
  implicit def apply(value: Socket): SendHandle = value.asInstanceOf[SendHandle]
}

