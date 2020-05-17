package typingsSlinky.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLIsTypeOfFn
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphqlTools.anon.GraphQLResolveInfomergeIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolverOptions[TSource, TContext, TArgs] extends js.Object {
  var __isTypeOf: js.UndefOr[GraphQLIsTypeOfFn[TSource, TContext]] = js.native
  var __resolveType: js.UndefOr[GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]] = js.native
  var fragment: js.UndefOr[String] = js.native
  var resolve: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.native
  var subscribe: js.UndefOr[IFieldResolver[TSource, TContext, TArgs]] = js.native
}

object IResolverOptions {
  @scala.inline
  def apply[TSource, TContext, TArgs](): IResolverOptions[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResolverOptions[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class IResolverOptionsOps[Self[tsource, tcontext, targs] <: IResolverOptions[tsource, tcontext, targs], TSource, TContext, TArgs] (val x: Self[TSource, TContext, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext, TArgs]) with Other]
    @scala.inline
    def with__isTypeOf(value: (TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__isTypeOf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def without__isTypeOf: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__isTypeOf")(js.undefined)
        ret
    }
    @scala.inline
    def with__resolveType(
      value: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, StringDictionary[_]]) | String]]
    ): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__resolveType")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def without__resolveType: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__resolveType")(js.undefined)
        ret
    }
    @scala.inline
    def withFragment(value: String): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragment: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfomergeIn) => js.Any): Self[TSource, TContext, TArgs] = {
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
    def withSubscribe(value: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfomergeIn) => js.Any): Self[TSource, TContext, TArgs] = {
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

