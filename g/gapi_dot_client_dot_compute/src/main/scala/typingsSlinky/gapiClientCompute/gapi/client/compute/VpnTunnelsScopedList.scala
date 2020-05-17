package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnTunnelsScopedList extends js.Object {
  /** List of vpn tunnels contained in this scope. */
  var vpnTunnels: js.UndefOr[js.Array[VpnTunnel]] = js.native
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object VpnTunnelsScopedList {
  @scala.inline
  def apply(): VpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnelsScopedList]
  }
  @scala.inline
  implicit class VpnTunnelsScopedListOps[Self <: VpnTunnelsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnTunnels(value: js.Array[VpnTunnel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnTunnels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnTunnels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnTunnels")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

