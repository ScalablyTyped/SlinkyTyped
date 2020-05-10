package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * A list of the managed policies attached to the user.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the user was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * A list of IAM groups that the user is in.
    */
  var GroupList: js.UndefOr[groupNameListType] = js.native
  /**
    * The path to the user. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.native
  /**
    * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  /**
    * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.native
  /**
    * The friendly name identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.native
  /**
    * A list of the inline policies embedded in the user.
    */
  var UserPolicyList: js.UndefOr[policyDetailListType] = js.native
}

object UserDetail {
  @scala.inline
  def apply(): UserDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDetail]
  }
  @scala.inline
  implicit class UserDetailOps[Self <: UserDetail] (val x: Self) extends AnyVal {
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
    def withGroupList(value: groupNameListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupList")(js.undefined)
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
    @scala.inline
    def withUserId(value: idType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: userNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPolicyList(value: policyDetailListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPolicyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPolicyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPolicyList")(js.undefined)
        ret
    }
  }
  
}

