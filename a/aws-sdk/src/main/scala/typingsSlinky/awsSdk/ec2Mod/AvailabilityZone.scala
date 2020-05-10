package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    *  For Availability Zones, this parameter has the same value as the Region name. For Local Zones, the name of the associated group, for example us-west-2-lax-1.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * Any messages about the Availability Zone or Local Zone.
    */
  var Messages: js.UndefOr[AvailabilityZoneMessageList] = js.native
  /**
    * The name of the location from which the address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    *  For Availability Zones, this parameter always has the value of opt-in-not-required. For Local Zones, this parameter is the opt in status. The possible values are opted-in, and not-opted-in.
    */
  var OptInStatus: js.UndefOr[AvailabilityZoneOptInStatus] = js.native
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.native
  /**
    * The state of the Availability Zone or Local Zone.
    */
  var State: js.UndefOr[AvailabilityZoneState] = js.native
  /**
    * The ID of the Availability Zone or Local Zone.
    */
  var ZoneId: js.UndefOr[String] = js.native
  /**
    * The name of the Availability Zone or Local Zone.
    */
  var ZoneName: js.UndefOr[String] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  @scala.inline
  implicit class AvailabilityZoneOps[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: AvailabilityZoneMessageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkBorderGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkBorderGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkBorderGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkBorderGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOptInStatus(value: AvailabilityZoneOptInStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptInStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptInStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptInStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: AvailabilityZoneState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneName")(js.undefined)
        ret
    }
  }
  
}

