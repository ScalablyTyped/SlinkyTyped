package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import typingsSlinky.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduled", JSImport.Namespace)
@js.native
object internalScheduledScheduledMod extends js.Object {
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
}

