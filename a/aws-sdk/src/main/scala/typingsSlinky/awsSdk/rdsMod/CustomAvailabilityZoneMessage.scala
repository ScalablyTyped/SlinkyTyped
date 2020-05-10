package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAvailabilityZoneMessage extends js.Object {
  /**
    * The list of CustomAvailabilityZone objects for the AWS account.
    */
  var CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList] = js.native
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CustomAvailabilityZoneMessage {
  @scala.inline
  def apply(): CustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAvailabilityZoneMessage]
  }
  @scala.inline
  implicit class CustomAvailabilityZoneMessageOps[Self <: CustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAvailabilityZones(value: CustomAvailabilityZoneList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

