package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.DirectiveDefinition
import typingsSlinky.graphql.graphqlStrings.EnumTypeDefinition
import typingsSlinky.graphql.graphqlStrings.EnumTypeExtension
import typingsSlinky.graphql.graphqlStrings.FragmentDefinition
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeExtension
import typingsSlinky.graphql.graphqlStrings.ObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.OperationDefinition
import typingsSlinky.graphql.graphqlStrings.ScalarTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ScalarTypeExtension
import typingsSlinky.graphql.graphqlStrings.SchemaDefinition
import typingsSlinky.graphql.graphqlStrings.SchemaExtension
import typingsSlinky.graphql.graphqlStrings.UnionTypeDefinition
import typingsSlinky.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.ExecutableDefinitionNode
  - typingsSlinky.graphql.astMod.TypeSystemDefinitionNode
  - typingsSlinky.graphql.astMod.TypeSystemExtensionNode
*/
trait DefinitionNode extends js.Object
object DefinitionNode {
  
  @scala.inline
  def EnumTypeExtensionNode(kind: EnumTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def UnionTypeExtensionNode(kind: UnionTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def ObjectTypeExtensionNode(kind: ObjectTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def EnumTypeDefinitionNode(kind: EnumTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def OperationDefinitionNode(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def DirectiveDefinitionNode(kind: DirectiveDefinition, locations: js.Array[NameNode], name: NameNode, repeatable: Boolean): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def InputObjectTypeDefinitionNode(kind: InputObjectTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def ObjectTypeDefinitionNode(kind: ObjectTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def ScalarTypeExtensionNode(kind: ScalarTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def InterfaceTypeDefinitionNode(kind: InterfaceTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def SchemaExtensionNode(kind: SchemaExtension): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def SchemaDefinitionNode(kind: SchemaDefinition, operationTypes: js.Array[OperationTypeDefinitionNode]): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def UnionTypeDefinitionNode(kind: UnionTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def InputObjectTypeExtensionNode(kind: InputObjectTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def ScalarTypeDefinitionNode(kind: ScalarTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  
  @scala.inline
  def InterfaceTypeExtensionNode(kind: InterfaceTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
}
