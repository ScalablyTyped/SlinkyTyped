package typingsSlinky.graphql.validationContextMod

import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.OperationDefinitionNode
  - typingsSlinky.graphql.astMod.FragmentDefinitionNode
*/
trait NodeWithSelectionSet extends js.Object

object NodeWithSelectionSet {
  @scala.inline
  implicit def apply(value: FragmentDefinitionNode): NodeWithSelectionSet = value.asInstanceOf[NodeWithSelectionSet]
  @scala.inline
  implicit def apply(value: OperationDefinitionNode): NodeWithSelectionSet = value.asInstanceOf[NodeWithSelectionSet]
}

