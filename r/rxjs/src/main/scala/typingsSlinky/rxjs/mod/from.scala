package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "from")
@js.native
object from extends js.Object {
  def apply[O /* <: ObservableInput[_] */](input: O): Observable[ObservedValueOf[O]] = js.native
  def apply[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = js.native
}

