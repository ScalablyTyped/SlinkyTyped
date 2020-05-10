package typingsSlinky.apollographqlApolloTools.mod.graphqlTypeDefinitionAugmentingMod

import typingsSlinky.apollographqlApolloTools.resolveObjectMod.GraphQLObjectResolver
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLObjectTypeConfig[TSource, TContext] extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[TSource, TContext]] = js.native
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](): GraphQLObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLObjectTypeConfigOps[Self[tsource, tcontext] <: GraphQLObjectTypeConfig[tsource, tcontext], TSource, TContext] (val x: Self[TSource, TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext]) with Other]
    @scala.inline
    def withResolveObject(
      value: (TSource, /* fields */ Record[String, js.Array[FieldNode]], TContext, /* info */ GraphQLResolveInfo) => js.Any
    ): Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveObject")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolveObject: Self[TSource, TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveObject")(js.undefined)
        ret
    }
  }
  
}

