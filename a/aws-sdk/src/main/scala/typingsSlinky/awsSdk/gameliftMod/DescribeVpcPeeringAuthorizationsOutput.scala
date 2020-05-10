package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
  /**
    * A collection of objects that describe all valid VPC peering operations for the current AWS account.
    */
  var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.native
}

object DescribeVpcPeeringAuthorizationsOutput {
  @scala.inline
  def apply(): DescribeVpcPeeringAuthorizationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
  }
  @scala.inline
  implicit class DescribeVpcPeeringAuthorizationsOutputOps[Self <: DescribeVpcPeeringAuthorizationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcPeeringAuthorizations(value: VpcPeeringAuthorizationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringAuthorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringAuthorizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringAuthorizations")(js.undefined)
        ret
    }
  }
  
}

