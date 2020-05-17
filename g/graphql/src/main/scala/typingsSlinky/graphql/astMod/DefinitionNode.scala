package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.ExecutableDefinitionNode
  - typingsSlinky.graphql.astMod.TypeSystemDefinitionNode
  - typingsSlinky.graphql.astMod.TypeSystemExtensionNode
*/
trait DefinitionNode extends js.Object

object DefinitionNode {
  @scala.inline
  implicit def apply(value: ExecutableDefinitionNode): DefinitionNode = value.asInstanceOf[DefinitionNode]
  @scala.inline
  implicit def apply(value: TypeSystemDefinitionNode): DefinitionNode = value.asInstanceOf[DefinitionNode]
  @scala.inline
  implicit def apply(value: TypeSystemExtensionNode): DefinitionNode = value.asInstanceOf[DefinitionNode]
}

