package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * Describes an AWS account's compliance with the AWS Firewall Manager policy.
    */
  var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.native
  /**
    * Indicates that over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.native
  /**
    * The number of resources that are noncompliant with the specified policy. For AWS WAF and Shield Advanced policies, a resource is considered noncompliant if it is not associated with the policy. For security group policies, a resource is considered noncompliant if it doesn't comply with the rules of the policy and remediation is disabled or not possible.
    */
  var ViolatorCount: js.UndefOr[ResourceCount] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  @scala.inline
  implicit class EvaluationResultOps[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceStatus(value: PolicyComplianceStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceStatus")(js.undefined)
        ret
    }
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
    def withViolatorCount(value: ResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViolatorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolatorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViolatorCount")(js.undefined)
        ret
    }
  }
  
}

