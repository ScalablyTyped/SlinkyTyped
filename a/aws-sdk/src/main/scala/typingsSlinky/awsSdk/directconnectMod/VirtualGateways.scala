package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGateways extends js.Object {
  /**
    * The virtual private gateways.
    */
  var virtualGateways: js.UndefOr[VirtualGatewayList] = js.native
}

object VirtualGateways {
  @scala.inline
  def apply(): VirtualGateways = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGateways]
  }
  @scala.inline
  implicit class VirtualGatewaysOps[Self <: VirtualGateways] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualGateways(value: VirtualGatewayList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGateways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualGateways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGateways")(js.undefined)
        ret
    }
  }
  
}

