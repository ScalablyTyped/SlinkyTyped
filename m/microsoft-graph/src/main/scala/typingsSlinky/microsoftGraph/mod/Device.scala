package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends DirectoryObject {
  // true if the account is enabled; otherwise, false. Required.
  var accountEnabled: js.UndefOr[Boolean] = js.native
  // For internal use only. Not nullable.
  var alternativeSecurityIds: js.UndefOr[js.Array[AlternativeSecurityId]] = js.native
  /**
    * The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var approximateLastSignInDateTime: js.UndefOr[String] = js.native
  /**
    * The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var complianceExpirationDateTime: js.UndefOr[String] = js.native
  // Unique identifier set by Azure Device Registration Service at the time of registration.
  var deviceId: js.UndefOr[String] = js.native
  // For interal use only. Set to null.
  var deviceMetadata: js.UndefOr[String] = js.native
  // For interal use only.
  var deviceVersion: js.UndefOr[Double] = js.native
  // The display name for the device. Required.
  var displayName: js.UndefOr[String] = js.native
  // The collection of open extensions defined for the device. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  /**
    * true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be
    * updated by Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isCompliant: js.UndefOr[Boolean] = js.native
  /**
    * true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by
    * Intune for any device OS type or by an approved MDM app for Windows OS devices.
    */
  var isManaged: js.UndefOr[Boolean] = js.native
  // Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * The last time at which the object was synced with the on-premises directory.The Timestamp type represents date and time
    * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like
    * this: '2014-01-01T00:00:00Z' Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.native
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an
    * on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory
    * (default). Read-only.
    */
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.native
  // The type of operating system on the device. Required.
  var operatingSystem: js.UndefOr[String] = js.native
  // The version of the operating system on the device. Required.
  var operatingSystemVersion: js.UndefOr[String] = js.native
  // For interal use only. Not nullable.
  var physicalIds: js.UndefOr[js.Array[String]] = js.native
  // The profile type of the device. Possible values:RegisteredDevice (default)SecureVMPrinterSharedIoT
  var profileType: js.UndefOr[String] = js.native
  /**
    * The user that cloud joined the device or registered their personal device. The registered owner is set at the time of
    * registration. Currently, there can be only one owner. Read-only. Nullable.
    */
  var registeredOwners: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Collection of registered users of the device. For cloud joined devices and registered personal devices, registered
    * users are set to the same value as registered owners at the time of registration. Read-only. Nullable.
    */
  var registeredUsers: js.UndefOr[js.Array[DirectoryObject]] = js.native
  // List of labels applied to the device by the system.
  var systemLabels: js.UndefOr[js.Array[String]] = js.native
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * Type of trust for the joined device. Read-only. Possible values: Workplace - indicates bring your own personal
    * devicesAzureAd - Cloud only joined devicesServerAd - on-premises domain joined devices joined to Azure AD. For more
    * details, see Introduction to device management in Azure Active Directory
    */
  var trustType: js.UndefOr[String] = js.native
}

object Device {
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternativeSecurityIds(value: js.Array[AlternativeSecurityId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeSecurityIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternativeSecurityIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeSecurityIds")(js.undefined)
        ret
    }
    @scala.inline
    def withApproximateLastSignInDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximateLastSignInDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateLastSignInDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximateLastSignInDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceExpirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceExpirationDateTime")(js.undefined)
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
    def withDeviceMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompliant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompliant")(js.undefined)
        ret
    }
    @scala.inline
    def withIsManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isManaged")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberOf")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesLastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSyncEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSyncEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalIds")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileType")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredOwners(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOwners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOwners")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredUsers(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitiveMemberOf(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitiveMemberOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveMemberOf")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustType")(js.undefined)
        ret
    }
  }
  
}

