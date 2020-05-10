package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnConnectionResult extends js.Object {
  var VpnConnection: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpnConnection] = js.native
}

object ModifyVpnConnectionResult {
  @scala.inline
  def apply(): ModifyVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnConnectionResult]
  }
  @scala.inline
  implicit class ModifyVpnConnectionResultOps[Self <: ModifyVpnConnectionResult] (val x: Self) extends AnyVal {
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

