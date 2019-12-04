package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/zipAll", JSImport.Namespace)
@js.native
object internalOperatorsZipAllMod extends js.Object {
  def zipAll[T](): OperatorFunction[ObservableInput[T], js.Array[T]] = js.native
  def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
}

