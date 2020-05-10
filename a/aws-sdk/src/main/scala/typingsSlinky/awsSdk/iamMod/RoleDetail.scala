package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.native
  /**
    * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of instance profiles that contain this role.
    */
  var InstanceProfileList: js.UndefOr[instanceProfileListType] = js.native
  /**
    * The path to the role. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.native
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.native
  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see Regions Where Data Is Tracked in the IAM User Guide.
    */
  var RoleLastUsed: js.UndefOr[typingsSlinky.awsSdk.iamMod.RoleLastUsed] = js.native
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.native
  /**
    * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
    */
  var RolePolicyList: js.UndefOr[policyDetailListType] = js.native
  /**
    * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
}

object RoleDetail {
  @scala.inline
  def apply(): RoleDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleDetail]
  }
  @scala.inline
  implicit class RoleDetailOps[Self <: RoleDetail] (val x: Self) extends AnyVal {
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
    def withAssumeRolePolicyDocument(value: policyDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumeRolePolicyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeRolePolicyDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumeRolePolicyDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachedManagedPolicies(value: attachedPoliciesListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedManagedPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedManagedPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedManagedPolicies")(js.undefined)
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
    def withInstanceProfileList(value: instanceProfileListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProfileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileList")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: pathType): Self = {
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
    def withPermissionsBoundary(value: AttachedPermissionsBoundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionsBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleId(value: idType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleLastUsed(value: RoleLastUsed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleLastUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleLastUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleLastUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: roleNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRolePolicyList(value: policyDetailListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RolePolicyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolePolicyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RolePolicyList")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: tagListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

