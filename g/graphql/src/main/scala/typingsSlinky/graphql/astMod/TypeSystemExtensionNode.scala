package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.EnumTypeExtension
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeExtension
import typingsSlinky.graphql.graphqlStrings.ObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.ScalarTypeExtension
import typingsSlinky.graphql.graphqlStrings.SchemaExtension
import typingsSlinky.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.SchemaExtensionNode
  - typingsSlinky.graphql.astMod.TypeExtensionNode
*/
trait TypeSystemExtensionNode extends DefinitionNode

object TypeSystemExtensionNode {
  @scala.inline
  def EnumTypeExtensionNode(kind: EnumTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def UnionTypeExtensionNode(kind: UnionTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def ObjectTypeExtensionNode(kind: ObjectTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def ScalarTypeExtensionNode(kind: ScalarTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def SchemaExtensionNode(kind: SchemaExtension): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def InputObjectTypeExtensionNode(kind: InputObjectTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
  @scala.inline
  def InterfaceTypeExtensionNode(kind: InterfaceTypeExtension, name: NameNode): TypeSystemExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemExtensionNode]
  }
}

