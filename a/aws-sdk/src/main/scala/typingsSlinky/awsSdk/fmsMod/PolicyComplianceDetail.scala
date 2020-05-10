package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyComplianceDetail extends js.Object {
  /**
    * Indicates if over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.native
  /**
    * A timestamp that indicates when the returned information should be considered out of date.
    */
  var ExpiredAt: js.UndefOr[js.Date] = js.native
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typingsSlinky.awsSdk.fmsMod.IssueInfoMap] = js.native
  /**
    * The AWS account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyId] = js.native
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.native
  /**
    * An array of resources that aren't protected by the AWS WAF or Shield Advanced policy or that aren't in compliance with the security group policy.
    */
  var Violators: js.UndefOr[ComplianceViolators] = js.native
}

object PolicyComplianceDetail {
  @scala.inline
  def apply(): PolicyComplianceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyComplianceDetail]
  }
  @scala.inline
  implicit class PolicyComplianceDetailOps[Self <: PolicyComplianceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationLimitExceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationLimitExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationLimitExceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationLimitExceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiredAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiredAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiredAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiredAt")(js.undefined)
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
    @scala.inline
    def withViolators(value: ComplianceViolators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Violators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Violators")(js.undefined)
        ret
    }
  }
  
}

