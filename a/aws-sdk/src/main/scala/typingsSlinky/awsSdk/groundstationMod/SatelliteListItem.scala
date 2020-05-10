package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SatelliteListItem extends js.Object {
  /**
    * A list of ground stations to which the satellite is on-boarded.
    */
  var groundStations: js.UndefOr[GroundStationIdList] = js.native
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[typingsSlinky.awsSdk.groundstationMod.noradSatelliteID] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typingsSlinky.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * UUID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.native
}

object SatelliteListItem {
  @scala.inline
  def apply(): SatelliteListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SatelliteListItem]
  }
  @scala.inline
  implicit class SatelliteListItemOps[Self <: SatelliteListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroundStations(value: GroundStationIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundStations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStations")(js.undefined)
        ret
    }
    @scala.inline
    def withNoradSatelliteID(value: noradSatelliteID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noradSatelliteID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoradSatelliteID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noradSatelliteID")(js.undefined)
        ret
    }
    @scala.inline
    def withSatelliteArn(value: satelliteArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSatelliteArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSatelliteId(value: Uuid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSatelliteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteId")(js.undefined)
        ret
    }
  }
  
}

