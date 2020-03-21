package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.rxjsNumbers.`-1`
import typingsSlinky.rxjs.rxjsNumbers.`0`
import typingsSlinky.rxjs.rxjsNumbers.`1`
import typingsSlinky.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualAction")
@js.native
class VirtualAction[T] protected ()
  extends typingsSlinky.rxjs.virtualTimeSchedulerMod.VirtualAction[T] {
  def this(
    scheduler: typingsSlinky.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
  ) = this()
  def this(
    scheduler: typingsSlinky.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    index: Double
  ) = this()
}

/* static members */
@JSImport("rxjs", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](
    a: typingsSlinky.rxjs.virtualTimeSchedulerMod.VirtualAction[T],
    b: typingsSlinky.rxjs.virtualTimeSchedulerMod.VirtualAction[T]
  ): `1` | `0` | `-1` = js.native
}

