package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRoute extends js.Object {
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.native
  /**
    * The state of the route.
    */
  var State: js.UndefOr[LocalGatewayRouteState] = js.native
  /**
    * The route type.
    */
  var Type: js.UndefOr[LocalGatewayRouteType] = js.native
}

object LocalGatewayRoute {
  @scala.inline
  def apply(): LocalGatewayRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRoute]
  }
  @scala.inline
  implicit class LocalGatewayRouteOps[Self <: LocalGatewayRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayVirtualInterfaceGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayVirtualInterfaceGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayVirtualInterfaceGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: LocalGatewayRouteState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: LocalGatewayRouteType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

