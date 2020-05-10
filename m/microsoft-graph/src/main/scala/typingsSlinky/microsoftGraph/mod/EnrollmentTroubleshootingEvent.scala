package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent {
  // Azure AD device identifier.
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Type of the enrollment. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser,
    * appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin,
    * windowsCoManagement.
    */
  var enrollmentType: js.UndefOr[DeviceEnrollmentType] = js.native
  /**
    * Highlevel failure category. Possible values are: unknown, authentication, authorization, accountValidation,
    * userValidation, deviceNotSupported, inMaintenance, badRequest, featureNotSupported, enrollmentRestrictionsEnforced,
    * clientDisconnected, userAbandonment.
    */
  var failureCategory: js.UndefOr[DeviceEnrollmentFailureReason] = js.native
  // Detailed failure reason.
  var failureReason: js.UndefOr[String] = js.native
  // Device identifier created or collected by Intune.
  var managedDeviceIdentifier: js.UndefOr[String] = js.native
  // Operating System.
  var operatingSystem: js.UndefOr[String] = js.native
  // OS Version.
  var osVersion: js.UndefOr[String] = js.native
  // Identifier for the user that tried to enroll the device.
  var userId: js.UndefOr[String] = js.native
}

object EnrollmentTroubleshootingEvent {
  @scala.inline
  def apply(): EnrollmentTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentTroubleshootingEvent]
  }
  @scala.inline
  implicit class EnrollmentTroubleshootingEventOps[Self <: EnrollmentTroubleshootingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnrollmentType(value: DeviceEnrollmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCategory(value: DeviceEnrollmentFailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedDeviceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedDeviceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDeviceIdentifier")(js.undefined)
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
  }
  
}

