package typingsSlinky.graphqlCompose.resolverMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverSortArgConfig[TSource, TContext, TArgs] extends js.Object {
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var name: String = js.native
  var sortTypeNameFallback: js.UndefOr[String] = js.native
  var value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_] = js.native
}

object ResolverSortArgConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    name: String,
    value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_]
  ): ResolverSortArgConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverSortArgConfig[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class ResolverSortArgConfigOps[Self[tsource, tcontext, targs] <: ResolverSortArgConfig[tsource, tcontext, targs], TSource, TContext, TArgs] (val x: Self[TSource, TContext, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext, TArgs]) with Other]
    @scala.inline
    def withName(value: String): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFunction1(value: /* resolveParams */ ResolveParams[TSource, TContext, TArgs] => js.Any): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(
      value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_]
    ): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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
    def withSortTypeNameFallback(value: String): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortTypeNameFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortTypeNameFallback: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortTypeNameFallback")(js.undefined)
        ret
    }
  }
  
}

