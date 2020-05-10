package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestIdentityProviderRequest extends js.Object {
  /**
    * A system-assigned identifier for a specific server. That server's user authentication method is tested with a user name and password.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * This request parameter is the name of the user account to be tested.
    */
  var UserName: typingsSlinky.awsSdk.transferMod.UserName = js.native
  /**
    * The password of the user account to be tested.
    */
  var UserPassword: js.UndefOr[typingsSlinky.awsSdk.transferMod.UserPassword] = js.native
}

object TestIdentityProviderRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): TestIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderRequest]
  }
  @scala.inline
  implicit class TestIdentityProviderRequestOps[Self <: TestIdentityProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPassword(value: UserPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPassword")(js.undefined)
        ret
    }
  }
  
}

