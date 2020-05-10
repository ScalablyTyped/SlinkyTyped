package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringConnectionsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the VPC peering connections.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.native
}

object DescribeVpcPeeringConnectionsResult {
  @scala.inline
  def apply(): DescribeVpcPeeringConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsResult]
  }
  @scala.inline
  implicit class DescribeVpcPeeringConnectionsResultOps[Self <: DescribeVpcPeeringConnectionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withVpcPeeringConnections(value: VpcPeeringConnectionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnections")(js.undefined)
        ret
    }
  }
  
}

