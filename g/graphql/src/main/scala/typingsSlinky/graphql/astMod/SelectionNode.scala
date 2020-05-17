package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.FieldNode
  - typingsSlinky.graphql.astMod.FragmentSpreadNode
  - typingsSlinky.graphql.astMod.InlineFragmentNode
*/
trait SelectionNode extends js.Object

object SelectionNode {
  @scala.inline
  implicit def apply(value: FieldNode): SelectionNode = value.asInstanceOf[SelectionNode]
  @scala.inline
  implicit def apply(value: FragmentSpreadNode): SelectionNode = value.asInstanceOf[SelectionNode]
  @scala.inline
  implicit def apply(value: InlineFragmentNode): SelectionNode = value.asInstanceOf[SelectionNode]
}

