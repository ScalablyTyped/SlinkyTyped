package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.Unsubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/using", JSImport.Namespace)
@js.native
object usingMod extends js.Object {
  
  def using[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): Observable[T] = js.native
}
