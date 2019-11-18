package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/from", JSImport.Namespace)
@js.native
object internalObservableFromMod extends js.Object {
  def from[O /* <: ObservableInput[_] */](input: O): Observable[ObservedValueOf[O]] = js.native
  def from[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = js.native
}

