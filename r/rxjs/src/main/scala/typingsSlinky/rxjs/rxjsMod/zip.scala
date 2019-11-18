package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "zip")
@js.native
object zip extends js.Object {
  def apply[O /* <: ObservableInput[_] */](array: js.Array[O]): typingsSlinky.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O]]] = js.native
  def apply[R](array: js.Array[ObservableInput[_]], resultSelector: js.Function1[/* repeated */ js.Any, R]): typingsSlinky.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O /* <: ObservableInput[_] */](observables: O*): typingsSlinky.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): typingsSlinky.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): typingsSlinky.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): typingsSlinky.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): typingsSlinky.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): typingsSlinky.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): typingsSlinky.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[R] = js.native
}

