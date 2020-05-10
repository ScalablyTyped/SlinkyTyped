package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionOptionsSpecification extends js.Object {
  /**
    * Indicate whether to enable acceleration for the VPN connection. Default: false 
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.native
  /**
    * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device that does not support BGP, you must specify true. Use CreateVpnConnectionRoute to create a static route. Default: false 
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.native
  /**
    * The tunnel options for the VPN connection.
    */
  var TunnelOptions: js.UndefOr[VpnTunnelOptionsSpecificationsList] = js.native
}

object VpnConnectionOptionsSpecification {
  @scala.inline
  def apply(): VpnConnectionOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionOptionsSpecification]
  }
  @scala.inline
  implicit class VpnConnectionOptionsSpecificationOps[Self <: VpnConnectionOptionsSpecification] (val x: Self) extends AnyVal {
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
    def withTunnelOptions(value: VpnTunnelOptionsSpecificationsList): Self = {
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

