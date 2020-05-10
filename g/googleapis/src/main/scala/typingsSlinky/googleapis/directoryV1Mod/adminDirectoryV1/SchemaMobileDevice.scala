package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleapis.AnonDisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Mobile Device resource in Directory API.
  */
@js.native
trait SchemaMobileDevice extends js.Object {
  /**
    * Adb (USB debugging) enabled or disabled on device (Read-only)
    */
  var adbStatus: js.UndefOr[Boolean] = js.native
  /**
    * List of applications installed on Mobile Device
    */
  var applications: js.UndefOr[js.Array[AnonDisplayName]] = js.native
  /**
    * Mobile Device Baseband version (Read-only)
    */
  var basebandVersion: js.UndefOr[String] = js.native
  /**
    * Mobile Device Bootloader version (Read-only)
    */
  var bootloaderVersion: js.UndefOr[String] = js.native
  /**
    * Mobile Device Brand (Read-only)
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * Mobile Device Build number (Read-only)
    */
  var buildNumber: js.UndefOr[String] = js.native
  /**
    * The default locale used on the Mobile Device (Read-only)
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * Developer options enabled or disabled on device (Read-only)
    */
  var developerOptionsStatus: js.UndefOr[Boolean] = js.native
  /**
    * Mobile Device compromised status (Read-only)
    */
  var deviceCompromisedStatus: js.UndefOr[String] = js.native
  /**
    * Mobile Device serial number (Read-only)
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * DevicePasswordStatus (Read-only)
    */
  var devicePasswordStatus: js.UndefOr[String] = js.native
  /**
    * List of owner user&#39;s email addresses (Read-only)
    */
  var email: js.UndefOr[js.Array[String]] = js.native
  /**
    * Mobile Device Encryption Status (Read-only)
    */
  var encryptionStatus: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Date and time the device was first synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var firstSync: js.UndefOr[String] = js.native
  /**
    * Mobile Device Hardware (Read-only)
    */
  var hardware: js.UndefOr[String] = js.native
  /**
    * Mobile Device Hardware Id (Read-only)
    */
  var hardwareId: js.UndefOr[String] = js.native
  /**
    * Mobile Device IMEI number (Read-only)
    */
  var imei: js.UndefOr[String] = js.native
  /**
    * Mobile Device Kernel version (Read-only)
    */
  var kernelVersion: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Date and time the device was last synchronized with the policy settings
    * in the G Suite administrator control panel (Read-only)
    */
  var lastSync: js.UndefOr[String] = js.native
  /**
    * Boolean indicating if this account is on owner/primary profile or not
    * (Read-only)
    */
  var managedAccountIsOnOwnerProfile: js.UndefOr[Boolean] = js.native
  /**
    * Mobile Device manufacturer (Read-only)
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * Mobile Device MEID number (Read-only)
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * Name of the model of the device
    */
  var model: js.UndefOr[String] = js.native
  /**
    * List of owner user&#39;s names (Read-only)
    */
  var name: js.UndefOr[js.Array[String]] = js.native
  /**
    * Mobile Device mobile or network operator (if available) (Read-only)
    */
  var networkOperator: js.UndefOr[String] = js.native
  /**
    * Name of the mobile operating system
    */
  var os: js.UndefOr[String] = js.native
  /**
    * List of accounts added on device (Read-only)
    */
  var otherAccountsInfo: js.UndefOr[js.Array[String]] = js.native
  /**
    * DMAgentPermission (Read-only)
    */
  var privilege: js.UndefOr[String] = js.native
  /**
    * Mobile Device release version version (Read-only)
    */
  var releaseVersion: js.UndefOr[String] = js.native
  /**
    * Unique identifier of Mobile Device (Read-only)
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * Mobile Device Security patch level (Read-only)
    */
  var securityPatchLevel: js.UndefOr[String] = js.native
  /**
    * Mobile Device SSN or Serial Number (Read-only)
    */
  var serialNumber: js.UndefOr[String] = js.native
  /**
    * Status of the device (Read-only)
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Work profile supported on device (Read-only)
    */
  var supportsWorkProfile: js.UndefOr[Boolean] = js.native
  /**
    * The type of device (Read-only)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Unknown sources enabled or disabled on device (Read-only)
    */
  var unknownSourcesStatus: js.UndefOr[Boolean] = js.native
  /**
    * Mobile Device user agent
    */
  var userAgent: js.UndefOr[String] = js.native
  /**
    * Mobile Device WiFi MAC address (Read-only)
    */
  var wifiMacAddress: js.UndefOr[String] = js.native
}

object SchemaMobileDevice {
  @scala.inline
  def apply(): SchemaMobileDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDevice]
  }
  @scala.inline
  implicit class SchemaMobileDeviceOps[Self <: SchemaMobileDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdbStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdbStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withApplications(value: js.Array[AnonDisplayName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(js.undefined)
        ret
    }
    @scala.inline
    def withBasebandVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basebandVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasebandVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basebandVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBootloaderVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloaderVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootloaderVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloaderVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperOptionsStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerOptionsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperOptionsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerOptionsStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCompromisedStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompromisedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCompromisedStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompromisedStatus")(js.undefined)
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
    def withDevicePasswordStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePasswordStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePasswordStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePasswordStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionStatus")(js.undefined)
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
    def withFirstSync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSync")(js.undefined)
        ret
    }
    @scala.inline
    def withHardware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareId")(js.undefined)
        ret
    }
    @scala.inline
    def withImei(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImei: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imei")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelVersion")(js.undefined)
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
    def withManagedAccountIsOnOwnerProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAccountIsOnOwnerProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedAccountIsOnOwnerProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAccountIsOnOwnerProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
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
    def withName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherAccountsInfo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherAccountsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherAccountsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherAccountsInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilege(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilege: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilege")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPatchLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPatchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPatchLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPatchLevel")(js.undefined)
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
    def withSupportsWorkProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsWorkProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsWorkProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsWorkProfile")(js.undefined)
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
    @scala.inline
    def withUnknownSourcesStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownSourcesStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownSourcesStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownSourcesStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiMacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiMacAddress")(js.undefined)
        ret
    }
  }
  
}

