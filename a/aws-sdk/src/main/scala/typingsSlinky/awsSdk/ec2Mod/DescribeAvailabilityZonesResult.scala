package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityZonesResult extends js.Object {
  /**
    * Information about the Availability Zones and Local Zones.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
}

object DescribeAvailabilityZonesResult {
  @scala.inline
  def apply(): DescribeAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityZonesResult]
  }
  @scala.inline
  implicit class DescribeAvailabilityZonesResultOps[Self <: DescribeAvailabilityZonesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZoneList): Self = {
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

