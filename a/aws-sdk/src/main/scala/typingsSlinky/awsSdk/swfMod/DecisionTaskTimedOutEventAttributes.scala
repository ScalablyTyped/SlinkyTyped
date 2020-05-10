package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecisionTaskTimedOutEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
  /**
    * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  /**
    * The type of timeout that expired before the decision task could be completed.
    */
  var timeoutType: DecisionTaskTimeoutType = js.native
}

object DecisionTaskTimedOutEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, timeoutType: DecisionTaskTimeoutType): DecisionTaskTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], timeoutType = timeoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskTimedOutEventAttributes]
  }
  @scala.inline
  implicit class DecisionTaskTimedOutEventAttributesOps[Self <: DecisionTaskTimedOutEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduledEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutType(value: DecisionTaskTimeoutType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

