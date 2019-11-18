package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "iif")
@js.native
object iif extends js.Object {
  def apply[T, F](condition: js.Function0[Boolean]): typingsSlinky.rxjs.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): typingsSlinky.rxjs.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[Boolean],
    trueResult: SubscribableOrPromise[T],
    falseResult: SubscribableOrPromise[F]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | F] = js.native
}

