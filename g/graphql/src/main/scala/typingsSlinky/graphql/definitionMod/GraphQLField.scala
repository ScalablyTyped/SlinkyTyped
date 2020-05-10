package typingsSlinky.graphql.definitionMod

import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLField[TSource, TContext, TArgs] extends js.Object {
  var args: js.Array[GraphQLArgument] = js.native
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.native
  var deprecationReason: js.UndefOr[Maybe[String]] = js.native
  var description: Maybe[String] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var isDeprecated: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.native
  var `type`: GraphQLOutputType = js.native
}

object GraphQLField {
  @scala.inline
  def apply[TSource, TContext, TArgs](args: js.Array[GraphQLArgument], name: String, `type`: GraphQLOutputType): GraphQLField[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLField[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class GraphQLFieldOps[Self[tsource, tcontext, targs] <: GraphQLField[tsource, tcontext, targs], TSource, TContext, TArgs] (val x: Self[TSource, TContext, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext, TArgs]) with Other]
    @scala.inline
    def withArgs(value: js.Array[GraphQLArgument]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GraphQLOutputType): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[FieldDefinitionNode]): Self[TSource, TContext, TArgs] = {
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
    def withDeprecationReason(value: Maybe[String]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationReason: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationReasonNull: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(null)
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
    def withIsDeprecated(value: Boolean): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeprecated: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribe(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSubscribe: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
  }
  
}

