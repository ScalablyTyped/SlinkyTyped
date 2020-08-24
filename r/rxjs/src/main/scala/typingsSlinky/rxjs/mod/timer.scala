package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "timer")
@js.native
object timer extends js.Object {
  def apply(): Observable[Double] = js.native
  def apply(
    dueTime: js.UndefOr[scala.Nothing],
    periodOrScheduler: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.Date): Observable[Double] = js.native
  def apply(dueTime: js.Date, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.Date, periodOrScheduler: Double): Observable[Double] = js.native
  def apply(dueTime: js.Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.Date, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
}

