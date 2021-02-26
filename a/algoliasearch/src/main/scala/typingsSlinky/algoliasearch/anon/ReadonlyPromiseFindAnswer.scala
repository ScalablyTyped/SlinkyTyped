package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.FindAnswersResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.FindAnswersResponse<{}>>> */
@js.native
trait ReadonlyPromiseFindAnswer extends StObject {
  
  def `catch`[TResult](): js.Promise[FindAnswersResponse[js.Object] | TResult] = js.native
  
  def `finally`(): js.Promise[FindAnswersResponse[js.Object]] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseFindAnswer {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[FindAnswersResponse[js.Object] | js.Any],
    `finally`: () => js.Promise[FindAnswersResponse[js.Object]],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyPromiseFindAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseFindAnswer]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseFindAnswerMutableBuilder[Self <: ReadonlyPromiseFindAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[FindAnswersResponse[js.Object] | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[FindAnswersResponse[js.Object]]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
