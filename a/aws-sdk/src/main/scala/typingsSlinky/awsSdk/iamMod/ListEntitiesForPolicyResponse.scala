package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesForPolicyResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    * A list of IAM groups that the policy is attached to.
    */
  var PolicyGroups: js.UndefOr[PolicyGroupListType] = js.native
  /**
    * A list of IAM roles that the policy is attached to.
    */
  var PolicyRoles: js.UndefOr[PolicyRoleListType] = js.native
  /**
    * A list of IAM users that the policy is attached to.
    */
  var PolicyUsers: js.UndefOr[PolicyUserListType] = js.native
}

object ListEntitiesForPolicyResponse {
  @scala.inline
  def apply(): ListEntitiesForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesForPolicyResponse]
  }
  @scala.inline
  implicit class ListEntitiesForPolicyResponseOps[Self <: ListEntitiesForPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTruncated(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: responseMarkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyGroups(value: PolicyGroupListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyRoles(value: PolicyRoleListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyUsers(value: PolicyUserListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyUsers")(js.undefined)
        ret
    }
  }
  
}

