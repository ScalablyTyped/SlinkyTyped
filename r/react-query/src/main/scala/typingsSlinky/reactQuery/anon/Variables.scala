package typingsSlinky.reactQuery.anon

import typingsSlinky.reactQuery.mod.AnyVariables
import typingsSlinky.reactQuery.mod.InfiniteQueryFunctionWithVariables
import typingsSlinky.reactQuery.mod.InfiniteQueryOptions
import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variables[TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult, TMoreVariable] extends js.Object {
  
  var config: js.UndefOr[InfiniteQueryOptions[TResult, TMoreVariable]] = js.native
  
  var queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TSingleKey], TVariables, TMoreVariable] = js.native
  
  var queryKey: js.UndefOr[
    TSingleKey | `false` | Null | (js.Function0[js.UndefOr[TSingleKey | `false` | Null]])
  ] = js.native
  
  var variables: js.UndefOr[TVariables] = js.native
}
object Variables {
  
  @scala.inline
  def apply[TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult, TMoreVariable](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
  ): Variables[TSingleKey, TVariables, TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    __obj.asInstanceOf[Variables[TSingleKey, TVariables, TResult, TMoreVariable]]
  }
  
  @scala.inline
  implicit class VariablesOps[Self <: Variables[_, _, _, _], TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult, TMoreVariable] (val x: Self with (Variables[TSingleKey, TVariables, TResult, TMoreVariable])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
    ): Self = this.set("queryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfig(value: InfiniteQueryOptions[TResult, TMoreVariable]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setQueryKeyFunction0(value: () => js.UndefOr[TSingleKey | `false` | Null]): Self = this.set("queryKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryKey(value: TSingleKey | `false` | (js.Function0[js.UndefOr[TSingleKey | `false` | Null]])): Self = this.set("queryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryKey: Self = this.set("queryKey", js.undefined)
    
    @scala.inline
    def setQueryKeyNull: Self = this.set("queryKey", null)
    
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
