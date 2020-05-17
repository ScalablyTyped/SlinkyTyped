package typingsSlinky.peerDial.mod

import typingsSlinky.peerDial.anon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInfo extends js.Object {
  var UDN: String = js.native
  var applicationUrl: String = js.native
  var descriptionUrl: String = js.native
  var deviceType: String = js.native
  var friendlyName: String = js.native
  var iconList: js.Array[js.Object] | Icon = js.native
  var manufacturer: String = js.native
  var modelName: String = js.native
}

object DeviceInfo {
  @scala.inline
  def apply(
    UDN: String,
    applicationUrl: String,
    descriptionUrl: String,
    deviceType: String,
    friendlyName: String,
    iconList: js.Array[js.Object] | Icon,
    manufacturer: String,
    modelName: String
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(UDN = UDN.asInstanceOf[js.Any], applicationUrl = applicationUrl.asInstanceOf[js.Any], descriptionUrl = descriptionUrl.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], iconList = iconList.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  @scala.inline
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconList(value: js.Array[js.Object] | Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

