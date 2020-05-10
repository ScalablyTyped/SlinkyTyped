package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRouteTableVirtualInterfaceGroupAssociation extends js.Object {
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayId] = js.native
  /**
    * The ID of the association.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: js.UndefOr[
    typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociationId
  ] = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId] = js.native
  /**
    * The state of the association.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the association.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LocalGatewayRouteTableVirtualInterfaceGroupAssociation {
  @scala.inline
  def apply(): LocalGatewayRouteTableVirtualInterfaceGroupAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  }
  @scala.inline
  implicit class LocalGatewayRouteTableVirtualInterfaceGroupAssociationOps[Self <: LocalGatewayRouteTableVirtualInterfaceGroupAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayRouteTableId(value: LocalGatewayId): Self = {
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
    def withLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayRouteTableVirtualInterfaceGroupAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId")(js.undefined)
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
    def withState(value: String): Self = {
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

