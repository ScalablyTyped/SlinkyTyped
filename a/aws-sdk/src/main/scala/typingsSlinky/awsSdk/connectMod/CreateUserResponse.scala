package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var UserArn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: js.UndefOr[typingsSlinky.awsSdk.connectMod.UserId] = js.native
}

object CreateUserResponse {
  @scala.inline
  def apply(): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserResponse]
  }
  @scala.inline
  implicit class CreateUserResponseOps[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: UserId): Self = {
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
  }
  
}

