package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/takeUntil", JSImport.Namespace)
@js.native
object internalOperatorsTakeUntilMod extends js.Object {
  def takeUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

