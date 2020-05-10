package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * Information needed to clear the timer.
    */
  var clearTimer: js.UndefOr[ClearTimerAction] = js.native
  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis Data Firehose delivery stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.native
  /**
    * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that triggered the action.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.native
  /**
    * Publishes an MQTT message with the given topic to the AWS IoT message broker.
    */
  var iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.native
  /**
    * Calls a Lambda function, passing in information about the detector model instance and the event that triggered the action.
    */
  var lambda: js.UndefOr[LambdaAction] = js.native
  /**
    * Information needed to reset the timer.
    */
  var resetTimer: js.UndefOr[ResetTimerAction] = js.native
  /**
    * Information needed to set the timer.
    */
  var setTimer: js.UndefOr[SetTimerAction] = js.native
  /**
    * Sets a variable to a specified value.
    */
  var setVariable: js.UndefOr[SetVariableAction] = js.native
  /**
    * Sends an Amazon SNS message.
    */
  var sns: js.UndefOr[SNSTopicPublishAction] = js.native
  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.native
}

object Action {
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearTimer(value: ClearTimerAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withFirehose(value: FirehoseAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firehose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirehose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firehose")(js.undefined)
        ret
    }
    @scala.inline
    def withIotEvents(value: IotEventsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withIotTopicPublish(value: IotTopicPublishAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotTopicPublish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotTopicPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotTopicPublish")(js.undefined)
        ret
    }
    @scala.inline
    def withLambda(value: LambdaAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(js.undefined)
        ret
    }
    @scala.inline
    def withResetTimer(value: ResetTimerAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTimer(value: SetTimerAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVariable(value: SetVariableAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withSns(value: SNSTopicPublishAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(js.undefined)
        ret
    }
    @scala.inline
    def withSqs(value: SqsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(js.undefined)
        ret
    }
  }
  
}

