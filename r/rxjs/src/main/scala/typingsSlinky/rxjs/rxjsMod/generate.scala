package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalObservableGenerateMod.ConditionFunc
import typingsSlinky.rxjs.internalObservableGenerateMod.GenerateBaseOptions
import typingsSlinky.rxjs.internalObservableGenerateMod.GenerateOptions
import typingsSlinky.rxjs.internalObservableGenerateMod.IterateFunc
import typingsSlinky.rxjs.internalObservableGenerateMod.ResultFunc
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "generate")
@js.native
object generate extends js.Object {
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): typingsSlinky.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[S](options: GenerateBaseOptions[S]): typingsSlinky.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, S](options: GenerateOptions[T, S]): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
}

