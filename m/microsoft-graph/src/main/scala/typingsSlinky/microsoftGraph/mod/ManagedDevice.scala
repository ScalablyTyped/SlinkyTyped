package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedDevice extends Entity {
  // Code that allows the Activation Lock on a device to be bypassed.
  var activationLockBypassCode: js.UndefOr[String] = js.native
  // Android security patch level
  var androidSecurityPatchLevel: js.UndefOr[String] = js.native
  // The unique identifier for the Azure Active Directory device. Read only.
  var azureADDeviceId: js.UndefOr[String] = js.native
  // Whether the device is Azure Active Directory registered.
  var azureADRegistered: js.UndefOr[Boolean] = js.native
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  /**
    * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod,
    * configManager.
    */
  var complianceState: js.UndefOr[ComplianceState] = js.native
  // ConfigrMgr client enabled features
  var configurationManagerClientEnabledFeatures: js.UndefOr[ConfigurationManagerClientEnabledFeatures] = js.native
  // List of ComplexType deviceActionResult objects.
  var deviceActionResults: js.UndefOr[js.Array[DeviceActionResult]] = js.native
  // Device category
  var deviceCategory: js.UndefOr[DeviceCategory] = js.native
  // Device category display name
  var deviceCategoryDisplayName: js.UndefOr[String] = js.native
  // Device compliance policy states for this device.
  var deviceCompliancePolicyStates: js.UndefOr[js.Array[DeviceCompliancePolicyState]] = js.native
  // Device configuration states for this device.
  var deviceConfigurationStates: js.UndefOr[js.Array[DeviceConfigurationState]] = js.native
  /**
    * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager,
    * appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment,
    * windowsBulkAzureDomainJoin, windowsCoManagement.
    */
  var deviceEnrollmentType: js.UndefOr[DeviceEnrollmentType] = js.native
  // The device health attestation state.
  var deviceHealthAttestationState: js.UndefOr[DeviceHealthAttestationState] = js.native
  // Name of the device
  var deviceName: js.UndefOr[String] = js.native
  /**
    * Device registration state. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending,
    * certificateReset, notRegisteredPendingEnrollment, unknown.
    */
  var deviceRegistrationState: js.UndefOr[DeviceRegistrationState] = js.native
  // Whether the device is Exchange ActiveSync activated.
  var easActivated: js.UndefOr[Boolean] = js.native
  // Exchange ActivationSync activation time of the device.
  var easActivationDateTime: js.UndefOr[String] = js.native
  // Exchange ActiveSync Id of the device.
  var easDeviceId: js.UndefOr[String] = js.native
  // Email(s) for the user associated with the device
  var emailAddress: js.UndefOr[String] = js.native
  // Enrollment time of the device.
  var enrolledDateTime: js.UndefOr[String] = js.native
  // The Access State of the device in Exchange. Possible values are: none, unknown, allowed, blocked, quarantined.
  var exchangeAccessState: js.UndefOr[DeviceManagementExchangeAccessState] = js.native
  /**
    * The reason for the device's access state in Exchange. Possible values are: none, unknown, exchangeGlobalRule,
    * exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant,
    * notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword,
    * deviceNotKnownWithManagedApp.
    */
  var exchangeAccessStateReason: js.UndefOr[DeviceManagementExchangeAccessStateReason] = js.native
  // Last time the device contacted Exchange.
  var exchangeLastSuccessfulSyncDateTime: js.UndefOr[String] = js.native
  // Free Storage in Bytes
  var freeStorageSpaceInBytes: js.UndefOr[Double] = js.native
  // IMEI
  var imei: js.UndefOr[String] = js.native
  // Device encryption status
  var isEncrypted: js.UndefOr[Boolean] = js.native
  // Device supervised status
  var isSupervised: js.UndefOr[Boolean] = js.native
  // whether the device is jail broken or rooted.
  var jailBroken: js.UndefOr[String] = js.native
  // The date and time that the device last completed a successful sync with Intune.
  var lastSyncDateTime: js.UndefOr[String] = js.native
  // Automatically generated name to identify a device. Can be overwritten to a user friendly name.
  var managedDeviceName: js.UndefOr[String] = js.native
  // Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
  var managedDeviceOwnerType: js.UndefOr[ManagedDeviceOwnerType] = js.native
  /**
    * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient,
    * easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown,
    * jamf, googleCloudDevicePolicyController.
    */
  var managementAgent: js.UndefOr[ManagementAgentType] = js.native
  // Manufacturer of the device
  var manufacturer: js.UndefOr[String] = js.native
  // MEID
  var meid: js.UndefOr[String] = js.native
  // Model of the device
  var model: js.UndefOr[String] = js.native
  // Operating system of the device. Windows, iOS, etc.
  var operatingSystem: js.UndefOr[String] = js.native
  // Operating system version of the device.
  var osVersion: js.UndefOr[String] = js.native
  /**
    * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read
    * Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity,
    * unresponsive, compromised, misconfigured.
    */
  var partnerReportedThreatState: js.UndefOr[ManagedDevicePartnerReportedHealthState] = js.native
  // Phone number of the device
  var phoneNumber: js.UndefOr[String] = js.native
  // An error string that identifies issues when creating Remote Assistance session objects.
  var remoteAssistanceSessionErrorDetails: js.UndefOr[String] = js.native
  // Url that allows a Remote Assistance session to be established with the device.
  var remoteAssistanceSessionUrl: js.UndefOr[String] = js.native
  // SerialNumber
  var serialNumber: js.UndefOr[String] = js.native
  // Subscriber Carrier
  var subscriberCarrier: js.UndefOr[String] = js.native
  // Total Storage in Bytes
  var totalStorageSpaceInBytes: js.UndefOr[Double] = js.native
  // User display name
  var userDisplayName: js.UndefOr[String] = js.native
  // Unique Identifier for the user associated with the device
  var userId: js.UndefOr[String] = js.native
  // Device user principal name
  var userPrincipalName: js.UndefOr[String] = js.native
  // Wi-Fi MAC
  var wiFiMacAddress: js.UndefOr[String] = js.native
}

object ManagedDevice {
  @scala.inline
  def apply(): ManagedDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDevice]
  }
  @scala.inline
  implicit class ManagedDeviceOps[Self <: ManagedDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationLockBypassCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationLockBypassCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationLockBypassCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationLockBypassCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidSecurityPatchLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidSecurityPatchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidSecurityPatchLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidSecurityPatchLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureADDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureADDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureADDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureADDeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureADRegistered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureADRegistered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureADRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureADRegistered")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceGracePeriodExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceGracePeriodExpirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceGracePeriodExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceGracePeriodExpirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceState(value: ComplianceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceState")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationManagerClientEnabledFeatures(value: ConfigurationManagerClientEnabledFeatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationManagerClientEnabledFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationManagerClientEnabledFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationManagerClientEnabledFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceActionResults(value: js.Array[DeviceActionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceActionResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceActionResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceActionResults")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCategory(value: DeviceCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCategoryDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategoryDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCategoryDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategoryDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCompliancePolicyStates(value: js.Array[DeviceCompliancePolicyState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicyStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCompliancePolicyStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompliancePolicyStates")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceConfigurationStates(value: js.Array[DeviceConfigurationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigurationStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfigurationStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigurationStates")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceEnrollmentType(value: DeviceEnrollmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceEnrollmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceEnrollmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceEnrollmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceHealthAttestationState(value: DeviceHealthAttestationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHealthAttestationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceHealthAttestationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHealthAttestationState")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceRegistrationState(value: DeviceRegistrationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRegistrationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceRegistrationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRegistrationState")(js.undefined)
        ret
    }
    @scala.inline
    def withEasActivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easActivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easActivated")(js.undefined)
        ret
    }
    @scala.inline
    def withEasActivationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easActivationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasActivationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easActivationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEasDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easDeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrolledDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrolledDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeAccessState(value: DeviceManagementExchangeAccessState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeAccessState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeAccessState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeAccessState")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeAccessStateReason(value: DeviceManagementExchangeAccessStateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeAccessStateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeAccessStateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeAccessStateReason")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeLastSuccessfulSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeLastSuccessfulSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeLastSuccessfulSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeLastSuccessfulSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeStorageSpaceInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeStorageSpaceInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeStorageSpaceInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeStorageSpaceInBytes")(js.undefined)
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
    def withIsEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSupervised(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupervised")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSupervised: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupervised")(js.undefined)
        ret
    }
    @scala.inline
    def withJailBroken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jailBroken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJailBroken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jailBroken")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedDeviceOwnerType(value: ManagedDeviceOwnerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceOwnerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedDeviceOwnerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceOwnerType")(js.undefined)
        ret
    }
    @scala.inline
    def withManagementAgent(value: ManagementAgentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementAgent")(js.undefined)
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
    def withPartnerReportedThreatState(value: ManagedDevicePartnerReportedHealthState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerReportedThreatState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerReportedThreatState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerReportedThreatState")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAssistanceSessionErrorDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAssistanceSessionErrorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAssistanceSessionErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAssistanceSessionErrorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAssistanceSessionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAssistanceSessionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAssistanceSessionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAssistanceSessionUrl")(js.undefined)
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
    def withSubscriberCarrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberCarrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriberCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberCarrier")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalStorageSpaceInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalStorageSpaceInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalStorageSpaceInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalStorageSpaceInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
    @scala.inline
    def withWiFiMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiMacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiFiMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiMacAddress")(js.undefined)
        ret
    }
  }
  
}

