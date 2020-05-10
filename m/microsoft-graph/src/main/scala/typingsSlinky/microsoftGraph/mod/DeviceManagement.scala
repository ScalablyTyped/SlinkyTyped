package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagement extends Entity {
  // Apple push notification certificate.
  var applePushNotificationCertificate: js.UndefOr[ApplePushNotificationCertificate] = js.native
  /**
    * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both
    * enrolled and compliant for mail access
    */
  var conditionalAccessSettings: js.UndefOr[OnPremisesConditionalAccessSettings] = js.native
  // The list of detected apps associated with a device.
  var detectedApps: js.UndefOr[js.Array[DetectedApp]] = js.native
  // The list of device categories with the tenant.
  var deviceCategories: js.UndefOr[js.Array[DeviceCategory]] = js.native
  // The device compliance policies.
  var deviceCompliancePolicies: js.UndefOr[js.Array[DeviceCompliancePolicy]] = js.native
  // The device compliance state summary for this account.
  var deviceCompliancePolicyDeviceStateSummary: js.UndefOr[DeviceCompliancePolicyDeviceStateSummary] = js.native
  // The summary states of compliance policy settings for this account.
  var deviceCompliancePolicySettingStateSummaries: js.UndefOr[js.Array[DeviceCompliancePolicySettingStateSummary]] = js.native
  // The device configuration device state summary for this account.
  var deviceConfigurationDeviceStateSummaries: js.UndefOr[DeviceConfigurationDeviceStateSummary] = js.native
  // The device configurations.
  var deviceConfigurations: js.UndefOr[js.Array[DeviceConfiguration]] = js.native
  // The list of device enrollment configurations
  var deviceEnrollmentConfigurations: js.UndefOr[js.Array[DeviceEnrollmentConfiguration]] = js.native
  // The list of Device Management Partners configured by the tenant.
  var deviceManagementPartners: js.UndefOr[js.Array[DeviceManagementPartner]] = js.native
  // The list of Exchange Connectors configured by the tenant.
  var exchangeConnectors: js.UndefOr[js.Array[DeviceManagementExchangeConnector]] = js.native
  /**
    * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the
    * end user web portal.
    */
  var intuneBrand: js.UndefOr[IntuneBrand] = js.native
  // The IOS software update installation statuses for this account.
  var iosUpdateStatuses: js.UndefOr[js.Array[IosUpdateDeviceStatus]] = js.native
  // Device overview
  var managedDeviceOverview: js.UndefOr[ManagedDeviceOverview] = js.native
  // The list of managed devices.
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.native
  // The list of Mobile threat Defense connectors configured by the tenant.
  var mobileThreatDefenseConnectors: js.UndefOr[js.Array[MobileThreatDefenseConnector]] = js.native
  // The Notification Message Templates.
  var notificationMessageTemplates: js.UndefOr[js.Array[NotificationMessageTemplate]] = js.native
  // The remote assist partners.
  var remoteAssistancePartners: js.UndefOr[js.Array[RemoteAssistancePartner]] = js.native
  // The Resource Operations.
  var resourceOperations: js.UndefOr[js.Array[ResourceOperation]] = js.native
  // The Role Assignments.
  var roleAssignments: js.UndefOr[js.Array[DeviceAndAppManagementRoleAssignment]] = js.native
  // The Role Definitions.
  var roleDefinitions: js.UndefOr[js.Array[RoleDefinition]] = js.native
  // Account level settings.
  var settings: js.UndefOr[DeviceManagementSettings] = js.native
  // The software update status summary.
  var softwareUpdateStatusSummary: js.UndefOr[SoftwareUpdateStatusSummary] = js.native
  /**
    * Tenant mobile device management subscription state. The possible values are: pending, active, warning, disabled,
    * deleted, blocked, lockedOut.
    */
  var subscriptionState: js.UndefOr[DeviceManagementSubscriptionState] = js.native
  // The telecom expense management partners.
  var telecomExpenseManagementPartners: js.UndefOr[js.Array[TelecomExpenseManagementPartner]] = js.native
  // The terms and conditions associated with device management of the company.
  var termsAndConditions: js.UndefOr[js.Array[TermsAndConditions]] = js.native
  // The list of troubleshooting events for the tenant.
  var troubleshootingEvents: js.UndefOr[js.Array[DeviceManagementTroubleshootingEvent]] = js.native
  // The windows information protection app learning summaries.
  var windowsInformationProtectionAppLearningSummaries: js.UndefOr[js.Array[WindowsInformationProtectionAppLearningSummary]] = js.native
  // The windows information protection network learning summaries.
  var windowsInformationProtectionNetworkLearningSummaries: js.UndefOr[js.Array[WindowsInformationProtectionNetworkLearningSummary]] = js.native
}

object DeviceManagement {
  @scala.inline
  def apply(): DeviceManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagement]
  }
  @scala.inline
  implicit class DeviceManagementOps[Self <: DeviceManagement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplePushNotificationCertificate(value: ApplePushNotificationCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePushNotificationCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplePushNotificationCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePushNotificationCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalAccessSettings(value: OnPremisesConditionalAccessSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalAccessSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalAccessSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalAccessSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedApps(value: js.Array[DetectedApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCategories(value: js.Array[DeviceCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCompliancePolicies(value: js.Array[DeviceCompliancePolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCompliancePolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCompliancePolicyDeviceStateSummary(value: DeviceCompliancePolicyDeviceStateSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicyDeviceStateSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCompliancePolicyDeviceStateSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicyDeviceStateSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCompliancePolicySettingStateSummaries(value: js.Array[DeviceCompliancePolicySettingStateSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicySettingStateSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCompliancePolicySettingStateSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicySettingStateSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceConfigurationDeviceStateSummaries(value: DeviceConfigurationDeviceStateSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigurationDeviceStateSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfigurationDeviceStateSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigurationDeviceStateSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceConfigurations(value: js.Array[DeviceConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceEnrollmentConfigurations(value: js.Array[DeviceEnrollmentConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceEnrollmentConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceEnrollmentConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceEnrollmentConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceManagementPartners(value: js.Array[DeviceManagementPartner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementPartners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceManagementPartners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementPartners")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeConnectors(value: js.Array[DeviceManagementExchangeConnector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeConnectors")(js.undefined)
        ret
    }
    @scala.inline
    def withIntuneBrand(value: IntuneBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intuneBrand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntuneBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intuneBrand")(js.undefined)
        ret
    }
    @scala.inline
    def withIosUpdateStatuses(value: js.Array[IosUpdateDeviceStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosUpdateStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosUpdateStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosUpdateStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedDeviceOverview(value: ManagedDeviceOverview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceOverview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedDeviceOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceOverview")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedDevices(value: js.Array[ManagedDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileThreatDefenseConnectors(value: js.Array[MobileThreatDefenseConnector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileThreatDefenseConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileThreatDefenseConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileThreatDefenseConnectors")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationMessageTemplates(value: js.Array[NotificationMessageTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMessageTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationMessageTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMessageTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAssistancePartners(value: js.Array[RemoteAssistancePartner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAssistancePartners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAssistancePartners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAssistancePartners")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceOperations(value: js.Array[ResourceOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAssignments(value: js.Array[DeviceAndAppManagementRoleAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleDefinitions(value: js.Array[RoleDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: DeviceManagementSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareUpdateStatusSummary(value: SoftwareUpdateStatusSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareUpdateStatusSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareUpdateStatusSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareUpdateStatusSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionState(value: DeviceManagementSubscriptionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionState")(js.undefined)
        ret
    }
    @scala.inline
    def withTelecomExpenseManagementPartners(value: js.Array[TelecomExpenseManagementPartner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecomExpenseManagementPartners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelecomExpenseManagementPartners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecomExpenseManagementPartners")(js.undefined)
        ret
    }
    @scala.inline
    def withTermsAndConditions(value: js.Array[TermsAndConditions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsAndConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsAndConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsAndConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withTroubleshootingEvents(value: js.Array[DeviceManagementTroubleshootingEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("troubleshootingEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTroubleshootingEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("troubleshootingEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsInformationProtectionAppLearningSummaries(value: js.Array[WindowsInformationProtectionAppLearningSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsInformationProtectionAppLearningSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsInformationProtectionAppLearningSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsInformationProtectionAppLearningSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsInformationProtectionNetworkLearningSummaries(value: js.Array[WindowsInformationProtectionNetworkLearningSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsInformationProtectionNetworkLearningSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsInformationProtectionNetworkLearningSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsInformationProtectionNetworkLearningSummaries")(js.undefined)
        ret
    }
  }
  
}

