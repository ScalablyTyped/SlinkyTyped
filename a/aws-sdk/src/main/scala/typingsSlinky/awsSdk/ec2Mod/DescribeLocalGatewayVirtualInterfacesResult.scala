package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayVirtualInterfacesResult extends js.Object {
  /**
    * Information about the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaces: js.UndefOr[LocalGatewayVirtualInterfaceSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayVirtualInterfacesResult {
  @scala.inline
  def apply(): DescribeLocalGatewayVirtualInterfacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfacesResult]
  }
  @scala.inline
  implicit class DescribeLocalGatewayVirtualInterfacesResultOps[Self <: DescribeLocalGatewayVirtualInterfacesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalGatewayVirtualInterfaces(value: LocalGatewayVirtualInterfaceSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayVirtualInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayVirtualInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayVirtualInterfaces")(js.undefined)
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

