package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserResponse extends js.Object {
  /**
    * The ID of the SFTP server that the user is attached to.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * A unique string that identifies a user account associated with an SFTP server.
    */
  var UserName: typingsSlinky.awsSdk.transferMod.UserName = js.native
}

object CreateUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): CreateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
  @scala.inline
  implicit class CreateUserResponseOps[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
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
  }
  
}

