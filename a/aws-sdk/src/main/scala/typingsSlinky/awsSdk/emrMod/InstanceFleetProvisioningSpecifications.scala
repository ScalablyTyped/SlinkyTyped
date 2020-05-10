package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetProvisioningSpecifications extends js.Object {
  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning timeout behavior.
    */
  var SpotSpecification: SpotProvisioningSpecification = js.native
}

object InstanceFleetProvisioningSpecifications {
  @scala.inline
  def apply(SpotSpecification: SpotProvisioningSpecification): InstanceFleetProvisioningSpecifications = {
    val __obj = js.Dynamic.literal(SpotSpecification = SpotSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetProvisioningSpecifications]
  }
  @scala.inline
  implicit class InstanceFleetProvisioningSpecificationsOps[Self <: InstanceFleetProvisioningSpecifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotSpecification(value: SpotProvisioningSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotSpecification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

