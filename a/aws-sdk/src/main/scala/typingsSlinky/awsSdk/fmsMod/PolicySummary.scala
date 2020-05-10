package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The ID of the specified policy.
    */
  var PolicyId: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyId] = js.native
  /**
    * The friendly name of the specified policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.native
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. 
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ResourceType] = js.native
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy.
    */
  var SecurityServiceType: js.UndefOr[typingsSlinky.awsSdk.fmsMod.SecurityServiceType] = js.native
}

object PolicySummary {
  @scala.inline
  def apply(): PolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicySummary]
  }
  @scala.inline
  implicit class PolicySummaryOps[Self <: PolicySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(js.undefined)
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
    def withRemediationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityServiceType(value: SecurityServiceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityServiceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityServiceType")(js.undefined)
        ret
    }
  }
  
}

