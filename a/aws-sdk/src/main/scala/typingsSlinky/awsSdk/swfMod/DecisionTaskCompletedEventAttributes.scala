package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecisionTaskCompletedEventAttributes extends js.Object {
  /**
    * User defined context for the workflow execution.
    */
  var executionContext: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
  /**
    * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
}

object DecisionTaskCompletedEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId): DecisionTaskCompletedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskCompletedEventAttributes]
  }
  @scala.inline
  implicit class DecisionTaskCompletedEventAttributesOps[Self <: DecisionTaskCompletedEventAttributes] (val x: Self) extends AnyVal {
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
    def withExecutionContext(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContext")(js.undefined)
        ret
    }
  }
  
}

