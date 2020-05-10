package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCondition extends js.Object {
  /**
    * The dimensions for the event filter to use for the activity.
    */
  var Dimensions: EventDimensions = js.native
  /**
    * The message identifier (message_id) for the message to use when determining whether message events meet the condition.
    */
  var MessageActivity: js.UndefOr[string] = js.native
}

object EventCondition {
  @scala.inline
  def apply(Dimensions: EventDimensions): EventCondition = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCondition]
  }
  @scala.inline
  implicit class EventConditionOps[Self <: EventCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: EventDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageActivity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageActivity")(js.undefined)
        ret
    }
  }
  
}

