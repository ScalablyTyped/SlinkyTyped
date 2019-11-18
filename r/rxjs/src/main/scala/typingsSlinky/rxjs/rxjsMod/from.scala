package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "from")
@js.native
object from extends js.Object {
  def apply[O /* <: ObservableInput[_] */](input: O): typingsSlinky.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
  def apply[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
}

