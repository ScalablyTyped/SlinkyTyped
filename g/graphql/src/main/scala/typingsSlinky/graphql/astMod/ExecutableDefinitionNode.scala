package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.OperationDefinitionNode
  - typingsSlinky.graphql.astMod.FragmentDefinitionNode
*/
trait ExecutableDefinitionNode extends DefinitionNode

object ExecutableDefinitionNode {
  @scala.inline
  implicit def apply(value: FragmentDefinitionNode): ExecutableDefinitionNode = value.asInstanceOf[ExecutableDefinitionNode]
  @scala.inline
  implicit def apply(value: OperationDefinitionNode): ExecutableDefinitionNode = value.asInstanceOf[ExecutableDefinitionNode]
}

