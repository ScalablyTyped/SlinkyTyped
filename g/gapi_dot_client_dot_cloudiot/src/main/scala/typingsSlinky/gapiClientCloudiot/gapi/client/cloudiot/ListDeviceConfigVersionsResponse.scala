package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceConfigVersionsResponse extends js.Object {
  /**
    * The device configuration for the last few versions. Versions are listed
    * in decreasing order, starting from the most recent one.
    */
  var deviceConfigs: js.UndefOr[js.Array[DeviceConfig]] = js.native
}

object ListDeviceConfigVersionsResponse {
  @scala.inline
  def apply(): ListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceConfigVersionsResponse]
  }
  @scala.inline
  implicit class ListDeviceConfigVersionsResponseOps[Self <: ListDeviceConfigVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceConfigs(value: js.Array[DeviceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigs")(js.undefined)
        ret
    }
  }
  
}

