package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEventPatternRequest extends js.Object {
  /**
    * The event, in JSON format, to test against the event pattern.
    */
  var Event: String = js.native
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: typingsSlinky.awsSdk.eventbridgeMod.EventPattern = js.native
}

object TestEventPatternRequest {
  @scala.inline
  def apply(Event: String, EventPattern: EventPattern): TestEventPatternRequest = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], EventPattern = EventPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEventPatternRequest]
  }
  @scala.inline
  implicit class TestEventPatternRequestOps[Self <: TestEventPatternRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPattern(value: EventPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventPattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

