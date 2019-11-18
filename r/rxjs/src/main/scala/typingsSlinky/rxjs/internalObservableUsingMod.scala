package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.Unsubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/using", JSImport.Namespace)
@js.native
object internalObservableUsingMod extends js.Object {
  def using[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): Observable[T] = js.native
}

