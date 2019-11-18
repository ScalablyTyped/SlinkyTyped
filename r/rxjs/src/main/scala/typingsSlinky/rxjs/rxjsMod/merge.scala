package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "merge")
@js.native
object merge extends js.Object {
  def apply[T](observables: (Double | ObservableInput[T] | SchedulerLike)*): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T]): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T], concurrent: Double): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T], concurrent: Double, scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T], scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
}

