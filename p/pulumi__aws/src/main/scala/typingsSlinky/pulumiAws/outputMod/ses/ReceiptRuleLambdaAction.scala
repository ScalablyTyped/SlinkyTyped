package typingsSlinky.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleLambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function to invoke
    */
  var functionArn: String = js.native
  /**
    * Event or RequestResponse
    */
  var invocationType: String = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.native
}

object ReceiptRuleLambdaAction {
  @scala.inline
  def apply(functionArn: String, invocationType: String, position: Double): ReceiptRuleLambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleLambdaAction]
  }
  @scala.inline
  implicit class ReceiptRuleLambdaActionOps[Self <: ReceiptRuleLambdaAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(js.undefined)
        ret
    }
  }
  
}

