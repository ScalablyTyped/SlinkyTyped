package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "defer")
@js.native
object defer extends js.Object {
  def apply[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): typingsSlinky.rxjs.internalObservableMod.Observable[ObservedValueOf[R]] = js.native
}

