package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayRouteTableResult extends js.Object {
  /**
    * Information about the deleted transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTable] = js.native
}

object DeleteTransitGatewayRouteTableResult {
  @scala.inline
  def apply(): DeleteTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableResult]
  }
  @scala.inline
  implicit class DeleteTransitGatewayRouteTableResultOps[Self <: DeleteTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayRouteTable(value: TransitGatewayRouteTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRouteTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayRouteTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRouteTable")(js.undefined)
        ret
    }
  }
  
}

