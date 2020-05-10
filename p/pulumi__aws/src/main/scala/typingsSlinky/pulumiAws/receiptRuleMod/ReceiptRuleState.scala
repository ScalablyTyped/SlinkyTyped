package typingsSlinky.pulumiAws.receiptRuleMod

import typingsSlinky.pulumiAws.inputMod.ses.ReceiptRuleAddHeaderAction
import typingsSlinky.pulumiAws.inputMod.ses.ReceiptRuleBounceAction
import typingsSlinky.pulumiAws.inputMod.ses.ReceiptRuleLambdaAction
import typingsSlinky.pulumiAws.inputMod.ses.ReceiptRuleS3Action
import typingsSlinky.pulumiAws.inputMod.ses.ReceiptRuleSnsAction
import typingsSlinky.pulumiAws.inputMod.ses.ReceiptRuleStopAction
import typingsSlinky.pulumiAws.inputMod.ses.ReceiptRuleWorkmailAction
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleState extends js.Object {
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleAddHeaderAction]]]] = js.native
  /**
    * The name of the rule to place this rule after
    */
  val after: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleBounceAction]]]] = js.native
  /**
    * If true, the rule will be enabled
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleLambdaAction]]]] = js.native
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of email addresses
    */
  val recipients: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[Input[String]] = js.native
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: js.UndefOr[Input[js.Array[Input[ReceiptRuleS3Action]]]] = js.native
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleSnsAction]]]] = js.native
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleStopAction]]]] = js.native
  /**
    * Require or Optional
    */
  val tlsPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleWorkmailAction]]]] = js.native
}

object ReceiptRuleState {
  @scala.inline
  def apply(): ReceiptRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptRuleState]
  }
  @scala.inline
  implicit class ReceiptRuleStateOps[Self <: ReceiptRuleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHeaderActions(value: Input[js.Array[Input[ReceiptRuleAddHeaderAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHeaderActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddHeaderActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHeaderActions")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceActions(value: Input[js.Array[Input[ReceiptRuleBounceAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceActions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaActions(value: Input[js.Array[Input[ReceiptRuleLambdaAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaActions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipients(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleSetName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Actions(value: Input[js.Array[Input[ReceiptRuleS3Action]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Actions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Actions")(js.undefined)
        ret
    }
    @scala.inline
    def withScanEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsActions(value: Input[js.Array[Input[ReceiptRuleSnsAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsActions")(js.undefined)
        ret
    }
    @scala.inline
    def withStopActions(value: Input[js.Array[Input[ReceiptRuleStopAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopActions")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkmailActions(value: Input[js.Array[Input[ReceiptRuleWorkmailAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workmailActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkmailActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workmailActions")(js.undefined)
        ret
    }
  }
  
}

