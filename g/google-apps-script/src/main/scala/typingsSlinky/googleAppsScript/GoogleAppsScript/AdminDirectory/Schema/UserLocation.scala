package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLocation extends js.Object {
  var area: js.UndefOr[String] = js.native
  var buildingId: js.UndefOr[String] = js.native
  var customType: js.UndefOr[String] = js.native
  var deskCode: js.UndefOr[String] = js.native
  var floorName: js.UndefOr[String] = js.native
  var floorSection: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object UserLocation {
  @scala.inline
  def apply(): UserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLocation]
  }
  @scala.inline
  implicit class UserLocationOps[Self <: UserLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeskCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deskCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeskCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deskCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorName")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorSection")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

