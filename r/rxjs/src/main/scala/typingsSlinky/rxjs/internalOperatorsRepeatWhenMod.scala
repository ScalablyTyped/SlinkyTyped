package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/repeatWhen", JSImport.Namespace)
@js.native
object internalOperatorsRepeatWhenMod extends js.Object {
  def repeatWhen[T](notifier: js.Function1[/* notifications */ Observable[_], Observable[_]]): MonoTypeOperatorFunction[T] = js.native
}

