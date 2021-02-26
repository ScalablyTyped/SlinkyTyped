package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromMod {
  
  @JSImport("rxjs/internal/observable/from", "from")
  @js.native
  def from[O /* <: ObservableInput[_] */](input: O): Observable[ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/observable/from", "from")
  @js.native
  def from[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = js.native
}
