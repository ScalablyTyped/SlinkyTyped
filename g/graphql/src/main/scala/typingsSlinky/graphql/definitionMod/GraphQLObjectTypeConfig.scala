package typingsSlinky.graphql.definitionMod

import typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLObjectTypeConfig[TSource, TContext, TArgs] extends js.Object {
  var astNode: js.UndefOr[Maybe[ObjectTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ObjectTypeExtensionNode]]] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]] = js.native
  var interfaces: js.UndefOr[Thunk[Maybe[js.Array[GraphQLInterfaceType]]]] = js.native
  var isTypeOf: js.UndefOr[Maybe[GraphQLIsTypeOfFn[TSource, TContext]]] = js.native
  var name: String = js.native
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](fields: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]], name: String): GraphQLObjectTypeConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class GraphQLObjectTypeConfigOps[Self[tsource, tcontext, targs] <: GraphQLObjectTypeConfig[tsource, tcontext, targs], TSource, TContext, TArgs] (val x: Self[TSource, TContext, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext, TArgs]) with Other]
    @scala.inline
    def withFieldsFunction0(value: () => GraphQLFieldConfigMap[TSource, TContext, TArgs]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFields(value: Thunk[GraphQLFieldConfigMap[TSource, TContext, TArgs]]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[ObjectTypeDefinitionNode]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstNode: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNodeNull: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(null)
        ret
    }
    @scala.inline
    def withDescription(value: Maybe[String]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withExtensionASTNodes(value: Maybe[js.Array[ObjectTypeExtensionNode]]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionASTNodes: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionASTNodesNull: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(null)
        ret
    }
    @scala.inline
    def withExtensions(value: Maybe[Record[String, _]]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsNull: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(null)
        ret
    }
    @scala.inline
    def withInterfacesFunction0(value: () => Maybe[js.Array[GraphQLInterfaceType]]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInterfaces(value: Thunk[Maybe[js.Array[GraphQLInterfaceType]]]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaces: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfacesNull: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(null)
        ret
    }
    @scala.inline
    def withIsTypeOf(value: (TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIsTypeOf: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTypeOfNull: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeOf")(null)
        ret
    }
  }
  
}

