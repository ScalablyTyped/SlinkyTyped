package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.OperationDefinition
import typingsSlinky.graphql.validationContextMod.NodeWithSelectionSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationDefinitionNode
  extends ExecutableDefinitionNode
     with ASTNode
     with NodeWithSelectionSet {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: OperationDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: js.UndefOr[NameNode] = js.native
  val operation: OperationTypeNode = js.native
  val selectionSet: SelectionSetNode = js.native
  val variableDefinitions: js.UndefOr[js.Array[VariableDefinitionNode]] = js.native
}

object OperationDefinitionNode {
  @scala.inline
  def apply(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): OperationDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionNode]
  }
  @scala.inline
  implicit class OperationDefinitionNodeOps[Self <: OperationDefinitionNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: OperationDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: OperationTypeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionSet(value: SelectionSetNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectives(value: js.Array[DirectiveNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableDefinitions(value: js.Array[VariableDefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableDefinitions")(js.undefined)
        ret
    }
  }
  
}

