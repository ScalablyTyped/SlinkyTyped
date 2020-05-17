package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.ScalarTypeExtensionNode
  - typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
  - typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
  - typingsSlinky.graphql.astMod.UnionTypeExtensionNode
  - typingsSlinky.graphql.astMod.EnumTypeExtensionNode
  - typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
*/
trait TypeExtensionNode extends TypeSystemExtensionNode

object TypeExtensionNode {
  @scala.inline
  implicit def apply(value: EnumTypeExtensionNode): TypeExtensionNode = value.asInstanceOf[TypeExtensionNode]
  @scala.inline
  implicit def apply(value: InputObjectTypeExtensionNode): TypeExtensionNode = value.asInstanceOf[TypeExtensionNode]
  @scala.inline
  implicit def apply(value: InterfaceTypeExtensionNode): TypeExtensionNode = value.asInstanceOf[TypeExtensionNode]
  @scala.inline
  implicit def apply(value: ObjectTypeExtensionNode): TypeExtensionNode = value.asInstanceOf[TypeExtensionNode]
  @scala.inline
  implicit def apply(value: ScalarTypeExtensionNode): TypeExtensionNode = value.asInstanceOf[TypeExtensionNode]
  @scala.inline
  implicit def apply(value: UnionTypeExtensionNode): TypeExtensionNode = value.asInstanceOf[TypeExtensionNode]
}

