package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpnConnectionsResult extends js.Object {
  /**
    * Information about one or more VPN connections.
    */
  var VpnConnections: js.UndefOr[VpnConnectionList] = js.native
}

object DescribeVpnConnectionsResult {
  @scala.inline
  def apply(): DescribeVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnConnectionsResult]
  }
  @scala.inline
  implicit class DescribeVpnConnectionsResultOps[Self <: DescribeVpnConnectionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnConnections(value: VpnConnectionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnections")(js.undefined)
        ret
    }
  }
  
}

