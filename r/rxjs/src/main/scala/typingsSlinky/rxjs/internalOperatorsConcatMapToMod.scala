package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/concatMapTo", JSImport.Namespace)
@js.native
object internalOperatorsConcatMapToMod extends js.Object {
  def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def concatMapTo[T, R, O /* <: ObservableInput[_] */](
    observable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
}

