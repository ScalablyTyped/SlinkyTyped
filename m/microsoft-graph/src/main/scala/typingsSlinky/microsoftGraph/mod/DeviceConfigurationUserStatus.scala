package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfigurationUserStatus extends Entity {
  // Devices count for that user.
  var devicesCount: js.UndefOr[Double] = js.native
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.native
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.native
  // User name of the DevicePolicyStatus.
  var userDisplayName: js.UndefOr[String] = js.native
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.native
}

object DeviceConfigurationUserStatus {
  @scala.inline
  def apply(): DeviceConfigurationUserStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationUserStatus]
  }
  @scala.inline
  implicit class DeviceConfigurationUserStatusOps[Self <: DeviceConfigurationUserStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevicesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicesCount")(js.undefined)
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

