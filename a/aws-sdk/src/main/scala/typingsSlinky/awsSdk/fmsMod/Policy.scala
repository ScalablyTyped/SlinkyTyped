package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /**
    * Specifies the AWS account IDs to exclude from the policy. The IncludeMap values are evaluated first, with all the appropriate account IDs added to the policy. Then the accounts listed in ExcludeMap are removed, resulting in the final list of accounts to add to the policy. The key to the map is ACCOUNT. For example, a valid ExcludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
    */
  var ExcludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.native
  /**
    * If set to True, resources with the tags that are specified in the ResourceTag array are not in scope of the policy. If set to False, and the ResourceTag array is not null, only resources with the specified tags are in scope of the policy.
    */
  var ExcludeResourceTags: Boolean = js.native
  /**
    * Specifies the AWS account IDs to include in the policy. If IncludeMap is null, all accounts in the organization in AWS Organizations are included in the policy. If IncludeMap is not null, only values listed in IncludeMap are included in the policy. The key to the map is ACCOUNT. For example, a valid IncludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
    */
  var IncludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyId] = js.native
  /**
    * The friendly name of the AWS Firewall Manager policy.
    */
  var PolicyName: ResourceName = js.native
  /**
    * A unique identifier for each update to the policy. When issuing a PutPolicy request, the PolicyUpdateToken in the request must match the PolicyUpdateToken of the current policy version. To get the PolicyUpdateToken of the current policy version, use a GetPolicy request.
    */
  var PolicyUpdateToken: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyUpdateToken] = js.native
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: Boolean = js.native
  /**
    * An array of ResourceTag objects.
    */
  var ResourceTags: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ResourceTags] = js.native
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. 
    */
  var ResourceType: typingsSlinky.awsSdk.fmsMod.ResourceType = js.native
  /**
    * An array of ResourceType.
    */
  var ResourceTypeList: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ResourceTypeList] = js.native
  /**
    * Details about the security service that is being used to protect the resources.
    */
  var SecurityServicePolicyData: typingsSlinky.awsSdk.fmsMod.SecurityServicePolicyData = js.native
}

object Policy {
  @scala.inline
  def apply(
    ExcludeResourceTags: Boolean,
    PolicyName: ResourceName,
    RemediationEnabled: Boolean,
    ResourceType: ResourceType,
    SecurityServicePolicyData: SecurityServicePolicyData
  ): Policy = {
    val __obj = js.Dynamic.literal(ExcludeResourceTags = ExcludeResourceTags.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], RemediationEnabled = RemediationEnabled.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SecurityServicePolicyData = SecurityServicePolicyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeResourceTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeResourceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemediationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityServicePolicyData(value: SecurityServicePolicyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityServicePolicyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeMap(value: CustomerPolicyScopeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeMap")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMap(value: CustomerPolicyScopeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeMap")(js.undefined)
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
    def withPolicyUpdateToken(value: PolicyUpdateToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyUpdateToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyUpdateToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyUpdateToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTags(value: ResourceTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTags")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypeList(value: ResourceTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypeList")(js.undefined)
        ret
    }
  }
  
}

