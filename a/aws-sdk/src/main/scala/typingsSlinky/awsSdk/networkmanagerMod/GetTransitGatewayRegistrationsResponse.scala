package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayRegistrationsResponse extends js.Object {
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The transit gateway registrations.
    */
  var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList] = js.native
}

object GetTransitGatewayRegistrationsResponse {
  @scala.inline
  def apply(): GetTransitGatewayRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRegistrationsResponse]
  }
  @scala.inline
  implicit class GetTransitGatewayRegistrationsResponseOps[Self <: GetTransitGatewayRegistrationsResponse] (val x: Self) extends AnyVal {
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
    def withTransitGatewayRegistrations(value: TransitGatewayRegistrationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRegistrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayRegistrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRegistrations")(js.undefined)
        ret
    }
  }
  
}

