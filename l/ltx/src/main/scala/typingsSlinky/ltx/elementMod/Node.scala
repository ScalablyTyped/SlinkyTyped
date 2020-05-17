package typingsSlinky.ltx.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ltx.elementMod.Element
  - typingsSlinky.ltx.elementMod.TextNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: Element): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TextNode): Node = value.asInstanceOf[Node]
}

