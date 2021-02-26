package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayWhenMod {
  
  @JSImport("rxjs/internal/operators/delayWhen", "delayWhen")
  @js.native
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]]
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/delayWhen", "delayWhen")
  @js.native
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]],
    subscriptionDelay: Observable[_]
  ): MonoTypeOperatorFunction[T] = js.native
}
