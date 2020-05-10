package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptAction extends js.Object {
  /**
    * Adds a header to the received email.
    */
  var AddHeaderAction: js.UndefOr[typingsSlinky.awsSdk.sesMod.AddHeaderAction] = js.native
  /**
    * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    */
  var BounceAction: js.UndefOr[typingsSlinky.awsSdk.sesMod.BounceAction] = js.native
  /**
    * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
    */
  var LambdaAction: js.UndefOr[typingsSlinky.awsSdk.sesMod.LambdaAction] = js.native
  /**
    * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon SNS.
    */
  var S3Action: js.UndefOr[typingsSlinky.awsSdk.sesMod.S3Action] = js.native
  /**
    * Publishes the email content within a notification to Amazon SNS.
    */
  var SNSAction: js.UndefOr[typingsSlinky.awsSdk.sesMod.SNSAction] = js.native
  /**
    * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
    */
  var StopAction: js.UndefOr[typingsSlinky.awsSdk.sesMod.StopAction] = js.native
  /**
    * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
    */
  var WorkmailAction: js.UndefOr[typingsSlinky.awsSdk.sesMod.WorkmailAction] = js.native
}

object ReceiptAction {
  @scala.inline
  def apply(): ReceiptAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptAction]
  }
  @scala.inline
  implicit class ReceiptActionOps[Self <: ReceiptAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHeaderAction(value: AddHeaderAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddHeaderAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddHeaderAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddHeaderAction")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceAction(value: BounceAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaAction(value: LambdaAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaAction")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Action(value: S3Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Action")(js.undefined)
        ret
    }
    @scala.inline
    def withSNSAction(value: SNSAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSNSAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSAction")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAction(value: StopAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopAction")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkmailAction(value: WorkmailAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkmailAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkmailAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkmailAction")(js.undefined)
        ret
    }
  }
  
}

