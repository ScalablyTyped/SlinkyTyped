package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateWebsiteAuthorizationProviderRequest extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: Id = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}

object DisassociateWebsiteAuthorizationProviderRequest {
  @scala.inline
  def apply(AuthorizationProviderId: Id, FleetArn: FleetArn): DisassociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderId = AuthorizationProviderId.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebsiteAuthorizationProviderRequest]
  }
  @scala.inline
  implicit class DisassociateWebsiteAuthorizationProviderRequestOps[Self <: DisassociateWebsiteAuthorizationProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationProviderId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationProviderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

