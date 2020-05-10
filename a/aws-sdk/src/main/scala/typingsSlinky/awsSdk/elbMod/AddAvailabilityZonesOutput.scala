package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAvailabilityZonesOutput extends js.Object {
  /**
    * The updated list of Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.elbMod.AvailabilityZones] = js.native
}

object AddAvailabilityZonesOutput {
  @scala.inline
  def apply(): AddAvailabilityZonesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAvailabilityZonesOutput]
  }
  @scala.inline
  implicit class AddAvailabilityZonesOutputOps[Self <: AddAvailabilityZonesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
  }
  
}

