package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /** The API level of the Android platform version running on the device. */
  var apiLevel: js.UndefOr[Double] = js.native
  /** The name of the policy that is currently applied by the device. */
  var appliedPolicyName: js.UndefOr[String] = js.native
  /** The version of the policy that is currently applied by the device. */
  var appliedPolicyVersion: js.UndefOr[String] = js.native
  /** The state that is currently applied by the device. */
  var appliedState: js.UndefOr[String] = js.native
  /**
    * If the device state is DISABLED, an optional message that is displayed on the device indicating the reason the device is disabled. This field may be
    * modified by an update request.
    */
  var disabledReason: js.UndefOr[UserFacingMessage] = js.native
  /** Displays on the device. This information is only available when displayInfoEnabled is true in the device's policy. */
  var displays: js.UndefOr[js.Array[Display]] = js.native
  /** The time of device enrollment. */
  var enrollmentTime: js.UndefOr[String] = js.native
  /** If this device was enrolled with an enrollment token with additional data provided, this field contains that data. */
  var enrollmentTokenData: js.UndefOr[String] = js.native
  /** If this device was enrolled with an enrollment token, this field contains the name of the token. */
  var enrollmentTokenName: js.UndefOr[String] = js.native
  /** Detailed information about the device hardware. */
  var hardwareInfo: js.UndefOr[HardwareInfo] = js.native
  /** Hardware status samples in chronological order. This information is only available when hardwareStatusEnabled is true in the device's policy. */
  var hardwareStatusSamples: js.UndefOr[js.Array[HardwareStatus]] = js.native
  /** The last time the device sent a policy compliance report. */
  var lastPolicyComplianceReportTime: js.UndefOr[String] = js.native
  /** The last time the device fetched its policy. */
  var lastPolicySyncTime: js.UndefOr[String] = js.native
  /** The last time the device sent a status report. */
  var lastStatusReportTime: js.UndefOr[String] = js.native
  /**
    * Events related to memory and storage measurements in chronological order. This information is only available when memoryInfoEnabled is true in the
    * device's policy.
    */
  var memoryEvents: js.UndefOr[js.Array[MemoryEvent]] = js.native
  /** Memory information. This information is only available when memoryInfoEnabled is true in the device's policy. */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.native
  /** The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId} */
  var name: js.UndefOr[String] = js.native
  /** Device network information. This information is only available when networkInfoEnabled is true in the device's policy. */
  var networkInfo: js.UndefOr[NetworkInfo] = js.native
  /** Details about policy settings for which the device is not in compliance. */
  var nonComplianceDetails: js.UndefOr[js.Array[NonComplianceDetail]] = js.native
  /** Whether the device is compliant with its policy. */
  var policyCompliant: js.UndefOr[Boolean] = js.native
  /**
    * The name of the policy that is intended to be applied to the device. If empty, the policy with id default is applied. This field may be modified by an
    * update request. The name of the policy is in the form enterprises/{enterpriseId}/policies/{policyId}. It is also permissible to only specify the
    * policyId when updating this field as long as the policyId contains no slashes since the rest of the policy name can be inferred from context.
    */
  var policyName: js.UndefOr[String] = js.native
  /**
    * Power management events on the device in chronological order. This information is only available when powerManagementEventsEnabled is true in the
    * device's policy.
    */
  var powerManagementEvents: js.UndefOr[js.Array[PowerManagementEvent]] = js.native
  /**
    * The previous device names used for the same physical device when it has been enrolled multiple times. The serial number is used as the unique
    * identifier to determine if the same physical device has enrolled previously. The names are in chronological order.
    */
  var previousDeviceNames: js.UndefOr[js.Array[String]] = js.native
  /** Detailed information about the device software. This information is only available when softwareInfoEnabled is true in the device's policy. */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.native
  /**
    * The state that is intended to be applied to the device. This field may be modified by an update request. Note that UpdateDevice only handles toggling
    * between ACTIVE and DISABLED states. Use the delete device method to cause the device to enter the DELETED state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The resource name of the user of the device in the form enterprises/{enterpriseId}/users/{userId}. This is the name of the device account automatically
    * created for this device.
    */
  var userName: js.UndefOr[String] = js.native
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
    def withDisabledReason(value: UserFacingMessage): Self = {
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
    def withDisplays(value: js.Array[Display]): Self = {
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
    def withHardwareInfo(value: HardwareInfo): Self = {
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
    def withHardwareStatusSamples(value: js.Array[HardwareStatus]): Self = {
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
    def withMemoryEvents(value: js.Array[MemoryEvent]): Self = {
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
    def withMemoryInfo(value: MemoryInfo): Self = {
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
    def withNetworkInfo(value: NetworkInfo): Self = {
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
    def withNonComplianceDetails(value: js.Array[NonComplianceDetail]): Self = {
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
    def withPowerManagementEvents(value: js.Array[PowerManagementEvent]): Self = {
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
    def withSoftwareInfo(value: SoftwareInfo): Self = {
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

