package typingsSlinky.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeDomainAccessRequest extends js.Object {
  /**
    * The name of the domain.
    */
  var DomainName: typingsSlinky.awsDashSdk.clientsWorklinkMod.DomainName = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsDashSdk.clientsWorklinkMod.FleetArn = js.native
}

object RevokeDomainAccessRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn): RevokeDomainAccessRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RevokeDomainAccessRequest]
  }
}

