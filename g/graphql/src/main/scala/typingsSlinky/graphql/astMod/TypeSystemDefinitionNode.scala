package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.DirectiveDefinition
import typingsSlinky.graphql.graphqlStrings.EnumTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ObjectTypeDefinition
import typingsSlinky.graphql.graphqlStrings.ScalarTypeDefinition
import typingsSlinky.graphql.graphqlStrings.SchemaDefinition
import typingsSlinky.graphql.graphqlStrings.UnionTypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.SchemaDefinitionNode
  - typingsSlinky.graphql.astMod.TypeDefinitionNode
  - typingsSlinky.graphql.astMod.DirectiveDefinitionNode
*/
trait TypeSystemDefinitionNode extends DefinitionNode
object TypeSystemDefinitionNode {
  
  @scala.inline
  def EnumTypeDefinitionNode(kind: EnumTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  
  @scala.inline
  def DirectiveDefinitionNode(kind: DirectiveDefinition, locations: js.Array[NameNode], name: NameNode, repeatable: Boolean): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  
  @scala.inline
  def InputObjectTypeDefinitionNode(kind: InputObjectTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  
  @scala.inline
  def ObjectTypeDefinitionNode(kind: ObjectTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  
  @scala.inline
  def InterfaceTypeDefinitionNode(kind: InterfaceTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  
  @scala.inline
  def SchemaDefinitionNode(kind: SchemaDefinition, operationTypes: js.Array[OperationTypeDefinitionNode]): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  
  @scala.inline
  def UnionTypeDefinitionNode(kind: UnionTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
  
  @scala.inline
  def ScalarTypeDefinitionNode(kind: ScalarTypeDefinition, name: NameNode): TypeSystemDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSystemDefinitionNode]
  }
}
