package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferMod {
  
  @JSImport("rxjs/internal/observable/defer", "defer")
  @js.native
  def defer[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = js.native
}
