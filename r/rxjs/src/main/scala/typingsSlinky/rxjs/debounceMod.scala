package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SubscribableOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("rxjs/internal/operators/debounce", "debounce")
  @js.native
  def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
}
