package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScalingParametersRequest extends js.Object {
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
  var ScalingParameters: typingsSlinky.awsSdk.cloudsearchMod.ScalingParameters = js.native
}

object UpdateScalingParametersRequest {
  @scala.inline
  def apply(DomainName: DomainName, ScalingParameters: ScalingParameters): UpdateScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingParametersRequest]
  }
}

