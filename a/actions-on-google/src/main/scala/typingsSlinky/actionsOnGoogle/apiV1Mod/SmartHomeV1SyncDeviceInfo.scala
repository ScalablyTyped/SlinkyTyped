package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1SyncDeviceInfo extends js.Object {
  var hwVersion: String = js.native
  var manufacturer: String = js.native
  var model: String = js.native
  var swVersion: String = js.native
}

object SmartHomeV1SyncDeviceInfo {
  @scala.inline
  def apply(hwVersion: String, manufacturer: String, model: String, swVersion: String): SmartHomeV1SyncDeviceInfo = {
    val __obj = js.Dynamic.literal(hwVersion = hwVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], swVersion = swVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncDeviceInfo]
  }
  @scala.inline
  implicit class SmartHomeV1SyncDeviceInfoOps[Self <: SmartHomeV1SyncDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHwVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

