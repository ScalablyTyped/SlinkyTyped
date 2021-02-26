package typingsSlinky.algoliaClientSearch.anon

import typingsSlinky.algoliaClientSearch.mod.Synonym
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Synonym>> */
@js.native
trait ReadonlyPromiseSynonym extends StObject {
  
  def `catch`[TResult](): js.Promise[Synonym | TResult] = js.native
  
  def `finally`(): js.Promise[Synonym] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseSynonym {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Synonym | js.Any],
    `finally`: () => js.Promise[Synonym],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyPromiseSynonym = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSynonym]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseSynonymMutableBuilder[Self <: ReadonlyPromiseSynonym] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[Synonym | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[Synonym]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
