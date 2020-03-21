package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.InteropObservable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduleObservable", JSImport.Namespace)
@js.native
object scheduleObservableMod extends js.Object {
  def scheduleObservable[T](input: InteropObservable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

