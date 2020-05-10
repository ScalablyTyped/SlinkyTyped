package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayMulticastDomainAssociationsResult extends js.Object {
  /**
    * Information about the multicast domain associations.
    */
  var MulticastDomainAssociations: js.UndefOr[TransitGatewayMulticastDomainAssociationList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetTransitGatewayMulticastDomainAssociationsResult {
  @scala.inline
  def apply(): GetTransitGatewayMulticastDomainAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayMulticastDomainAssociationsResult]
  }
  @scala.inline
  implicit class GetTransitGatewayMulticastDomainAssociationsResultOps[Self <: GetTransitGatewayMulticastDomainAssociationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMulticastDomainAssociations(value: TransitGatewayMulticastDomainAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MulticastDomainAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticastDomainAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MulticastDomainAssociations")(js.undefined)
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

