package typingsSlinky.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingParametersRequest extends js.Object {
  var DomainName: typingsSlinky.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
}

object DescribeScalingParametersRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeScalingParametersRequest]
  }
}

