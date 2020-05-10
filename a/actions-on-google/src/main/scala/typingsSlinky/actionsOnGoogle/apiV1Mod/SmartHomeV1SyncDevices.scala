package typingsSlinky.actionsOnGoogle.apiV1Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1SyncDevices extends js.Object {
  var attributes: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var deviceInfo: js.UndefOr[SmartHomeV1SyncDeviceInfo] = js.native
  var id: String = js.native
  var name: SmartHomeV1SyncName = js.native
  var otherDeviceIds: js.UndefOr[js.Array[SmartHomeV1SyncOtherDeviceIds]] = js.native
  var roomHint: js.UndefOr[String] = js.native
  var traits: js.Array[String] = js.native
  var `type`: String = js.native
  var willReportState: Boolean = js.native
}

object SmartHomeV1SyncDevices {
  @scala.inline
  def apply(
    id: String,
    name: SmartHomeV1SyncName,
    traits: js.Array[String],
    `type`: String,
    willReportState: Boolean
  ): SmartHomeV1SyncDevices = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], willReportState = willReportState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncDevices]
  }
  @scala.inline
  implicit class SmartHomeV1SyncDevicesOps[Self <: SmartHomeV1SyncDevices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: SmartHomeV1SyncName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWillReportState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willReportState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomData(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceInfo(value: SmartHomeV1SyncDeviceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherDeviceIds(value: js.Array[SmartHomeV1SyncOtherDeviceIds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherDeviceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherDeviceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherDeviceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomHint")(js.undefined)
        ret
    }
  }
  
}

