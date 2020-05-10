package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewayMulticastDomainsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the transit gateway multicast domains.
    */
  var TransitGatewayMulticastDomains: js.UndefOr[TransitGatewayMulticastDomainList] = js.native
}

object DescribeTransitGatewayMulticastDomainsResult {
  @scala.inline
  def apply(): DescribeTransitGatewayMulticastDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayMulticastDomainsResult]
  }
  @scala.inline
  implicit class DescribeTransitGatewayMulticastDomainsResultOps[Self <: DescribeTransitGatewayMulticastDomainsResult] (val x: Self) extends AnyVal {
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
    def withTransitGatewayMulticastDomains(value: TransitGatewayMulticastDomainList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayMulticastDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayMulticastDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayMulticastDomains")(js.undefined)
        ret
    }
  }
  
}

