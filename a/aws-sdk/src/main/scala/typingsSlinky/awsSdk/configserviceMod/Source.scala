package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /**
    * Indicates whether AWS or the customer owns and manages the AWS Config rule.
    */
  var Owner: typingsSlinky.awsSdk.configserviceMod.Owner = js.native
  /**
    * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
    */
  var SourceDetails: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.SourceDetails] = js.native
  /**
    * For AWS Config managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see Using AWS Managed Config Rules. For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name.
    */
  var SourceIdentifier: StringWithCharLimit256 = js.native
}

object Source {
  @scala.inline
  def apply(Owner: Owner, SourceIdentifier: StringWithCharLimit256): Source = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any], SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: Owner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceIdentifier(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDetails(value: SourceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDetails")(js.undefined)
        ret
    }
  }
  
}

