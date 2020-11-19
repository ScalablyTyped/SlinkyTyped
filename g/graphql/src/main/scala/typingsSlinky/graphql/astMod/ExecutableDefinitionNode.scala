package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.FragmentDefinition
import typingsSlinky.graphql.graphqlStrings.OperationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.OperationDefinitionNode
  - typingsSlinky.graphql.astMod.FragmentDefinitionNode
*/
trait ExecutableDefinitionNode extends DefinitionNode
object ExecutableDefinitionNode {
  
  @scala.inline
  def OperationDefinitionNode(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): ExecutableDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableDefinitionNode]
  }
  
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode
  ): ExecutableDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableDefinitionNode]
  }
}
