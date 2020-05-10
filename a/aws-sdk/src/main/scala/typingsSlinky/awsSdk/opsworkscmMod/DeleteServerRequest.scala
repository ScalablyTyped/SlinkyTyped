package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServerRequest extends js.Object {
  /**
    * The ID of the server to delete.
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}

object DeleteServerRequest {
  @scala.inline
  def apply(ServerName: ServerName): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
  @scala.inline
  implicit class DeleteServerRequestOps[Self <: DeleteServerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

