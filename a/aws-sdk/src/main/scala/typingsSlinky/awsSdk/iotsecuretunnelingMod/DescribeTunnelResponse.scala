package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTunnelResponse extends js.Object {
  /**
    * The tunnel being described.
    */
  var tunnel: js.UndefOr[Tunnel] = js.native
}

object DescribeTunnelResponse {
  @scala.inline
  def apply(): DescribeTunnelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTunnelResponse]
  }
  @scala.inline
  implicit class DescribeTunnelResponseOps[Self <: DescribeTunnelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTunnel(value: Tunnel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(js.undefined)
        ret
    }
  }
  
}

