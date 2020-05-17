package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.BranchNode
  - typingsSlinky.regexpp.astMod.LeafNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: BranchNode): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: LeafNode): Node = value.asInstanceOf[Node]
}

