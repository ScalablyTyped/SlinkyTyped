package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A device owned by an enterprise. Unless otherwise noted, all fields are
  * read-only and can&#39;t be modified by enterprises.devices.patch.
  */
@js.native
trait SchemaDevice extends js.Object {
  /**
    * The API level of the Android platform version running on the device.
    */
  var apiLevel: js.UndefOr[Double] = js.native
  /**
    * Reports for apps installed on the device. This information is only
    * available when application_reports_enabled is true in the device&#39;s
    * policy.
    */
  var applicationReports: js.UndefOr[js.Array[SchemaApplicationReport]] = js.native
  /**
    * The name of the policy currently applied to the device.
    */
  var appliedPolicyName: js.UndefOr[String] = js.native
  /**
    * The version of the policy currently applied to the device.
    */
  var appliedPolicyVersion: js.UndefOr[String] = js.native
  /**
    * The state currently applied to the device.
    */
  var appliedState: js.UndefOr[String] = js.native
  /**
    * Device settings information. This information is only available if
    * deviceSettingsEnabled is true in the device&#39;s policy.
    */
  var deviceSettings: js.UndefOr[SchemaDeviceSettings] = js.native
  /**
    * If the device state is DISABLED, an optional message that is displayed on
    * the device indicating the reason the device is disabled. This field can
    * be modified by a patch request.
    */
  var disabledReason: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * Detailed information about displays on the device. This information is
    * only available if displayInfoEnabled is true in the device&#39;s policy.
    */
  var displays: js.UndefOr[js.Array[SchemaDisplay]] = js.native
  /**
    * The time of device enrollment.
    */
  var enrollmentTime: js.UndefOr[String] = js.native
  /**
    * If the device was enrolled with an enrollment token with additional data
    * provided, this field contains that data.
    */
  var enrollmentTokenData: js.UndefOr[String] = js.native
  /**
    * If the device was enrolled with an enrollment token, this field contains
    * the name of the token.
    */
  var enrollmentTokenName: js.UndefOr[String] = js.native
  /**
    * Detailed information about the device hardware.
    */
  var hardwareInfo: js.UndefOr[SchemaHardwareInfo] = js.native
  /**
    * Hardware status samples in chronological order. This information is only
    * available if hardwareStatusEnabled is true in the device&#39;s policy.
    */
  var hardwareStatusSamples: js.UndefOr[js.Array[SchemaHardwareStatus]] = js.native
  /**
    * Deprecated.
    */
  var lastPolicyComplianceReportTime: js.UndefOr[String] = js.native
  /**
    * The last time the device fetched its policy.
    */
  var lastPolicySyncTime: js.UndefOr[String] = js.native
  /**
    * The last time the device sent a status report.
    */
  var lastStatusReportTime: js.UndefOr[String] = js.native
  /**
    * The type of management mode Android Device Policy takes on the device.
    * This influences which policy settings are supported.
    */
  var managementMode: js.UndefOr[String] = js.native
  /**
    * Events related to memory and storage measurements in chronological order.
    * This information is only available if memoryInfoEnabled is true in the
    * device&#39;s policy.
    */
  var memoryEvents: js.UndefOr[js.Array[SchemaMemoryEvent]] = js.native
  /**
    * Memory information. This information is only available if
    * memoryInfoEnabled is true in the device&#39;s policy.
    */
  var memoryInfo: js.UndefOr[SchemaMemoryInfo] = js.native
  /**
    * The name of the device in the form
    * enterprises/{enterpriseId}/devices/{deviceId}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Device network information. This information is only available if
    * networkInfoEnabled is true in the device&#39;s policy.
    */
  var networkInfo: js.UndefOr[SchemaNetworkInfo] = js.native
  /**
    * Details about policy settings that the device is not compliant with.
    */
  var nonComplianceDetails: js.UndefOr[js.Array[SchemaNonComplianceDetail]] = js.native
  /**
    * Whether the device is compliant with its policy.
    */
  var policyCompliant: js.UndefOr[Boolean] = js.native
  /**
    * The name of the policy applied to the device, in the form
    * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the
    * policy_name for the device&#39;s user is applied. This field can be
    * modified by a patch request. You can specify only the policyId when
    * calling enterprises.devices.patch, as long as the policyId doesn’t
    * contain any slashes. The rest of the policy name is inferred.
    */
  var policyName: js.UndefOr[String] = js.native
  /**
    * Power management events on the device in chronological order. This
    * information is only available if powerManagementEventsEnabled is true in
    * the device&#39;s policy.
    */
  var powerManagementEvents: js.UndefOr[js.Array[SchemaPowerManagementEvent]] = js.native
  /**
    * If the same physical device has been enrolled multiple times, this field
    * contains its previous device names. The serial number is used as the
    * unique identifier to determine if the same physical device has enrolled
    * previously. The names are in chronological order.
    */
  var previousDeviceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Detailed information about the device software. This information is only
    * available if softwareInfoEnabled is true in the device&#39;s policy.
    */
  var softwareInfo: js.UndefOr[SchemaSoftwareInfo] = js.native
  /**
    * The state to be applied to the device. This field can be modified by a
    * patch request. Note that when calling enterprises.devices.patch, ACTIVE
    * and DISABLED are the only allowable values. To enter the device into a
    * DELETED state, call enterprises.devices.delete.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The user who owns the device.
    */
  var user: js.UndefOr[SchemaUser] = js.native
  /**
    * The resource name of the user that owns this device in the form
    * enterprises/{enterpriseId}/users/{userId}.
    */
  var userName: js.UndefOr[String] = js.native
}

object SchemaDevice {
  @scala.inline
  def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  @scala.inline
  implicit class SchemaDeviceOps[Self <: SchemaDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationReports(value: js.Array[SchemaApplicationReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationReports")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedPolicyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicyName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedPolicyVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicyVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedPolicyVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicyVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedState")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSettings(value: SchemaDeviceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledReason(value: SchemaUserFacingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplays(value: js.Array[SchemaDisplay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displays")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollmentTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollmentTokenData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTokenData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentTokenData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTokenData")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollmentTokenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTokenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentTokenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTokenName")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareInfo(value: SchemaHardwareInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareStatusSamples(value: js.Array[SchemaHardwareStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareStatusSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareStatusSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareStatusSamples")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPolicyComplianceReportTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPolicyComplianceReportTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPolicyComplianceReportTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPolicyComplianceReportTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPolicySyncTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPolicySyncTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPolicySyncTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPolicySyncTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusReportTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusReportTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusReportTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusReportTime")(js.undefined)
        ret
    }
    @scala.inline
    def withManagementMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryEvents(value: js.Array[SchemaMemoryEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryInfo(value: SchemaMemoryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withNetworkInfo(value: SchemaNetworkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withNonComplianceDetails(value: js.Array[SchemaNonComplianceDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonComplianceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonComplianceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonComplianceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyCompliant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyCompliant")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPowerManagementEvents(value: js.Array[SchemaPowerManagementEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerManagementEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerManagementEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerManagementEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousDeviceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousDeviceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousDeviceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousDeviceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareInfo(value: SchemaSoftwareInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

