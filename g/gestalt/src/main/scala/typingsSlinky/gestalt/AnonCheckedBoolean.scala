package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckedBoolean extends js.Object {
  var checked: Boolean = js.native
  var event: SyntheticEvent[Event_, HTMLElement] = js.native
}

object AnonCheckedBoolean {
  @scala.inline
  def apply(checked: Boolean, event: SyntheticEvent[Event_, HTMLElement]): AnonCheckedBoolean = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckedBoolean]
  }
  @scala.inline
  implicit class AnonCheckedBooleanOps[Self <: AnonCheckedBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: SyntheticEvent[Event_, HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

