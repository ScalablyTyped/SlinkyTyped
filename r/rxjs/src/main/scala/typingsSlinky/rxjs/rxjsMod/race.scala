package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "race")
@js.native
object race extends js.Object {
  def apply(arg: js.Array[ObservableInput[_]]): typingsSlinky.rxjs.internalObservableMod.Observable[js.Object] = js.native
  def apply(observables: ObservableInput[_]*): typingsSlinky.rxjs.internalObservableMod.Observable[js.Object] = js.native
  def apply[A](a: ObservableInput[A]): typingsSlinky.rxjs.internalObservableMod.Observable[A] = js.native
  def apply[A, B](arg: js.Tuple2[ObservableInput[A], ObservableInput[B]]): typingsSlinky.rxjs.internalObservableMod.Observable[A | B] = js.native
  def apply[A, B](a: ObservableInput[A], b: ObservableInput[B]): typingsSlinky.rxjs.internalObservableMod.Observable[A | B] = js.native
  def apply[A, B, C](arg: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): typingsSlinky.rxjs.internalObservableMod.Observable[A | B | C] = js.native
  def apply[A, B, C](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C]): typingsSlinky.rxjs.internalObservableMod.Observable[A | B | C] = js.native
  def apply[A, B, C, D](arg: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): typingsSlinky.rxjs.internalObservableMod.Observable[A | B | C | D] = js.native
  def apply[A, B, C, D](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C], d: ObservableInput[D]): typingsSlinky.rxjs.internalObservableMod.Observable[A | B | C | D] = js.native
  def apply[A, B, C, D, E](
    arg: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[A | B | C | D | E] = js.native
  def apply[A, B, C, D, E](
    a: ObservableInput[A],
    b: ObservableInput[B],
    c: ObservableInput[C],
    d: ObservableInput[D],
    e: ObservableInput[E]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[A | B | C | D | E] = js.native
}

