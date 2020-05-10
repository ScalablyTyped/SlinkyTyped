package typingsSlinky.reactQuery

import typingsSlinky.reactQuery.mod.AnyQueryKey
import typingsSlinky.reactQuery.mod.AnyVariables
import typingsSlinky.reactQuery.mod.InfiniteQueryFunctionWithVariables
import typingsSlinky.reactQuery.mod.InfiniteQueryOptions
import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryKey[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult, TMoreVariable] extends js.Object {
  var config: js.UndefOr[InfiniteQueryOptions[TResult, TMoreVariable]] = js.native
  var queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable] = js.native
  var queryKey: js.UndefOr[TKey | `false` | Null | (js.Function0[js.UndefOr[TKey | `false` | Null]])] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object AnonQueryKey {
  @scala.inline
  def apply[TKey, TVariables, TResult, TMoreVariable](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
  ): AnonQueryKey[TKey, TVariables, TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    __obj.asInstanceOf[AnonQueryKey[TKey, TVariables, TResult, TMoreVariable]]
  }
  @scala.inline
  implicit class AnonQueryKeyOps[Self[tkey, tvariables, tresult, tmorevariable] <: AnonQueryKey[tkey, tvariables, tresult, tmorevariable], TKey, TVariables, TResult, TMoreVariable] (val x: Self[TKey, TVariables, TResult, TMoreVariable]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TVariables, TResult, TMoreVariable] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TVariables, TResult, TMoreVariable]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TVariables, TResult, TMoreVariable]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TVariables, TResult, TMoreVariable]) with Other]
    @scala.inline
    def withQueryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
    ): Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfig(value: InfiniteQueryOptions[TResult, TMoreVariable]): Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyFunction0(value: () => js.UndefOr[TKey | `false` | Null]): Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryKey(value: TKey | `false` | (js.Function0[js.UndefOr[TKey | `false` | Null]])): Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryKey: Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyNull: Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(null)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

