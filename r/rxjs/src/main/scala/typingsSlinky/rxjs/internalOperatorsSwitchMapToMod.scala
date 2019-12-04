package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/switchMapTo", JSImport.Namespace)
@js.native
object internalOperatorsSwitchMapToMod extends js.Object {
  def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[_, R] = js.native
  def switchMapTo[T, I, R](
    observable: ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  @JSName("switchMapTo")
  def switchMapTo_TR[T, R](observable: ObservableInput[R]): OperatorFunction[T, R] = js.native
}

