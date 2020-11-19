package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/from", JSImport.Namespace)
@js.native
object fromMod extends js.Object {
  
  def from[O /* <: ObservableInput[_] */](input: O): Observable[ObservedValueOf[O]] = js.native
  def from[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = js.native
}
