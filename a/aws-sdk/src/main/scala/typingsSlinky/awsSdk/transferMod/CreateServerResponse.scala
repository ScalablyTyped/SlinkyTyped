package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServerResponse extends js.Object {
  /**
    * The service-assigned ID of the SFTP server that is created.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
}

object CreateServerResponse {
  @scala.inline
  def apply(ServerId: ServerId): CreateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServerResponse]
  }
  @scala.inline
  implicit class CreateServerResponseOps[Self <: CreateServerResponse] (val x: Self) extends AnyVal {
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

