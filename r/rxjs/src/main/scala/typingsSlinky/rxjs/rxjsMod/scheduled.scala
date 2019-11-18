package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "scheduled")
@js.native
object scheduled extends js.Object {
  def apply[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
}

