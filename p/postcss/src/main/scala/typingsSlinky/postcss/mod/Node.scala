package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.postcss.mod.Root_
  - typingsSlinky.postcss.mod.ChildNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: ChildNode): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Root_): Node = value.asInstanceOf[Node]
}

