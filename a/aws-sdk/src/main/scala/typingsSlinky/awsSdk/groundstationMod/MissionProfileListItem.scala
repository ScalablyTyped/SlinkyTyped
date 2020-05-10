package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissionProfileListItem extends js.Object {
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.native
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Region of a mission profile.
    */
  var region: js.UndefOr[String] = js.native
}

object MissionProfileListItem {
  @scala.inline
  def apply(): MissionProfileListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissionProfileListItem]
  }
  @scala.inline
  implicit class MissionProfileListItemOps[Self <: MissionProfileListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMissionProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissionProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
  }
  
}

