package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeviceResponse extends js.Object {
  /**
    * The date that the device first signed in to Amazon WorkLink.
    */
  var FirstAccessedTime: js.UndefOr[js.Date] = js.native
  /**
    * The date that the device last accessed Amazon WorkLink.
    */
  var LastAccessedTime: js.UndefOr[js.Date] = js.native
  /**
    * The manufacturer of the device.
    */
  var Manufacturer: js.UndefOr[DeviceManufacturer] = js.native
  /**
    * The model of the device.
    */
  var Model: js.UndefOr[DeviceModel] = js.native
  /**
    * The operating system of the device.
    */
  var OperatingSystem: js.UndefOr[DeviceOperatingSystemName] = js.native
  /**
    * The operating system version of the device.
    */
  var OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion] = js.native
  /**
    * The operating system patch level of the device.
    */
  var PatchLevel: js.UndefOr[DevicePatchLevel] = js.native
  /**
    * The current state of the device.
    */
  var Status: js.UndefOr[DeviceStatus] = js.native
  /**
    * The user name associated with the device.
    */
  var Username: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.Username] = js.native
}

object DescribeDeviceResponse {
  @scala.inline
  def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  @scala.inline
  implicit class DescribeDeviceResponseOps[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstAccessedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstAccessedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstAccessedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstAccessedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: DeviceManufacturer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: DeviceModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: DeviceOperatingSystemName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemVersion(value: DeviceOperatingSystemVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystemVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPatchLevel(value: DevicePatchLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatchLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DeviceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

