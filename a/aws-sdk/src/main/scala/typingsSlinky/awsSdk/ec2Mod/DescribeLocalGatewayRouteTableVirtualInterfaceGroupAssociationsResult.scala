package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult extends js.Object {
  /**
    * Information about the associations.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociations: js.UndefOr[LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult {
  @scala.inline
  def apply(): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult]
  }
  @scala.inline
  implicit class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResultOps[Self <: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalGatewayRouteTableVirtualInterfaceGroupAssociations(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableVirtualInterfaceGroupAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayRouteTableVirtualInterfaceGroupAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableVirtualInterfaceGroupAssociations")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

