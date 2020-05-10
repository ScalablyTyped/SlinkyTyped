package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAvailabilityZone extends js.Object {
  /**
    * The identifier of the custom AZ. Amazon RDS generates a unique identifier when a custom AZ is created.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The name of the custom AZ.
    */
  var CustomAvailabilityZoneName: js.UndefOr[String] = js.native
  /**
    * The status of the custom AZ.
    */
  var CustomAvailabilityZoneStatus: js.UndefOr[String] = js.native
  /**
    * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
    */
  var VpnDetails: js.UndefOr[typingsSlinky.awsSdk.rdsMod.VpnDetails] = js.native
}

object CustomAvailabilityZone {
  @scala.inline
  def apply(): CustomAvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAvailabilityZone]
  }
  @scala.inline
  implicit class CustomAvailabilityZoneOps[Self <: CustomAvailabilityZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAvailabilityZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAvailabilityZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAvailabilityZoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAvailabilityZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAvailabilityZoneStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAvailabilityZoneStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnDetails(value: VpnDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnDetails")(js.undefined)
        ret
    }
  }
  
}

