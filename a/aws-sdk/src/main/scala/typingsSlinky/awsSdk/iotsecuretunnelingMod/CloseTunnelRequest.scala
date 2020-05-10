package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseTunnelRequest extends js.Object {
  /**
    * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
    */
  var delete: js.UndefOr[DeleteFlag] = js.native
  /**
    * The ID of the tunnel to close.
    */
  var tunnelId: TunnelId = js.native
}

object CloseTunnelRequest {
  @scala.inline
  def apply(tunnelId: TunnelId): CloseTunnelRequest = {
    val __obj = js.Dynamic.literal(tunnelId = tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTunnelRequest]
  }
  @scala.inline
  implicit class CloseTunnelRequestOps[Self <: CloseTunnelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTunnelId(value: TunnelId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: DeleteFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
  }
  
}

