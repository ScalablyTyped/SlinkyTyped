package typingsSlinky.reactQuery

import typingsSlinky.reactQuery.mod.AnyVariables
import typingsSlinky.reactQuery.mod.InfiniteQueryFunctionWithVariables
import typingsSlinky.reactQuery.mod.InfiniteQueryOptions
import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVariables[TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult, TMoreVariable] extends js.Object {
  var config: js.UndefOr[InfiniteQueryOptions[TResult, TMoreVariable]] = js.native
  var queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TSingleKey], TVariables, TMoreVariable] = js.native
  var queryKey: js.UndefOr[
    TSingleKey | `false` | Null | (js.Function0[js.UndefOr[TSingleKey | `false` | Null]])
  ] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object AnonVariables {
  @scala.inline
  def apply[TSingleKey, TVariables, TResult, TMoreVariable](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
  ): AnonVariables[TSingleKey, TVariables, TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    __obj.asInstanceOf[AnonVariables[TSingleKey, TVariables, TResult, TMoreVariable]]
  }
  @scala.inline
  implicit class AnonVariablesOps[Self[tsinglekey, tvariables, tresult, tmorevariable] <: AnonVariables[tsinglekey, tvariables, tresult, tmorevariable], TSingleKey, TVariables, TResult, TMoreVariable] (val x: Self[TSingleKey, TVariables, TResult, TMoreVariable]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSingleKey, TVariables, TResult, TMoreVariable] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSingleKey, TVariables, TResult, TMoreVariable]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSingleKey, TVariables, TResult, TMoreVariable]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSingleKey, TVariables, TResult, TMoreVariable]) with Other]
    @scala.inline
    def withQueryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
    ): Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfig(value: InfiniteQueryOptions[TResult, TMoreVariable]): Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyFunction0(value: () => js.UndefOr[TSingleKey | `false` | Null]): Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryKey(value: TSingleKey | `false` | (js.Function0[js.UndefOr[TSingleKey | `false` | Null]])): Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryKey: Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeyNull: Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKey")(null)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TSingleKey, TVariables, TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

