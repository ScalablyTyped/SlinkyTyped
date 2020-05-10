package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactsRequest extends js.Object {
  /**
    * End time of a contact.
    */
  var endTime: js.Date = js.native
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.native
  /**
    * Maximum number of contacts returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * Next token returned in the request of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typingsSlinky.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * Start time of a contact.
    */
  var startTime: js.Date = js.native
  /**
    * Status of a contact reservation.
    */
  var statusList: StatusList = js.native
}

object ListContactsRequest {
  @scala.inline
  def apply(endTime: js.Date, startTime: js.Date, statusList: StatusList): ListContactsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusList = statusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactsRequest]
  }
  @scala.inline
  implicit class ListContactsRequestOps[Self <: ListContactsRequest] (val x: Self) extends AnyVal {
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
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusList(value: StatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroundStation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundStation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMissionProfileArn(value: MissionProfileArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissionProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
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
  }
  
}

