package typingsSlinky.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parse5.mod.DefaultTreeNode
  - js.Object
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: DefaultTreeNode): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: js.Object): Node = value.asInstanceOf[Node]
}

