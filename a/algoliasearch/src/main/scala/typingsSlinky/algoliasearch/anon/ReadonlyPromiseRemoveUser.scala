package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliaClientSearch.mod.RemoveUserIDResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.RemoveUserIDResponse>> */
@js.native
trait ReadonlyPromiseRemoveUser extends StObject {
  
  def `catch`[TResult](): js.Promise[RemoveUserIDResponse | TResult] = js.native
  
  def `finally`(): js.Promise[RemoveUserIDResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseRemoveUser {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[RemoveUserIDResponse | js.Any],
    `finally`: () => js.Promise[RemoveUserIDResponse],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyPromiseRemoveUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseRemoveUser]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseRemoveUserMutableBuilder[Self <: ReadonlyPromiseRemoveUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[RemoveUserIDResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[RemoveUserIDResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
