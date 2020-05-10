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
  def timer(dueTime: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.Date): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
}

