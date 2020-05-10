package typingsSlinky.rsvp.mod.RSVP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstrumentEvent extends js.Object {
   // guid of promise. Must be globally unique, not just within the implementation
  var childGuid: String = js.native
   // one of ['created', 'chained', 'fulfilled', 'rejected']
  var detail: js.Any = js.native
   // child of child promise (for chained via `then`)
  var eventName: String = js.native
  var guid: String = js.native
   // fulfillment value or rejection reason, if applicable
  var label: String = js.native
   // label passed to promise's constructor
  var timeStamp: Double = js.native
}

object InstrumentEvent {
  @scala.inline
  def apply(
    childGuid: String,
    detail: js.Any,
    eventName: String,
    guid: String,
    label: String,
    timeStamp: Double
  ): InstrumentEvent = {
    val __obj = js.Dynamic.literal(childGuid = childGuid.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentEvent]
  }
  @scala.inline
  implicit class InstrumentEventOps[Self <: InstrumentEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

