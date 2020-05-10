package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringConnectionsOutput extends js.Object {
  /**
    * A collection of VPC peering connection records that match the request.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.native
}

object DescribeVpcPeeringConnectionsOutput {
  @scala.inline
  def apply(): DescribeVpcPeeringConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsOutput]
  }
  @scala.inline
  implicit class DescribeVpcPeeringConnectionsOutputOps[Self <: DescribeVpcPeeringConnectionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

