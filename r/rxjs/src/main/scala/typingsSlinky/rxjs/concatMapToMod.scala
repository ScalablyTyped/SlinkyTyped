package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/concatMapTo", JSImport.Namespace)
@js.native
object concatMapToMod extends js.Object {
  
  def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O, resultSelector: js.UndefOr[scala.Nothing]): OperatorFunction[T, ObservedValueOf[O]] = js.native
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
