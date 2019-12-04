package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/bufferWhen", JSImport.Namespace)
@js.native
object internalOperatorsBufferWhenMod extends js.Object {
  def bufferWhen[T](closingSelector: js.Function0[Observable[_]]): OperatorFunction[T, js.Array[T]] = js.native
}

