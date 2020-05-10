package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.EnumTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ScalarTypeDefinition
import typingsSlinky.graphql.graphqlStrings.UnionTypeDefinition
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
  def EnumTypeDefinitionNode(kind: EnumTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def InputObjectTypeDefinitionNode(kind: InputObjectTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def ObjectTypeDefinitionNode(kind: ObjectTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def InterfaceTypeDefinitionNode(kind: InterfaceTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def UnionTypeDefinitionNode(kind: UnionTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
  @scala.inline
  def ScalarTypeDefinitionNode(kind: ScalarTypeDefinition, name: NameNode): TypeDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionNode]
  }
}

