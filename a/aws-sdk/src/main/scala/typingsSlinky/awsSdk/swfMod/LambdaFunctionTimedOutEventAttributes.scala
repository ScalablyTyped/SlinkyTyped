package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionTimedOutEventAttributes extends js.Object {
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
  /**
    * The ID of the ActivityTaskStarted event that was recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  /**
    * The type of the timeout that caused this event.
    */
  var timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.native
}

object LambdaFunctionTimedOutEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId): LambdaFunctionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionTimedOutEventAttributes]
  }
  @scala.inline
  implicit class LambdaFunctionTimedOutEventAttributesOps[Self <: LambdaFunctionTimedOutEventAttributes] (val x: Self) extends AnyVal {
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
    def withTimeoutType(value: LambdaFunctionTimeoutType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutType")(js.undefined)
        ret
    }
  }
  
}

