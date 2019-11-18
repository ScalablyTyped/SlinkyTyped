package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/timer", JSImport.Namespace)
@js.native
object internalObservableTimerMod extends js.Object {
  def timer(): Observable[Double] = js.native
  def timer(dueTime: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Date): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
}

