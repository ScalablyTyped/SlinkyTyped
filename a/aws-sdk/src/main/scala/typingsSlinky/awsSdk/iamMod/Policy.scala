package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * The number of entities (users, groups, and roles) that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[attachmentCountType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The identifier for the version of the policy that is set as the default version.
    */
  var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.native
  /**
    * A friendly description of the policy. This element is included in the response to the GetPolicy operation. It is not included in the response to the ListPolicies operation. 
    */
  var Description: js.UndefOr[policyDescriptionType] = js.native
  /**
    * Specifies whether the policy can be attached to an IAM user, group, or role.
    */
  var IsAttachable: js.UndefOr[booleanType] = js.native
  /**
    * The path to the policy. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[policyPathType] = js.native
  /**
    * The number of entities (users and roles) for which the policy is used to set the permissions boundary.  For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.native
  /**
    * The stable and unique string identifying the policy. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var PolicyId: js.UndefOr[idType] = js.native
  /**
    * The friendly name (not ARN) identifying the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
    */
  var UpdateDate: js.UndefOr[js.Date] = js.native
}

object Policy {
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentCount(value: attachmentCountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVersionId(value: policyVersionIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: policyDescriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAttachable(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAttachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAttachable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAttachable")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: policyPathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionsBoundaryUsageCount(value: attachmentCountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundaryUsageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionsBoundaryUsageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundaryUsageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyId(value: idType): Self = {
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
    def withPolicyName(value: policyNameType): Self = {
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
    def withUpdateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDate")(js.undefined)
        ret
    }
  }
  
}

