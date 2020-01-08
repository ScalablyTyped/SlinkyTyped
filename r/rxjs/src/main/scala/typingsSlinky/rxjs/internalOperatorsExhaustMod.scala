package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/exhaust", JSImport.Namespace)
@js.native
object internalOperatorsExhaustMod extends js.Object {
  def exhaust[R](): OperatorFunction[_, R] = js.native
  @JSName("exhaust")
  def exhaust_T[T](): OperatorFunction[ObservableInput[T], T] = js.native
}

