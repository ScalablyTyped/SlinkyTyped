package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnGatewayResult extends js.Object {
  /**
    * Information about the virtual private gateway.
    */
  var VpnGateway: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpnGateway] = js.native
}

object CreateVpnGatewayResult {
  @scala.inline
  def apply(): CreateVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpnGatewayResult]
  }
  @scala.inline
  implicit class CreateVpnGatewayResultOps[Self <: CreateVpnGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnGateway(value: VpnGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGateway")(js.undefined)
        ret
    }
  }
  
}

