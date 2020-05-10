package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAvailabilityZonesOutput extends js.Object {
  /**
    * The remaining Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.elbMod.AvailabilityZones] = js.native
}

object RemoveAvailabilityZonesOutput {
  @scala.inline
  def apply(): RemoveAvailabilityZonesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAvailabilityZonesOutput]
  }
  @scala.inline
  implicit class RemoveAvailabilityZonesOutputOps[Self <: RemoveAvailabilityZonesOutput] (val x: Self) extends AnyVal {
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

