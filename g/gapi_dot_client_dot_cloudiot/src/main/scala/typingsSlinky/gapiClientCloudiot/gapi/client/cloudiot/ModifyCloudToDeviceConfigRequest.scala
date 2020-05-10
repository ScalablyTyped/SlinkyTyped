package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCloudToDeviceConfigRequest extends js.Object {
  /** The configuration data for the device. */
  var binaryData: js.UndefOr[String] = js.native
  /**
    * The version number to update. If this value is zero, it will not check the
    * version number of the server and will always update the current version;
    * otherwise, this update will fail if the version number found on the server
    * does not match this version number. This is used to support multiple
    * simultaneous updates without losing data.
    */
  var versionToUpdate: js.UndefOr[String] = js.native
}

object ModifyCloudToDeviceConfigRequest {
  @scala.inline
  def apply(): ModifyCloudToDeviceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCloudToDeviceConfigRequest]
  }
  @scala.inline
  implicit class ModifyCloudToDeviceConfigRequestOps[Self <: ModifyCloudToDeviceConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryData")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionToUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionToUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionToUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionToUpdate")(js.undefined)
        ret
    }
  }
  
}

