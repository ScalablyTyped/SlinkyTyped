package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.GetLogsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetLogsResponse>> */
@js.native
trait ReadonlyPromiseGetLogsRes extends StObject {
  
  def `catch`[TResult](): js.Promise[GetLogsResponse | TResult] = js.native
  
  def `finally`(): js.Promise[GetLogsResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseGetLogsRes {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetLogsResponse | js.Any],
    `finally`: () => js.Promise[GetLogsResponse],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyPromiseGetLogsRes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetLogsRes]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseGetLogsResMutableBuilder[Self <: ReadonlyPromiseGetLogsRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[GetLogsResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[GetLogsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
