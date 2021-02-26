package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.SaveSynonymsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>> */
@js.native
trait ReadonlyWaitablePromiseSaFinally extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveSynonymsResponse | TResult] = js.native
  
  def `finally`(): js.Promise[SaveSynonymsResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyWaitablePromiseSaFinally {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SaveSynonymsResponse | js.Any],
    `finally`: () => js.Promise[SaveSynonymsResponse],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyWaitablePromiseSaFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaFinally]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseSaFinallyMutableBuilder[Self <: ReadonlyWaitablePromiseSaFinally] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[SaveSynonymsResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[SaveSynonymsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
