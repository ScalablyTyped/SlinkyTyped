package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTransitGatewayMulticastGroupsResult extends js.Object {
  /**
    * Information about the transit gateway multicast group.
    */
  var MulticastGroups: js.UndefOr[TransitGatewayMulticastGroupList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SearchTransitGatewayMulticastGroupsResult {
  @scala.inline
  def apply(): SearchTransitGatewayMulticastGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitGatewayMulticastGroupsResult]
  }
  @scala.inline
  implicit class SearchTransitGatewayMulticastGroupsResultOps[Self <: SearchTransitGatewayMulticastGroupsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMulticastGroups(value: TransitGatewayMulticastGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MulticastGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticastGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MulticastGroups")(js.undefined)
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

