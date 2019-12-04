package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import typingsSlinky.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/bufferToggle", JSImport.Namespace)
@js.native
object internalOperatorsBufferToggleMod extends js.Object {
  def bufferToggle[T, O](
    openings: SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[_]]
  ): OperatorFunction[T, js.Array[T]] = js.native
}

