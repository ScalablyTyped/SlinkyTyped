package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReserveContactRequest extends js.Object {
  /**
    * End time of a contact.
    */
  var endTime: js.Date = js.native
  /**
    * Name of a ground station.
    */
  var groundStation: String = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: MissionProfileArn = js.native
  /**
    * ARN of a satellite
    */
  var satelliteArn: typingsSlinky.awsSdk.groundstationMod.satelliteArn = js.native
  /**
    * Start time of a contact.
    */
  var startTime: js.Date = js.native
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object ReserveContactRequest {
  @scala.inline
  def apply(
    endTime: js.Date,
    groundStation: String,
    missionProfileArn: MissionProfileArn,
    satelliteArn: satelliteArn,
    startTime: js.Date
  ): ReserveContactRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], groundStation = groundStation.asInstanceOf[js.Any], missionProfileArn = missionProfileArn.asInstanceOf[js.Any], satelliteArn = satelliteArn.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReserveContactRequest]
  }
  @scala.inline
  implicit class ReserveContactRequestOps[Self <: ReserveContactRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroundStation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissionProfileArn(value: MissionProfileArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSatelliteArn(value: satelliteArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

