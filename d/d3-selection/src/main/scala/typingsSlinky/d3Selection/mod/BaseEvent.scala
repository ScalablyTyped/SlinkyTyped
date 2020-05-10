package typingsSlinky.d3Selection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEvent extends js.Object {
  /**
    * The prior value of d3.event, allowing custom events to retain a reference to the originating native event.
    */
  var sourceEvent: js.UndefOr[js.Any] = js.native
  /**
    * Event type
    */
  var `type`: String = js.native
}

object BaseEvent {
  @scala.inline
  def apply(`type`: String): BaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
  @scala.inline
  implicit class BaseEventOps[Self <: BaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEvent")(js.undefined)
        ret
    }
  }
  
}

