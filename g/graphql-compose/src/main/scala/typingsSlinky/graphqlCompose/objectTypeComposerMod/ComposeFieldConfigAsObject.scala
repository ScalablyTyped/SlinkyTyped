package typingsSlinky.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeFieldConfigAsObject[TSource, TContext, TArgs]
  extends /* key */ StringDictionary[js.Any]
     with ComposeFieldConfig[TSource, TContext, TArgs] {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.native
  var astNode: js.UndefOr[FieldDefinitionNode | Null] = js.native
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var `type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType = js.native
}

object ComposeFieldConfigAsObject {
  @scala.inline
  def apply[TSource, TContext, TArgs](`type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType): ComposeFieldConfigAsObject[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeFieldConfigAsObject[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class ComposeFieldConfigAsObjectOps[Self[tsource, tcontext, targs] <: ComposeFieldConfigAsObject[tsource, tcontext, targs], TSource, TContext, TArgs] (val x: Self[TSource, TContext, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext, TArgs]) with Other]
    @scala.inline
    def withTypeFunction0(value: () => ComposeOutputType[_, TContext]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$call(value: Unit): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$call: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$call")(js.undefined)
        ret
    }
    @scala.inline
    def withArgs(value: ComposeFieldConfigArgumentMap[TArgs]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: FieldDefinitionNode): Self[TSource, TContext, TArgs] = {
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
    def withDeprecationReason(value: String): Self[TSource, TContext, TArgs] = {
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
    def withDescription(value: String): Self[TSource, TContext, TArgs] = {
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
    def withExtensions(value: Extensions): Self[TSource, TContext, TArgs] = {
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
    def withSubscribe(value: (TSource, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self[TSource, TContext, TArgs] = {
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

