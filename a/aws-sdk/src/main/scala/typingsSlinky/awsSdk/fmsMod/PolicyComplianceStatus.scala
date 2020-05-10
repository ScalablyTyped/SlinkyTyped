package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyComplianceStatus extends js.Object {
  /**
    * An array of EvaluationResult objects.
    */
  var EvaluationResults: js.UndefOr[typingsSlinky.awsSdk.fmsMod.EvaluationResults] = js.native
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typingsSlinky.awsSdk.fmsMod.IssueInfoMap] = js.native
  /**
    * Timestamp of the last update to the EvaluationResult objects.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.native
  /**
    * The member account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyId] = js.native
  /**
    * The friendly name of the AWS Firewall Manager policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.native
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.native
}

object PolicyComplianceStatus {
  @scala.inline
  def apply(): PolicyComplianceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyComplianceStatus]
  }
  @scala.inline
  implicit class PolicyComplianceStatusOps[Self <: PolicyComplianceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationResults(value: EvaluationResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResults")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueInfoMap(value: IssueInfoMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssueInfoMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueInfoMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssueInfoMap")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberAccount(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyId(value: PolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyOwner(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyOwner")(js.undefined)
        ret
    }
  }
  
}

