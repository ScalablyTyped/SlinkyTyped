package typingsSlinky.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var event: String = js.native
  var eventData: js.UndefOr[EventActionJumpUrl | EventActionCall | EventActionEvent] = js.native
  var eventIndex: Double = js.native
  var `type`: String = js.native
  var typeData: js.UndefOr[EventTriggerEvent] = js.native
  /**
    * 因为事件可能 type 相同，因此记录是第几个
    */
  var typeIndex: Double = js.native
}

object EventData {
  @scala.inline
  def apply(event: String, eventIndex: Double, `type`: String, typeIndex: Double): EventData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventIndex = eventIndex.asInstanceOf[js.Any], typeIndex = typeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventData(value: EventActionJumpUrl | EventActionCall | EventActionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventData")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeData(value: EventTriggerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeData")(js.undefined)
        ret
    }
  }
  
}

