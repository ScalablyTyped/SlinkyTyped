package typingsSlinky.algoliaClientSearch.anon

import typingsSlinky.algoliaClientSearch.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Settings>> */
@js.native
trait ReadonlyPromiseSettings extends StObject {
  
  def `catch`[TResult](): js.Promise[Settings | TResult] = js.native
  
  def `finally`(): js.Promise[Settings] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseSettings {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Settings | js.Any],
    `finally`: () => js.Promise[Settings],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyPromiseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSettings]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseSettingsMutableBuilder[Self <: ReadonlyPromiseSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[Settings | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[Settings]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
