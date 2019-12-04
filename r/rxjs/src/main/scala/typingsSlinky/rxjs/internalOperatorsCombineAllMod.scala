package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/combineAll", JSImport.Namespace)
@js.native
object internalOperatorsCombineAllMod extends js.Object {
  def combineAll[T](): OperatorFunction[ObservableInput[T], js.Array[T]] = js.native
  def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
}

