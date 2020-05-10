package typingsSlinky.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleInfo extends js.Object {
  /**
    * The identifier of the AWS account assigned to the user.
    */
  var accountId: js.UndefOr[AccountIdType] = js.native
  /**
    * The friendly name of the role that is assigned to the user.
    */
  var roleName: js.UndefOr[RoleNameType] = js.native
}

object RoleInfo {
  @scala.inline
  def apply(): RoleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleInfo]
  }
  @scala.inline
  implicit class RoleInfoOps[Self <: RoleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: RoleNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(js.undefined)
        ret
    }
  }
  
}

