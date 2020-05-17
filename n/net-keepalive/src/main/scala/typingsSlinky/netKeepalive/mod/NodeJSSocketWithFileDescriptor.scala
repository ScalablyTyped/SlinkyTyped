package typingsSlinky.netKeepalive.mod

import typingsSlinky.netKeepalive.anon.Handle
import typingsSlinky.node.NodeJS.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.Socket
  - typingsSlinky.netKeepalive.anon.Handle
*/
trait NodeJSSocketWithFileDescriptor extends js.Object

object NodeJSSocketWithFileDescriptor {
  @scala.inline
  implicit def apply(value: Handle): NodeJSSocketWithFileDescriptor = value.asInstanceOf[NodeJSSocketWithFileDescriptor]
  @scala.inline
  implicit def apply(value: Socket): NodeJSSocketWithFileDescriptor = value.asInstanceOf[NodeJSSocketWithFileDescriptor]
}

