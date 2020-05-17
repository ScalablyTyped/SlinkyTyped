package typingsSlinky.reactQuery.anon

import typingsSlinky.reactQuery.mod.AnyQueryKey
import typingsSlinky.reactQuery.mod.AnyVariables
import typingsSlinky.reactQuery.mod.QueryFunctionWithVariables
import typingsSlinky.reactQuery.mod.QueryOptions
import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult] extends js.Object {
  var config: js.UndefOr[QueryOptions[TResult]] = js.native
  var queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables] = js.native
  var queryKey: js.UndefOr[TKey | `false` | Null | (js.Function0[js.UndefOr[TKey | `false` | Null]])] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object Config {
  @scala.inline
  def apply[TKey, TVariables, TResult](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult]
  ): Config[TKey, TVariables, TResult] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    __obj.asInstanceOf[Config[TKey, TVariables, TResult]]
  }
  @scala.inline
  implicit class ConfigOps[Self[tkey, tvariables, tresult] <: Config[tkey, tvariables, tresult], TKey, TVariables, TResult] (val x: Self[TKey, TVariables, TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TVariables, TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TVariables, TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TVariables, TResult]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TVariables, TResult]) with Other]
    @scala.inline
    def withQueryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult]
    ): Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfig(value: QueryOptions[TResult]): Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyFunction0(value: () => js.UndefOr[TKey | `false` | Null]): Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryKey(value: TKey | `false` | (js.Function0[js.UndefOr[TKey | `false` | Null]])): Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryKey: Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyNull: Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(null)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

