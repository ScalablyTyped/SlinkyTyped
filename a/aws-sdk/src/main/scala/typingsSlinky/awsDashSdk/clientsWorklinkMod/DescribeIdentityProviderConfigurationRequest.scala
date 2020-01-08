package typingsSlinky.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityProviderConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsDashSdk.clientsWorklinkMod.FleetArn = js.native
}

object DescribeIdentityProviderConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeIdentityProviderConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeIdentityProviderConfigurationRequest]
  }
}

