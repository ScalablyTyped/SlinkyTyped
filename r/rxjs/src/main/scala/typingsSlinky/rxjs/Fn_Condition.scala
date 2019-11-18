package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Condition extends js.Object {
  def apply[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
  def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[Boolean],
    trueResult: SubscribableOrPromise[T],
    falseResult: SubscribableOrPromise[F]
  ): Observable[T | F] = js.native
}

