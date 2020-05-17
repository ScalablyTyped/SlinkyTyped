package typingsSlinky.reactWidgets.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalEvent extends js.Object {
  var originalEvent: js.Any = js.native
}

object OriginalEvent {
  @scala.inline
  def apply(originalEvent: js.Any): OriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEvent]
  }
  @scala.inline
  implicit class OriginalEventOps[Self <: OriginalEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

