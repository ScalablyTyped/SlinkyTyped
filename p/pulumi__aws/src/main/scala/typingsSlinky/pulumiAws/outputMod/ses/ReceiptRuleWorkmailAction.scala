package typingsSlinky.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleWorkmailAction extends js.Object {
  /**
    * The ARN of the WorkMail organization
    */
  var organizationArn: String = js.native
  /**
    * The position of the action in the receipt rule
    */
  var position: Double = js.native
  /**
    * The ARN of an SNS topic to notify
    */
  var topicArn: js.UndefOr[String] = js.native
}

object ReceiptRuleWorkmailAction {
  @scala.inline
  def apply(organizationArn: String, position: Double): ReceiptRuleWorkmailAction = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleWorkmailAction]
  }
  @scala.inline
  implicit class ReceiptRuleWorkmailActionOps[Self <: ReceiptRuleWorkmailAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationArn")(value.asInstanceOf[js.Any])
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

