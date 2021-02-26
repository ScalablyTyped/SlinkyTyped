package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMapToMod {
  
  @JSImport("rxjs/internal/operators/mergeMapTo", "mergeMapTo")
  @js.native
  def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O): OperatorFunction[_, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators/mergeMapTo", "mergeMapTo")
  @js.native
  def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O, concurrent: Double): OperatorFunction[_, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators/mergeMapTo", "mergeMapTo")
  @js.native
  def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators/mergeMapTo", "mergeMapTo")
  @js.native
  def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
}
