package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionOptions extends js.Object {
  /**
    * Indicates whether acceleration is enabled for the VPN connection.
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't support BGP.
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the VPN tunnel options.
    */
  var TunnelOptions: js.UndefOr[TunnelOptionsList] = js.native
}

object VpnConnectionOptions {
  @scala.inline
  def apply(): VpnConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionOptions]
  }
  @scala.inline
  implicit class VpnConnectionOptionsOps[Self <: VpnConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableAcceleration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableAcceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticRoutesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticRoutesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticRoutesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticRoutesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnelOptions(value: TunnelOptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TunnelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TunnelOptions")(js.undefined)
        ret
    }
  }
  
}

