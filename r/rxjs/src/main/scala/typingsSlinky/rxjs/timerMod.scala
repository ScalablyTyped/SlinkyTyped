package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/timer", JSImport.Namespace)
@js.native
object timerMod extends js.Object {
  def timer(): Observable[Double] = js.native
  def timer(
    dueTime: js.UndefOr[scala.Nothing],
    periodOrScheduler: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.Date): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
}

