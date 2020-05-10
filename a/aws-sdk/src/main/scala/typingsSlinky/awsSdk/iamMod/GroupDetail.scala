package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
  /**
    * A list of the managed policies attached to the group.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the group was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var GroupId: js.UndefOr[idType] = js.native
  /**
    * The friendly name that identifies the group.
    */
  var GroupName: js.UndefOr[groupNameType] = js.native
  /**
    * A list of the inline policies embedded in the group.
    */
  var GroupPolicyList: js.UndefOr[policyDetailListType] = js.native
  /**
    * The path to the group. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.native
}

object GroupDetail {
  @scala.inline
  def apply(): GroupDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupDetail]
  }
  @scala.inline
  implicit class GroupDetailOps[Self <: GroupDetail] (val x: Self) extends AnyVal {
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
    def withGroupId(value: idType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: groupNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupPolicyList(value: policyDetailListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupPolicyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupPolicyList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupPolicyList")(js.undefined)
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
  }
  
}

