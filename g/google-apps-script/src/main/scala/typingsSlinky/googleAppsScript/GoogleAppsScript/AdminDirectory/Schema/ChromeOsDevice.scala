package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDevice extends js.Object {
  var activeTimeRanges: js.UndefOr[js.Array[ChromeOsDeviceActiveTimeRanges]] = js.native
  var annotatedAssetId: js.UndefOr[String] = js.native
  var annotatedLocation: js.UndefOr[String] = js.native
  var annotatedUser: js.UndefOr[String] = js.native
  var autoUpdateExpiration: js.UndefOr[String] = js.native
  var bootMode: js.UndefOr[String] = js.native
  var cpuStatusReports: js.UndefOr[js.Array[ChromeOsDeviceCpuStatusReports]] = js.native
  var deviceFiles: js.UndefOr[js.Array[ChromeOsDeviceDeviceFiles]] = js.native
  var deviceId: js.UndefOr[String] = js.native
  var diskVolumeReports: js.UndefOr[js.Array[ChromeOsDeviceDiskVolumeReports]] = js.native
  var etag: js.UndefOr[String] = js.native
  var ethernetMacAddress: js.UndefOr[String] = js.native
  var firmwareVersion: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastEnrollmentTime: js.UndefOr[String] = js.native
  var lastSync: js.UndefOr[String] = js.native
  var macAddress: js.UndefOr[String] = js.native
  var meid: js.UndefOr[String] = js.native
  var model: js.UndefOr[String] = js.native
  var notes: js.UndefOr[String] = js.native
  var orderNumber: js.UndefOr[String] = js.native
  var orgUnitPath: js.UndefOr[String] = js.native
  var osVersion: js.UndefOr[String] = js.native
  var platformVersion: js.UndefOr[String] = js.native
  var recentUsers: js.UndefOr[js.Array[ChromeOsDeviceRecentUsers]] = js.native
  var serialNumber: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var supportEndDate: js.UndefOr[String] = js.native
  var systemRamFreeReports: js.UndefOr[js.Array[ChromeOsDeviceSystemRamFreeReports]] = js.native
  var systemRamTotal: js.UndefOr[String] = js.native
  var tpmVersionInfo: js.UndefOr[ChromeOsDeviceTpmVersionInfo] = js.native
  var willAutoRenew: js.UndefOr[Boolean] = js.native
}

object ChromeOsDevice {
  @scala.inline
  def apply(): ChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDevice]
  }
  @scala.inline
  implicit class ChromeOsDeviceOps[Self <: ChromeOsDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTimeRanges(value: js.Array[ChromeOsDeviceActiveTimeRanges]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTimeRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTimeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTimeRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotatedAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedAssetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotatedAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedAssetId")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotatedLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotatedLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotatedUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotatedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedUser")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdateExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withBootMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuStatusReports(value: js.Array[ChromeOsDeviceCpuStatusReports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuStatusReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuStatusReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuStatusReports")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceFiles(value: js.Array[ChromeOsDeviceDeviceFiles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskVolumeReports(value: js.Array[ChromeOsDeviceDiskVolumeReports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskVolumeReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskVolumeReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskVolumeReports")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withEthernetMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ethernetMacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEthernetMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ethernetMacAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withFirmwareVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirmwareVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEnrollmentTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEnrollmentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEnrollmentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEnrollmentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSync")(js.undefined)
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMeid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meid")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgUnitPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnitPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRecentUsers(value: js.Array[ChromeOsDeviceRecentUsers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemRamFreeReports(value: js.Array[ChromeOsDeviceSystemRamFreeReports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemRamFreeReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemRamFreeReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemRamFreeReports")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemRamTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemRamTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemRamTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemRamTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withTpmVersionInfo(value: ChromeOsDeviceTpmVersionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpmVersionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpmVersionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpmVersionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withWillAutoRenew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willAutoRenew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWillAutoRenew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willAutoRenew")(js.undefined)
        ret
    }
  }
  
}

