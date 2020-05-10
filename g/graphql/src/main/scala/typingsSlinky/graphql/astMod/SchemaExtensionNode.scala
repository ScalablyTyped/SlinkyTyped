package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.SchemaExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExtensionNode
  extends TypeSystemExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: SchemaExtension = js.native
  val loc: js.UndefOr[Location] = js.native
  val operationTypes: js.UndefOr[js.Array[OperationTypeDefinitionNode]] = js.native
}

object SchemaExtensionNode {
  @scala.inline
  def apply(kind: SchemaExtension): SchemaExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtensionNode]
  }
  @scala.inline
  implicit class SchemaExtensionNodeOps[Self <: SchemaExtensionNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: SchemaExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
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
    def withOperationTypes(value: js.Array[OperationTypeDefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTypes")(js.undefined)
        ret
    }
  }
  
}

