package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.admin
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsAddOrUpdateMembershipParams extends js.Object {
  @JSName("org")
  var org_ : String = js.native
  /**
    * The role to give the user in the organization. Can be one of:
    * \* `admin` - The user will become an owner of the organization.
    * \* `member` - The user will become a non-owner member of the organization.
    */
  var role: js.UndefOr[admin | member] = js.native
  var username: String = js.native
}

object OrgsAddOrUpdateMembershipParams {
  @scala.inline
  def apply(org_ : String, username: String): OrgsAddOrUpdateMembershipParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsAddOrUpdateMembershipParams]
  }
  @scala.inline
  implicit class OrgsAddOrUpdateMembershipParamsOps[Self <: OrgsAddOrUpdateMembershipParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: admin | member): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

