package typingsSlinky.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCompanyNetworkConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsDashSdk.clientsWorklinkMod.FleetArn = js.native
}

object DescribeCompanyNetworkConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeCompanyNetworkConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeCompanyNetworkConfigurationRequest]
  }
}

