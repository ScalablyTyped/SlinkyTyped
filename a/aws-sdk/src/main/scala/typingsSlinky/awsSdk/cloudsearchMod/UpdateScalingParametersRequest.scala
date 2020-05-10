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
  @scala.inline
  implicit class UpdateScalingParametersRequestOps[Self <: UpdateScalingParametersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingParameters(value: ScalingParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

