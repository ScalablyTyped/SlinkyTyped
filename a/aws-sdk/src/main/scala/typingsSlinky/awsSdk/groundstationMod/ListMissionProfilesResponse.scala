package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMissionProfilesResponse extends js.Object {
  /**
    * List of mission profiles.
    */
  var missionProfileList: js.UndefOr[MissionProfileList] = js.native
  /**
    * Next token returned in the response of a previous ListMissionProfiles call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListMissionProfilesResponse {
  @scala.inline
  def apply(): ListMissionProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMissionProfilesResponse]
  }
  @scala.inline
  implicit class ListMissionProfilesResponseOps[Self <: ListMissionProfilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissionProfileList(value: MissionProfileList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissionProfileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missionProfileList")(js.undefined)
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
  }
  
}

