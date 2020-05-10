package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceAppManagement extends Entity {
  // Android managed app policies.
  var androidManagedAppProtections: js.UndefOr[js.Array[AndroidManagedAppProtection]] = js.native
  // Default managed app policies.
  var defaultManagedAppProtections: js.UndefOr[js.Array[DefaultManagedAppProtection]] = js.native
  // iOS managed app policies.
  var iosManagedAppProtections: js.UndefOr[js.Array[IosManagedAppProtection]] = js.native
  // Whether the account is enabled for syncing applications from the Microsoft Store for Business.
  var isEnabledForMicrosoftStoreForBusiness: js.UndefOr[Boolean] = js.native
  // Managed app policies.
  var managedAppPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.native
  // The managed app registrations.
  var managedAppRegistrations: js.UndefOr[js.Array[ManagedAppRegistration]] = js.native
  // The managed app statuses.
  var managedAppStatuses: js.UndefOr[js.Array[ManagedAppStatus]] = js.native
  // The Managed eBook.
  var managedEBooks: js.UndefOr[js.Array[ManagedEBook]] = js.native
  // Windows information protection for apps running on devices which are MDM enrolled.
  var mdmWindowsInformationProtectionPolicies: js.UndefOr[js.Array[MdmWindowsInformationProtectionPolicy]] = js.native
  /**
    * The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a
    * country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is
    * -&amp;lt;country/regioncode2&amp;gt;, where is a lowercase two-letter code derived from ISO 639-1 and
    * &amp;lt;country/regioncode2&amp;gt; is an uppercase two-letter code derived from ISO 3166. For example, en-US for
    * English (United States) is a specific culture.
    */
  var microsoftStoreForBusinessLanguage: js.UndefOr[String] = js.native
  // The last time an application sync from the Microsoft Store for Business was completed.
  var microsoftStoreForBusinessLastCompletedApplicationSyncTime: js.UndefOr[String] = js.native
  // The last time the apps from the Microsoft Store for Business were synced successfully for the account.
  var microsoftStoreForBusinessLastSuccessfulSyncDateTime: js.UndefOr[String] = js.native
  // The mobile app categories.
  var mobileAppCategories: js.UndefOr[js.Array[MobileAppCategory]] = js.native
  // The Managed Device Mobile Application Configurations.
  var mobileAppConfigurations: js.UndefOr[js.Array[ManagedDeviceMobileAppConfiguration]] = js.native
  // The mobile apps.
  var mobileApps: js.UndefOr[js.Array[MobileApp]] = js.native
  // Targeted managed app configurations.
  var targetedManagedAppConfigurations: js.UndefOr[js.Array[TargetedManagedAppConfiguration]] = js.native
  // List of Vpp tokens for this organization.
  var vppTokens: js.UndefOr[js.Array[VppToken]] = js.native
  // Windows information protection for apps running on devices which are not MDM enrolled.
  var windowsInformationProtectionPolicies: js.UndefOr[js.Array[WindowsInformationProtectionPolicy]] = js.native
}

object DeviceAppManagement {
  @scala.inline
  def apply(): DeviceAppManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAppManagement]
  }
  @scala.inline
  implicit class DeviceAppManagementOps[Self <: DeviceAppManagement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidManagedAppProtections(value: js.Array[AndroidManagedAppProtection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidManagedAppProtections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidManagedAppProtections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidManagedAppProtections")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultManagedAppProtections(value: js.Array[DefaultManagedAppProtection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultManagedAppProtections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultManagedAppProtections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultManagedAppProtections")(js.undefined)
        ret
    }
    @scala.inline
    def withIosManagedAppProtections(value: js.Array[IosManagedAppProtection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosManagedAppProtections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosManagedAppProtections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosManagedAppProtections")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabledForMicrosoftStoreForBusiness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabledForMicrosoftStoreForBusiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnabledForMicrosoftStoreForBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabledForMicrosoftStoreForBusiness")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedAppPolicies(value: js.Array[ManagedAppPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedAppPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedAppRegistrations(value: js.Array[ManagedAppRegistration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppRegistrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedAppRegistrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppRegistrations")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedAppStatuses(value: js.Array[ManagedAppStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedAppStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedAppStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedEBooks(value: js.Array[ManagedEBook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedEBooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedEBooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedEBooks")(js.undefined)
        ret
    }
    @scala.inline
    def withMdmWindowsInformationProtectionPolicies(value: js.Array[MdmWindowsInformationProtectionPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdmWindowsInformationProtectionPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdmWindowsInformationProtectionPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdmWindowsInformationProtectionPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosoftStoreForBusinessLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftStoreForBusinessLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosoftStoreForBusinessLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftStoreForBusinessLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftStoreForBusinessLastCompletedApplicationSyncTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosoftStoreForBusinessLastCompletedApplicationSyncTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftStoreForBusinessLastCompletedApplicationSyncTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftStoreForBusinessLastSuccessfulSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosoftStoreForBusinessLastSuccessfulSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftStoreForBusinessLastSuccessfulSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileAppCategories(value: js.Array[MobileAppCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileAppCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileAppConfigurations(value: js.Array[ManagedDeviceMobileAppConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileAppConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileApps(value: js.Array[MobileApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileApps")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetedManagedAppConfigurations(value: js.Array[TargetedManagedAppConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedManagedAppConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetedManagedAppConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetedManagedAppConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withVppTokens(value: js.Array[VppToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVppTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsInformationProtectionPolicies(value: js.Array[WindowsInformationProtectionPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsInformationProtectionPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsInformationProtectionPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsInformationProtectionPolicies")(js.undefined)
        ret
    }
  }
  
}

