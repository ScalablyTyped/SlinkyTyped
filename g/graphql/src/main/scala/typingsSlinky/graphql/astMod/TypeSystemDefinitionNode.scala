package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.SchemaDefinitionNode
  - typingsSlinky.graphql.astMod.TypeDefinitionNode
  - typingsSlinky.graphql.astMod.DirectiveDefinitionNode
*/
trait TypeSystemDefinitionNode extends DefinitionNode

object TypeSystemDefinitionNode {
  @scala.inline
  implicit def apply(value: DirectiveDefinitionNode): TypeSystemDefinitionNode = value.asInstanceOf[TypeSystemDefinitionNode]
  @scala.inline
  implicit def apply(value: SchemaDefinitionNode): TypeSystemDefinitionNode = value.asInstanceOf[TypeSystemDefinitionNode]
  @scala.inline
  implicit def apply(value: TypeDefinitionNode): TypeSystemDefinitionNode = value.asInstanceOf[TypeSystemDefinitionNode]
}

