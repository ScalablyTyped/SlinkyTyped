package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.SaveObjectResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveObjectResponse>> */
@js.native
trait ReadonlyWaitablePromiseSa extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveObjectResponse | TResult] = js.native
  
  def `finally`(): js.Promise[SaveObjectResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyWaitablePromiseSa {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SaveObjectResponse | js.Any],
    `finally`: () => js.Promise[SaveObjectResponse],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyWaitablePromiseSa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSa]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseSaMutableBuilder[Self <: ReadonlyWaitablePromiseSa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[SaveObjectResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[SaveObjectResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
