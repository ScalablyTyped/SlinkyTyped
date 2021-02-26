package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exhaustMapMod {
  
  @JSImport("rxjs/internal/operators/exhaustMap", "exhaustMap")
  @js.native
  def exhaustMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators/exhaustMap", "exhaustMap")
  @js.native
  def exhaustMap[T, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.UndefOr[scala.Nothing]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators/exhaustMap", "exhaustMap")
  @js.native
  def exhaustMap[T, I, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[I]],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
}
