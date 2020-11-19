package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/bufferToggle", JSImport.Namespace)
@js.native
object bufferToggleMod extends js.Object {
  
  def bufferToggle[T, O](
    openings: SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[_]]
  ): OperatorFunction[T, js.Array[T]] = js.native
}
