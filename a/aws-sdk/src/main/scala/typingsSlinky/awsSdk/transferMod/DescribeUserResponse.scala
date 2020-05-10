package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that has this user assigned.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
  /**
    * An array containing the properties of the user account for the ServerID value that you specified.
    */
  var User: DescribedUser = js.native
}

object DescribeUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, User: DescribedUser): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
  @scala.inline
  implicit class DescribeUserResponseOps[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
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
    def withUser(value: DescribedUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

