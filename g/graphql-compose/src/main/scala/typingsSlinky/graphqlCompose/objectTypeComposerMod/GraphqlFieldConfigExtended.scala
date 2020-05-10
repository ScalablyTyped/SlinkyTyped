package typingsSlinky.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLFieldConfig<TSource, TContext, {[argName: string] : any}> & {  projection ? :any} */
@js.native
trait GraphqlFieldConfigExtended[TSource, TContext] extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.native
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.native
  var deprecationReason: js.UndefOr[Maybe[String]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var projection: js.UndefOr[js.Any] = js.native
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var `type`: GraphQLOutputType = js.native
}

object GraphqlFieldConfigExtended {
  @scala.inline
  def apply[TSource, TContext](`type`: GraphQLOutputType): GraphqlFieldConfigExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphqlFieldConfigExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphqlFieldConfigExtendedOps[Self[tsource, tcontext] <: GraphqlFieldConfigExtended[tsource, tcontext], TSource, TContext] (val x: Self[TSource, TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext]) with Other]
    @scala.inline
    def withType(value: GraphQLOutputType): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: GraphQLFieldConfigArgumentMap): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[FieldDefinitionNode]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstNode: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNodeNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(null)
        ret
    }
    @scala.inline
    def withDeprecationReason(value: Maybe[String]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationReason: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationReasonNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationReason")(null)
        ret
    }
    @scala.inline
    def withDescription(value: Maybe[String]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withExtensions(value: Maybe[Record[String, _]]): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsNull: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(null)
        ret
    }
    @scala.inline
    def withProjection(value: js.Any): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: (TSource, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribe(value: (TSource, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSubscribe: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
  }
  
}

