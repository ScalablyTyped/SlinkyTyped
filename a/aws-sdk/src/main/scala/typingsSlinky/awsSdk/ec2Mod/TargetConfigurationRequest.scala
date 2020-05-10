package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetConfigurationRequest extends js.Object {
  /**
    * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The Convertible Reserved Instance offering ID.
    */
  var OfferingId: ReservedInstancesOfferingId = js.native
}

object TargetConfigurationRequest {
  @scala.inline
  def apply(OfferingId: ReservedInstancesOfferingId): TargetConfigurationRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfigurationRequest]
  }
  @scala.inline
  implicit class TargetConfigurationRequestOps[Self <: TargetConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfferingId(value: ReservedInstancesOfferingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(js.undefined)
        ret
    }
  }
  
}

