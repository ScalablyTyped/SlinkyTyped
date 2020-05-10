package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleapis.AnonActiveTime
import typingsSlinky.googleapis.AnonCpuTemperatureInfo
import typingsSlinky.googleapis.AnonCreateTime
import typingsSlinky.googleapis.AnonEmail
import typingsSlinky.googleapis.AnonFamily
import typingsSlinky.googleapis.AnonReportTime
import typingsSlinky.googleapis.AnonVolumeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Chrome Os Device resource in Directory API.
  */
@js.native
trait SchemaChromeOsDevice extends js.Object {
  /**
    * List of active time ranges (Read-only)
    */
  var activeTimeRanges: js.UndefOr[js.Array[AnonActiveTime]] = js.native
  /**
    * AssetId specified during enrollment or through later annotation
    */
  var annotatedAssetId: js.UndefOr[String] = js.native
  /**
    * Address or location of the device as noted by the administrator
    */
  var annotatedLocation: js.UndefOr[String] = js.native
  /**
    * User of the device
    */
  var annotatedUser: js.UndefOr[String] = js.native
  /**
    * Chromebook boot mode (Read-only)
    */
  var bootMode: js.UndefOr[String] = js.native
  /**
    * Reports of CPU utilization and temperature (Read-only)
    */
  var cpuStatusReports: js.UndefOr[js.Array[AnonCpuTemperatureInfo]] = js.native
  /**
    * List of device files to download (Read-only)
    */
  var deviceFiles: js.UndefOr[js.Array[AnonCreateTime]] = js.native
  /**
    * Unique identifier of Chrome OS Device (Read-only)
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Reports of disk space and other info about mounted/connected volumes.
    */
  var diskVolumeReports: js.UndefOr[js.Array[AnonVolumeInfo]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Chromebook Mac Address on ethernet network interface (Read-only)
    */
  var ethernetMacAddress: js.UndefOr[String] = js.native
  /**
    * Chromebook firmware version (Read-only)
    */
  var firmwareVersion: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Date and time the device was last enrolled (Read-only)
    */
  var lastEnrollmentTime: js.UndefOr[String] = js.native
  /**
    * Date and time the device was last synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String] = js.native
  /**
    * Chromebook Mac Address on wifi network interface (Read-only)
    */
  var macAddress: js.UndefOr[String] = js.native
  /**
    * Mobile Equipment identifier for the 3G mobile card in the Chromebook
    * (Read-only)
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * Chromebook Model (Read-only)
    */
  var model: js.UndefOr[String] = js.native
  /**
    * Notes added by the administrator
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Chromebook order number (Read-only)
    */
  var orderNumber: js.UndefOr[String] = js.native
  /**
    * OrgUnit of the device
    */
  var orgUnitPath: js.UndefOr[String] = js.native
  /**
    * Chromebook Os Version (Read-only)
    */
  var osVersion: js.UndefOr[String] = js.native
  /**
    * Chromebook platform version (Read-only)
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * List of recent device users, in descending order by last login time
    * (Read-only)
    */
  var recentUsers: js.UndefOr[js.Array[AnonEmail]] = js.native
  /**
    * Chromebook serial number (Read-only)
    */
  var serialNumber: js.UndefOr[String] = js.native
  /**
    * status of the device (Read-only)
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Final date the device will be supported (Read-only)
    */
  var supportEndDate: js.UndefOr[String] = js.native
  /**
    * Reports of amounts of available RAM memory (Read-only)
    */
  var systemRamFreeReports: js.UndefOr[js.Array[AnonReportTime]] = js.native
  /**
    * Total RAM on the device [in bytes] (Read-only)
    */
  var systemRamTotal: js.UndefOr[String] = js.native
  /**
    * Trusted Platform Module (TPM) (Read-only)
    */
  var tpmVersionInfo: js.UndefOr[AnonFamily] = js.native
  /**
    * Will Chromebook auto renew after support end date (Read-only)
    */
  var willAutoRenew: js.UndefOr[Boolean] = js.native
}

object SchemaChromeOsDevice {
  @scala.inline
  def apply(): SchemaChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeOsDevice]
  }
  @scala.inline
  implicit class SchemaChromeOsDeviceOps[Self <: SchemaChromeOsDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTimeRanges(value: js.Array[AnonActiveTime]): Self = {
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
    def withCpuStatusReports(value: js.Array[AnonCpuTemperatureInfo]): Self = {
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
    def withDeviceFiles(value: js.Array[AnonCreateTime]): Self = {
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
    def withDiskVolumeReports(value: js.Array[AnonVolumeInfo]): Self = {
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
    def withRecentUsers(value: js.Array[AnonEmail]): Self = {
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
    def withSystemRamFreeReports(value: js.Array[AnonReportTime]): Self = {
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
    def withTpmVersionInfo(value: AnonFamily): Self = {
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

