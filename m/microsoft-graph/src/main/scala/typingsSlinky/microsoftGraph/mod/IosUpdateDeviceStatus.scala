package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosUpdateDeviceStatus extends Entity {
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[String] = js.native
  // The device id that is being reported.
  var deviceId: js.UndefOr[String] = js.native
  // The device model that is being reported
  var deviceModel: js.UndefOr[String] = js.native
  /**
    * The installation status of the policy report. Possible values are: success, available, idle, unknown, downloading,
    * downloadFailed, downloadRequiresComputer, downloadInsufficientSpace, downloadInsufficientPower,
    * downloadInsufficientNetwork, installing, installInsufficientSpace, installInsufficientPower,
    * installPhoneCallInProgress, installFailed, notSupportedOperation, sharedDeviceUserLoggedInError.
    */
  var installStatus: js.UndefOr[IosUpdatesInstallStatus] = js.native
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.native
  // The device version that is being reported.
  var osVersion: js.UndefOr[String] = js.native
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.native
  // The User id that is being reported.
  var userId: js.UndefOr[String] = js.native
  // The User Name that is being reported
  var userName: js.UndefOr[String] = js.native
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.native
}

object IosUpdateDeviceStatus {
  @scala.inline
  def apply(): IosUpdateDeviceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosUpdateDeviceStatus]
  }
  @scala.inline
  implicit class IosUpdateDeviceStatusOps[Self <: IosUpdateDeviceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDeviceDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDisplayName")(js.undefined)
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
    def withDeviceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallStatus(value: IosUpdatesInstallStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastReportedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastReportedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastReportedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastReportedDateTime")(js.undefined)
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
    def withStatus(value: ComplianceStatus): Self = {
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
  }
  
}

