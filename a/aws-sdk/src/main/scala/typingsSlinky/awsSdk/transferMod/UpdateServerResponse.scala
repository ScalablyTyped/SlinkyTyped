package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that the user account is assigned to.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
}

object UpdateServerResponse {
  @scala.inline
  def apply(ServerId: ServerId): UpdateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerResponse]
  }
  @scala.inline
  implicit class UpdateServerResponseOps[Self <: UpdateServerResponse] (val x: Self) extends AnyVal {
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
  }
  
}

