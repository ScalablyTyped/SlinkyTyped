package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalTypesMod.SchedulerAction
import typingsSlinky.rxjs.rxjsNumbers.`-1`
import typingsSlinky.rxjs.rxjsNumbers.`0`
import typingsSlinky.rxjs.rxjsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualAction")
@js.native
class VirtualAction[T] protected ()
  extends typingsSlinky.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T] {
  def this(
    scheduler: typingsSlinky.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
  ) = this()
  def this(
    scheduler: typingsSlinky.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    index: Double
  ) = this()
}

/* static members */
@JSImport("rxjs", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](
    a: typingsSlinky.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T],
    b: typingsSlinky.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T]
  ): `1` | `0` | `-1` = js.native
}

