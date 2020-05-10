package typingsSlinky.ngxInfiniteScroll.eventTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITriggerEvents extends js.Object {
  def down(event: js.Any): js.Any = js.native
  def up(event: js.Any): js.Any = js.native
}

object ITriggerEvents {
  @scala.inline
  def apply(down: js.Any => js.Any, up: js.Any => js.Any): ITriggerEvents = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[ITriggerEvents]
  }
  @scala.inline
  implicit class ITriggerEventsOps[Self <: ITriggerEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUp(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

