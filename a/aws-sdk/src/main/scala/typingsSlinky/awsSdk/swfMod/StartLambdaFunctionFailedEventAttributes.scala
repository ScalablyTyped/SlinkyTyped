package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLambdaFunctionFailedEventAttributes extends js.Object {
  /**
    * The cause of the failure. To help diagnose issues, use this information to trace back the chain of events leading up to this event.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because the IAM role attached to the execution lacked sufficient permissions. For details and example IAM policies, see Lambda Tasks in the Amazon SWF Developer Guide. 
    */
  var cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.native
  /**
    * A description that can help diagnose the cause of the fault.
    */
  var message: js.UndefOr[CauseMessage] = js.native
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: js.UndefOr[EventId] = js.native
}

object StartLambdaFunctionFailedEventAttributes {
  @scala.inline
  def apply(): StartLambdaFunctionFailedEventAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLambdaFunctionFailedEventAttributes]
  }
  @scala.inline
  implicit class StartLambdaFunctionFailedEventAttributesOps[Self <: StartLambdaFunctionFailedEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCause(value: StartLambdaFunctionFailedCause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: CauseMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledEventId")(js.undefined)
        ret
    }
  }
  
}

