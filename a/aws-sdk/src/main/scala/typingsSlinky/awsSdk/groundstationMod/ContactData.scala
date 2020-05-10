package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactData extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.native
  /**
    * Status of a contact.
    */
  var contactStatus: js.UndefOr[ContactStatus] = js.native
  /**
    * End time of a contact.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * Error message of a contact.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.native
  /**
    * Maximum elevation angle of a contact.
    */
  var maximumElevation: js.UndefOr[Elevation] = js.native
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var postPassEndTime: js.UndefOr[js.Date] = js.native
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var prePassStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Region of a contact.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typingsSlinky.awsSdk.groundstationMod.satelliteArn] = js.native
  /**
    * Start time of a contact.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object ContactData {
  @scala.inline
  def apply(): ContactData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactData]
  }
  @scala.inline
  implicit class ContactDataOps[Self <: ContactData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(js.undefined)
        ret
    }
    @scala.inline
    def withContactStatus(value: ContactStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
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
    def withMaximumElevation(value: Elevation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumElevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumElevation")(js.undefined)
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
    def withPostPassEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postPassEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostPassEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postPassEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrePassStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prePassStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrePassStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prePassStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
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
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
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

