package typingsSlinky.reactQuery

import typingsSlinky.reactQuery.mod.AnyVariables
import typingsSlinky.reactQuery.mod.QueryFunctionWithVariables
import typingsSlinky.reactQuery.mod.QueryOptions
import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryFn[TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult] extends js.Object {
  var config: js.UndefOr[QueryOptions[TResult]] = js.native
  var queryFn: QueryFunctionWithVariables[TResult, js.Array[TSingleKey], TVariables] = js.native
  var queryKey: js.UndefOr[
    TSingleKey | `false` | Null | (js.Function0[js.UndefOr[TSingleKey | `false` | Null]])
  ] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object AnonQueryFn {
  @scala.inline
  def apply[TSingleKey, TVariables, TResult](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult]
  ): AnonQueryFn[TSingleKey, TVariables, TResult] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    __obj.asInstanceOf[AnonQueryFn[TSingleKey, TVariables, TResult]]
  }
  @scala.inline
  implicit class AnonQueryFnOps[Self[tsinglekey, tvariables, tresult] <: AnonQueryFn[tsinglekey, tvariables, tresult], TSingleKey, TVariables, TResult] (val x: Self[TSingleKey, TVariables, TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSingleKey, TVariables, TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSingleKey, TVariables, TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSingleKey, TVariables, TResult]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSingleKey, TVariables, TResult]) with Other]
    @scala.inline
    def withQueryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult]
    ): Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfig(value: QueryOptions[TResult]): Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyFunction0(value: () => js.UndefOr[TSingleKey | `false` | Null]): Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryKey(value: TSingleKey | `false` | (js.Function0[js.UndefOr[TSingleKey | `false` | Null]])): Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryKey: Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyNull: Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(null)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TSingleKey, TVariables, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

