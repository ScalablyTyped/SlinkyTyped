package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionScheduledEventAttributes extends js.Object {
  /**
    * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the LambdaFunctionCompleted event corresponding to the decision that resulted in scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The unique ID of the Lambda task.
    */
  var id: FunctionId = js.native
  /**
    * The input provided to the Lambda task.
    */
  var input: js.UndefOr[FunctionInput] = js.native
  /**
    * The name of the Lambda function.
    */
  var name: FunctionName = js.native
  /**
    * The maximum amount of time a worker can take to process the Lambda task.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
}

object LambdaFunctionScheduledEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, id: FunctionId, name: FunctionName): LambdaFunctionScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionScheduledEventAttributes]
  }
  @scala.inline
  implicit class LambdaFunctionScheduledEventAttributesOps[Self <: LambdaFunctionScheduledEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecisionTaskCompletedEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskCompletedEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: FunctionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: FunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: FunctionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withStartToCloseTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startToCloseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartToCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startToCloseTimeout")(js.undefined)
        ret
    }
  }
  
}

