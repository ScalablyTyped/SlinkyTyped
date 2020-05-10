package typingsSlinky.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleCredentialsResponse extends js.Object {
  /**
    * The credentials for the role that is assigned to the user.
    */
  var roleCredentials: js.UndefOr[RoleCredentials] = js.native
}

object GetRoleCredentialsResponse {
  @scala.inline
  def apply(): GetRoleCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoleCredentialsResponse]
  }
  @scala.inline
  implicit class GetRoleCredentialsResponseOps[Self <: GetRoleCredentialsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleCredentials(value: RoleCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleCredentials")(js.undefined)
        ret
    }
  }
  
}

