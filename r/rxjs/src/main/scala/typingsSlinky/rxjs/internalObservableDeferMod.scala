package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/defer", JSImport.Namespace)
@js.native
object internalObservableDeferMod extends js.Object {
  def defer[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = js.native
}

