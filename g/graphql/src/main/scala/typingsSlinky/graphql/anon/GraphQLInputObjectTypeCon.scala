package typingsSlinky.graphql.anon

import typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfigMap
import typingsSlinky.graphql.definitionMod.Thunk
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLInputObjectTypeConfig & {  fields  :graphql.graphql/type/definition.GraphQLInputFieldConfigMap,   extensions  :graphql.graphql/tsutils/Maybe.default<std.Readonly<std.Record<string, any>>>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.InputObjectTypeExtensionNode>} */
@js.native
trait GraphQLInputObjectTypeCon extends js.Object {
  var astNode: js.UndefOr[Maybe[InputObjectTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[
    Maybe[js.Array[InputObjectTypeExtensionNode]] with js.Array[InputObjectTypeExtensionNode]
  ] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var fields: Thunk[GraphQLInputFieldConfigMap] with GraphQLInputFieldConfigMap = js.native
  var name: String = js.native
}

object GraphQLInputObjectTypeCon {
  @scala.inline
  def apply(fields: Thunk[GraphQLInputFieldConfigMap] with GraphQLInputFieldConfigMap, name: String): GraphQLInputObjectTypeCon = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputObjectTypeCon]
  }
  @scala.inline
  implicit class GraphQLInputObjectTypeConOps[Self <: GraphQLInputObjectTypeCon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: Thunk[GraphQLInputFieldConfigMap] with GraphQLInputFieldConfigMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[InputObjectTypeDefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(null)
        ret
    }
    @scala.inline
    def withDescription(value: Maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withExtensionASTNodes(value: Maybe[js.Array[InputObjectTypeExtensionNode]] with js.Array[InputObjectTypeExtensionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionASTNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: Maybe[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(null)
        ret
    }
  }
  
}

