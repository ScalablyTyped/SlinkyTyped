package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.SaveRulesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>> */
@js.native
trait ReadonlyWaitablePromiseSaWait extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveRulesResponse | TResult] = js.native
  
  def `finally`(): js.Promise[SaveRulesResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyWaitablePromiseSaWait {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SaveRulesResponse | js.Any],
    `finally`: () => js.Promise[SaveRulesResponse],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyWaitablePromiseSaWait = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaWait]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseSaWaitMutableBuilder[Self <: ReadonlyWaitablePromiseSaWait] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[SaveRulesResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[SaveRulesResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
