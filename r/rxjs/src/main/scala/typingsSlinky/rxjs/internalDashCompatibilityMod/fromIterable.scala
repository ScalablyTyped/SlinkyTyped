package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "fromIterable")
@js.native
object fromIterable extends js.Object {
  def apply[T](input: js.Iterable[T]): Observable[T] = js.native
  def apply[T](input: js.Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

