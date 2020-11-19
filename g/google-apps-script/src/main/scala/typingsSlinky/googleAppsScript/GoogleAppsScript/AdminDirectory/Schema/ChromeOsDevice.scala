package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveTimeRangesVarargs(value: ChromeOsDeviceActiveTimeRanges*): Self = this.set("activeTimeRanges", js.Array(value :_*))
    
    @scala.inline
    def setActiveTimeRanges(value: js.Array[ChromeOsDeviceActiveTimeRanges]): Self = this.set("activeTimeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTimeRanges: Self = this.set("activeTimeRanges", js.undefined)
    
    @scala.inline
    def setAnnotatedAssetId(value: String): Self = this.set("annotatedAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedAssetId: Self = this.set("annotatedAssetId", js.undefined)
    
    @scala.inline
    def setAnnotatedLocation(value: String): Self = this.set("annotatedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedLocation: Self = this.set("annotatedLocation", js.undefined)
    
    @scala.inline
    def setAnnotatedUser(value: String): Self = this.set("annotatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotatedUser: Self = this.set("annotatedUser", js.undefined)
    
    @scala.inline
    def setAutoUpdateExpiration(value: String): Self = this.set("autoUpdateExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateExpiration: Self = this.set("autoUpdateExpiration", js.undefined)
    
    @scala.inline
    def setBootMode(value: String): Self = this.set("bootMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootMode: Self = this.set("bootMode", js.undefined)
    
    @scala.inline
    def setCpuStatusReportsVarargs(value: ChromeOsDeviceCpuStatusReports*): Self = this.set("cpuStatusReports", js.Array(value :_*))
    
    @scala.inline
    def setCpuStatusReports(value: js.Array[ChromeOsDeviceCpuStatusReports]): Self = this.set("cpuStatusReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuStatusReports: Self = this.set("cpuStatusReports", js.undefined)
    
    @scala.inline
    def setDeviceFilesVarargs(value: ChromeOsDeviceDeviceFiles*): Self = this.set("deviceFiles", js.Array(value :_*))
    
    @scala.inline
    def setDeviceFiles(value: js.Array[ChromeOsDeviceDeviceFiles]): Self = this.set("deviceFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceFiles: Self = this.set("deviceFiles", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDiskVolumeReportsVarargs(value: ChromeOsDeviceDiskVolumeReports*): Self = this.set("diskVolumeReports", js.Array(value :_*))
    
    @scala.inline
    def setDiskVolumeReports(value: js.Array[ChromeOsDeviceDiskVolumeReports]): Self = this.set("diskVolumeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskVolumeReports: Self = this.set("diskVolumeReports", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setEthernetMacAddress(value: String): Self = this.set("ethernetMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEthernetMacAddress: Self = this.set("ethernetMacAddress", js.undefined)
    
    @scala.inline
    def setFirmwareVersion(value: String): Self = this.set("firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirmwareVersion: Self = this.set("firmwareVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastEnrollmentTime(value: String): Self = this.set("lastEnrollmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEnrollmentTime: Self = this.set("lastEnrollmentTime", js.undefined)
    
    @scala.inline
    def setLastSync(value: String): Self = this.set("lastSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSync: Self = this.set("lastSync", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("macAddress", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setOrderNumber(value: String): Self = this.set("orderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderNumber: Self = this.set("orderNumber", js.undefined)
    
    @scala.inline
    def setOrgUnitPath(value: String): Self = this.set("orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitPath: Self = this.set("orgUnitPath", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    
    @scala.inline
    def setRecentUsersVarargs(value: ChromeOsDeviceRecentUsers*): Self = this.set("recentUsers", js.Array(value :_*))
    
    @scala.inline
    def setRecentUsers(value: js.Array[ChromeOsDeviceRecentUsers]): Self = this.set("recentUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentUsers: Self = this.set("recentUsers", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSupportEndDate(value: String): Self = this.set("supportEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportEndDate: Self = this.set("supportEndDate", js.undefined)
    
    @scala.inline
    def setSystemRamFreeReportsVarargs(value: ChromeOsDeviceSystemRamFreeReports*): Self = this.set("systemRamFreeReports", js.Array(value :_*))
    
    @scala.inline
    def setSystemRamFreeReports(value: js.Array[ChromeOsDeviceSystemRamFreeReports]): Self = this.set("systemRamFreeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemRamFreeReports: Self = this.set("systemRamFreeReports", js.undefined)
    
    @scala.inline
    def setSystemRamTotal(value: String): Self = this.set("systemRamTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemRamTotal: Self = this.set("systemRamTotal", js.undefined)
    
    @scala.inline
    def setTpmVersionInfo(value: ChromeOsDeviceTpmVersionInfo): Self = this.set("tpmVersionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpmVersionInfo: Self = this.set("tpmVersionInfo", js.undefined)
    
    @scala.inline
    def setWillAutoRenew(value: Boolean): Self = this.set("willAutoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillAutoRenew: Self = this.set("willAutoRenew", js.undefined)
  }
}
