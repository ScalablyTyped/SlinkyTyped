package typingsSlinky.inboxsdk.mod.Common

import typingsSlinky.inboxsdk.inboxsdkStrings.escape
import typingsSlinky.inboxsdk.inboxsdkStrings.outsideInteraction
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreAutoCloseEvent extends js.Object {
  var cause: Event_ = js.native
  var `type`: outsideInteraction | escape = js.native
  def cancel(): Unit = js.native
}

object PreAutoCloseEvent {
  @scala.inline
  def apply(cancel: () => Unit, cause: Event_, `type`: outsideInteraction | escape): PreAutoCloseEvent = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cause = cause.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAutoCloseEvent]
  }
  @scala.inline
  implicit class PreAutoCloseEventOps[Self <: PreAutoCloseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCause(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: outsideInteraction | escape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

