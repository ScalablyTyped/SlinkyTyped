package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnTunnelCertificateResult extends js.Object {
  var VpnConnection: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpnConnection] = js.native
}

object ModifyVpnTunnelCertificateResult {
  @scala.inline
  def apply(): ModifyVpnTunnelCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelCertificateResult]
  }
  @scala.inline
  implicit class ModifyVpnTunnelCertificateResultOps[Self <: ModifyVpnTunnelCertificateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnConnection(value: VpnConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnection")(js.undefined)
        ret
    }
  }
  
}

