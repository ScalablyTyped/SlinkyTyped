package typingsSlinky.momentRange.mod.momentAugmentingMod

import typingsSlinky.momentRange.mod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def isRange(range: js.Any): Boolean = js.native
  def within(range: DateRange): Boolean = js.native
}

object Moment {
  @scala.inline
  def apply(isRange: js.Any => Boolean, within: DateRange => Boolean): Moment = {
    val __obj = js.Dynamic.literal(isRange = js.Any.fromFunction1(isRange), within = js.Any.fromFunction1(within))
    __obj.asInstanceOf[Moment]
  }
  @scala.inline
  implicit class MomentOps[Self <: Moment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRange(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithin(value: DateRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("within")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

