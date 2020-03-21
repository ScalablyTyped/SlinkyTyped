package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.generateMod.ConditionFunc
import typingsSlinky.rxjs.generateMod.GenerateBaseOptions
import typingsSlinky.rxjs.generateMod.GenerateOptions
import typingsSlinky.rxjs.generateMod.IterateFunc
import typingsSlinky.rxjs.generateMod.ResultFunc
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "generate")
@js.native
object generate extends js.Object {
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): Observable[S] = js.native
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): Observable[S] = js.native
  def apply[S](options: GenerateBaseOptions[S]): Observable[S] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): Observable[T] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): Observable[T] = js.native
  def apply[T, S](options: GenerateOptions[T, S]): Observable[T] = js.native
}

