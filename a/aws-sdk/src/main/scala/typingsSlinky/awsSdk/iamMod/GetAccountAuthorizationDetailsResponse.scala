package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountAuthorizationDetailsResponse extends js.Object {
  /**
    * A list containing information about IAM groups.
    */
  var GroupDetailList: js.UndefOr[groupDetailListType] = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    * A list containing information about managed policies.
    */
  var Policies: js.UndefOr[ManagedPolicyDetailListType] = js.native
  /**
    * A list containing information about IAM roles.
    */
  var RoleDetailList: js.UndefOr[roleDetailListType] = js.native
  /**
    * A list containing information about IAM users.
    */
  var UserDetailList: js.UndefOr[userDetailListType] = js.native
}

object GetAccountAuthorizationDetailsResponse {
  @scala.inline
  def apply(): GetAccountAuthorizationDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountAuthorizationDetailsResponse]
  }
  @scala.inline
  implicit class GetAccountAuthorizationDetailsResponseOps[Self <: GetAccountAuthorizationDetailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupDetailList(value: groupDetailListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupDetailList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDetailList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupDetailList")(js.undefined)
        ret
    }
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
    def withPolicies(value: ManagedPolicyDetailListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleDetailList(value: roleDetailListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleDetailList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleDetailList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleDetailList")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDetailList(value: userDetailListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDetailList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDetailList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDetailList")(js.undefined)
        ret
    }
  }
  
}

