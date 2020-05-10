package typingsSlinky.fullcalendar.momentExtMod.momentAugmentingMod

import typingsSlinky.fullcalendar.momentExtMod.MomentExtDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def hasTime(): Boolean = js.native
  def stripTime(): js.Any = js.native
  def stripZone(): js.Any = js.native
  def time(): MomentExtDuration = js.native
}

object Moment {
  @scala.inline
  def apply(
    hasTime: () => Boolean,
    stripTime: () => js.Any,
    stripZone: () => js.Any,
    time: () => MomentExtDuration
  ): Moment = {
    val __obj = js.Dynamic.literal(hasTime = js.Any.fromFunction0(hasTime), stripTime = js.Any.fromFunction0(stripTime), stripZone = js.Any.fromFunction0(stripZone), time = js.Any.fromFunction0(time))
    __obj.asInstanceOf[Moment]
  }
  @scala.inline
  implicit class MomentOps[Self <: Moment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasTime(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStripTime(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStripZone(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTime(value: () => MomentExtDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

