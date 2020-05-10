package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppRegistration extends Entity {
  // The app package Identifier
  var appIdentifier: js.UndefOr[MobileAppIdentifier] = js.native
  // App version
  var applicationVersion: js.UndefOr[String] = js.native
  // Zero or more policys already applied on the registered app when it last synchronized with managment service.
  var appliedPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.native
  // Date and time of creation
  var createdDateTime: js.UndefOr[String] = js.native
  // Host device name
  var deviceName: js.UndefOr[String] = js.native
  /**
    * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in
    * all conditions.
    */
  var deviceTag: js.UndefOr[String] = js.native
  // Host device type
  var deviceType: js.UndefOr[String] = js.native
  // Zero or more reasons an app registration is flagged. E.g. app running on rooted device
  var flaggedReasons: js.UndefOr[js.Array[ManagedAppFlaggedReason]] = js.native
  // Zero or more policies admin intended for the app as of now.
  var intendedPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.native
  // Date and time of last the app synced with management service.
  var lastSyncDateTime: js.UndefOr[String] = js.native
  // App management SDK version
  var managementSdkVersion: js.UndefOr[String] = js.native
  // Zero or more long running operations triggered on the app registration.
  var operations: js.UndefOr[js.Array[ManagedAppOperation]] = js.native
  // Operating System version
  var platformVersion: js.UndefOr[String] = js.native
  // The user Id to who this app registration belongs.
  var userId: js.UndefOr[String] = js.native
  // Version of the entity.
  var version: js.UndefOr[String] = js.native
}

object ManagedAppRegistration {
  @scala.inline
  def apply(): ManagedAppRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppRegistration]
  }
  @scala.inline
  implicit class ManagedAppRegistrationOps[Self <: ManagedAppRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppIdentifier(value: MobileAppIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedPolicies(value: js.Array[ManagedAppPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
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
    def withDeviceTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceTag")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withFlaggedReasons(value: js.Array[ManagedAppFlaggedReason]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flaggedReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlaggedReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flaggedReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withIntendedPolicies(value: js.Array[ManagedAppPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intendedPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntendedPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intendedPolicies")(js.undefined)
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
    def withManagementSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementSdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagementSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managementSdkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[ManagedAppOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(js.undefined)
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
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

