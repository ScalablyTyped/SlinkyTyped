package typingsSlinky.graphql.validationContextMod

import typingsSlinky.graphql.astMod.DirectiveNode
import typingsSlinky.graphql.astMod.Location
import typingsSlinky.graphql.astMod.NameNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.OperationTypeNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.graphqlStrings.FragmentDefinition
import typingsSlinky.graphql.graphqlStrings.OperationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.OperationDefinitionNode
  - typingsSlinky.graphql.astMod.FragmentDefinitionNode
*/
trait NodeWithSelectionSet extends js.Object

object NodeWithSelectionSet {
  @scala.inline
  def OperationDefinitionNode(
    kind: OperationDefinition,
    operation: OperationTypeNode,
    selectionSet: SelectionSetNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    name: NameNode = null,
    variableDefinitions: js.Array[VariableDefinitionNode] = null
  ): NodeWithSelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeWithSelectionSet]
  }
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    variableDefinitions: js.Array[VariableDefinitionNode] = null
  ): NodeWithSelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeWithSelectionSet]
  }
}

