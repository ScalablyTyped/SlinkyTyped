package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.ScalarTypeDefinitionNode
  - typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
  - typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode
  - typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
  - typingsSlinky.graphql.astMod.EnumTypeDefinitionNode
  - typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
*/
trait TypeDefinitionNode extends TypeSystemDefinitionNode

object TypeDefinitionNode {
  @scala.inline
  implicit def apply(value: EnumTypeDefinitionNode): TypeDefinitionNode = value.asInstanceOf[TypeDefinitionNode]
  @scala.inline
  implicit def apply(value: InputObjectTypeDefinitionNode): TypeDefinitionNode = value.asInstanceOf[TypeDefinitionNode]
  @scala.inline
  implicit def apply(value: InterfaceTypeDefinitionNode): TypeDefinitionNode = value.asInstanceOf[TypeDefinitionNode]
  @scala.inline
  implicit def apply(value: ObjectTypeDefinitionNode): TypeDefinitionNode = value.asInstanceOf[TypeDefinitionNode]
  @scala.inline
  implicit def apply(value: ScalarTypeDefinitionNode): TypeDefinitionNode = value.asInstanceOf[TypeDefinitionNode]
  @scala.inline
  implicit def apply(value: UnionTypeDefinitionNode): TypeDefinitionNode = value.asInstanceOf[TypeDefinitionNode]
}

