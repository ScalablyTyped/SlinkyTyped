package typingsSlinky.reactQuery.anon

import typingsSlinky.reactQuery.mod.AnyVariables
import typingsSlinky.reactQuery.mod.QueryFunctionWithVariables
import typingsSlinky.reactQuery.mod.QueryOptions
import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryFn[TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult] extends js.Object {
  
  var config: js.UndefOr[QueryOptions[TResult]] = js.native
  
  var queryFn: QueryFunctionWithVariables[TResult, js.Array[TSingleKey], TVariables] = js.native
  
  var queryKey: js.UndefOr[
    TSingleKey | `false` | Null | (js.Function0[js.UndefOr[TSingleKey | `false` | Null]])
  ] = js.native
  
  var variables: js.UndefOr[TVariables] = js.native
}
object QueryFn {
  
  @scala.inline
  def apply[TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult]
  ): QueryFn[TSingleKey, TVariables, TResult] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    __obj.asInstanceOf[QueryFn[TSingleKey, TVariables, TResult]]
  }
  
  @scala.inline
  implicit class QueryFnOps[Self <: QueryFn[_, _, _], TSingleKey /* <: String */, TVariables /* <: AnyVariables */, TResult] (val x: Self with (QueryFn[TSingleKey, TVariables, TResult])) extends AnyVal {
    
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
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult]
    ): Self = this.set("queryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfig(value: QueryOptions[TResult]): Self = this.set("config", value.asInstanceOf[js.Any])
    
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
