package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerResponse extends js.Object {
  /**
    * Contains the response to a UpdateServer request. 
    */
  var Server: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.Server] = js.native
}

object UpdateServerResponse {
  @scala.inline
  def apply(): UpdateServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServerResponse]
  }
  @scala.inline
  implicit class UpdateServerResponseOps[Self <: UpdateServerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Server")(js.undefined)
        ret
    }
  }
  
}

