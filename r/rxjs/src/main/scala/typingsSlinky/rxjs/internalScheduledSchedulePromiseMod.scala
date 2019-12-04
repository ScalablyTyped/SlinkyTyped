package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/schedulePromise", JSImport.Namespace)
@js.native
object internalScheduledSchedulePromiseMod extends js.Object {
  def schedulePromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

