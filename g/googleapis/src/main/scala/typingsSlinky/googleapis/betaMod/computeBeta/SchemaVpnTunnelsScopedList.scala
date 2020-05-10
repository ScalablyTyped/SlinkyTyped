package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVpnTunnelsScopedList extends js.Object {
  /**
    * A list of VPN tunnels contained in this scope.
    */
  var vpnTunnels: js.UndefOr[js.Array[SchemaVpnTunnel]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaVpnTunnelsScopedList {
  @scala.inline
  def apply(): SchemaVpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnTunnelsScopedList]
  }
  @scala.inline
  implicit class SchemaVpnTunnelsScopedListOps[Self <: SchemaVpnTunnelsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnTunnels(value: js.Array[SchemaVpnTunnel]): Self = {
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
    def withWarning(value: AnonCode): Self = {
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

