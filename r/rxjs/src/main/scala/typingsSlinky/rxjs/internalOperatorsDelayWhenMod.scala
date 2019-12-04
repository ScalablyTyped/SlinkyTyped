package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/delayWhen", JSImport.Namespace)
@js.native
object internalOperatorsDelayWhenMod extends js.Object {
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]]
  ): MonoTypeOperatorFunction[T] = js.native
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]],
    subscriptionDelay: Observable[_]
  ): MonoTypeOperatorFunction[T] = js.native
}

